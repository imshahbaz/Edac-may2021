package com.sports.services;

import java.util.List;

import com.sports.entity.Tournament;

public interface TournamentDao {

	List<Tournament> getAllTournaments();
	
	void addTournament(Tournament tournament);
	
	Tournament getTournament(int tId);
	
	void deleteTournament(int tId);
}
