package com.sports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sports.entity.Member;
import com.sports.repository.MemberShip;
import com.sports.services.MemberDao;

@Controller
public class RegisterationController {
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private MemberShip memberShip;

	
	@GetMapping("/register")
	public String register(Model model) {
		Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
		if(authentication==null || authentication instanceof AnonymousAuthenticationToken) {
		
		model.addAttribute("member",new Member());
		return "register";}
		
		else return "redirect:/";
	}
	
	
	@PostMapping("/registermember")
	public String register(@ModelAttribute Member member) {
		
		if(!memberShip.existsById(member.getEmail())) {
		
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		member.setPass(bCryptPasswordEncoder.encode(member.getPass()));
		dao.addMember(member);
		return "redirect:/login?success";}
		else 
			return "redirect:/login?already";
	}	
}
