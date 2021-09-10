package com.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.entity.Tournament;
@Repository
public interface TournamentRepo extends JpaRepository<Tournament, Integer> {

}
