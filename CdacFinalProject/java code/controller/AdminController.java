package com.sports.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
public class AdminController {
	
	@Autowired
	private MemberDao dao;
	
	/*
	 * @Autowired private MemberDao dao2;
	 */
	@Autowired
	private MemberShip memberShip;
	
	@GetMapping("/addAdmin")
	public String addAdmin(Model model) {
		model.addAttribute("member",new Member());
		//dao2.addMember(new Member());
		return "addAdmin";
	}
	
	@PostMapping("/addnew")
	public String addnew(@ModelAttribute Member member) {
		
		if(!memberShip.existsById(member.getEmail())) {
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		member.setPass(bCryptPasswordEncoder.encode(member.getPass()));
		dao.addMember(member);
		return "redirect:/addAdmin?success";}
		else
			return "redirect:/addAdmin?already";
		
	}
	
}
