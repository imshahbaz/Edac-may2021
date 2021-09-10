package com.sports.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.entity.Tournament;
import com.sports.repository.TournamentRepo;

@Service
public class TournamentDaoImpl implements TournamentDao {
	@Autowired
	private TournamentRepo repo;
	
	@Override
	public List<Tournament> getAllTournaments() {
		return repo.findAll();
	}

	@Override
	public void addTournament(Tournament tournament) {
		repo.save(tournament);
		
	}

	@Override
	public Tournament getTournament(int tId) {
		return repo.getById(tId);
	}

	@Override
	public void deleteTournament(int tId) {
		repo.deleteById(tId);
		
	}
	
	

}
