package com.sports.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.entity.Participation;
import com.sports.repository.ParticipationRepo;

@Service
public class ParticipationDaoImpl implements ParticipationDao {
	
	@Autowired
	private ParticipationRepo participationRepo;

	@Override
	public void insert(Participation participation) {
		participationRepo.save(participation);

	}

	

}
