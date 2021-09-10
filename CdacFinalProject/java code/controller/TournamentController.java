package com.sports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sports.entity.Participation;
import com.sports.entity.Tournament;
import com.sports.repository.ParticipationRepo;
import com.sports.services.ParticipationDao;
import com.sports.services.TournamentDao;

@Controller
public class TournamentController {
@Autowired
private TournamentDao dao;

@Autowired
private ParticipationRepo participationRepo;

@Autowired
private ParticipationDao pdao;
	

	@GetMapping("/newtournament")
	public String newTournament(Model model){
		model.addAttribute("tournament",new Tournament());
		return "addTournament";
	}
	
	@PostMapping("/addtournament")
	public String addTournament(@ModelAttribute Tournament tournament){
		
		dao.addTournament(tournament);
		return "redirect:/tournaments?success";
	}
	
	
	@GetMapping("/updateForm/{tId}")
	public String updateForm(@PathVariable int tId,Model model) {
		Tournament tournament=dao.getTournament(tId);
		model.addAttribute("tournament",tournament);
		return "updateTournament";
	}
	
	@GetMapping("/deleteTournament/{tId}")
	public String deleteTournament(@PathVariable int tId) {
		dao.deleteTournament(tId);
		return "redirect:/tournaments?deleted";
	}
	
	@GetMapping("/apply/{tId}")
	public String apply(@PathVariable int tId) {
		Authentication authentication=
				  SecurityContextHolder.getContext().getAuthentication();
				  System.out.println(authentication.getName());
		Participation participation = participationRepo.getParticipation(authentication.getName(), tId);
		System.out.println(participation);
		
		if(participation==null) {
			pdao.insert(new Participation(authentication.getName(), tId));
			return "redirect:/tournaments?applied";
		}
		
		return "redirect:/tournaments?already";
	}
	
	@GetMapping("/participants")
	public String participants(Model model) {
		/* model.addAttribute("plist", pdao.getAll()); */
		model.addAttribute("plist", participationRepo.getAll());
		return "participants";
	}
	
	
}
