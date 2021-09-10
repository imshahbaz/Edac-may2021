package com.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.entity.Member;

@Repository
public interface MemberShip extends JpaRepository<Member, String>{

	//Member findByEmail(String email);
	
	Member findMemberByEmail(String email);
	
}
