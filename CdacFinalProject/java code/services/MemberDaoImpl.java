package com.sports.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.entity.Member;
import com.sports.repository.MemberShip;

@Service
public class MemberDaoImpl implements MemberDao{
	@Autowired
	private MemberShip memberShip;
	
	public void addMember(Member member) {
		
		this.memberShip.save(member);
	}

	@Override
	public boolean isMembershipActive(String email) {
		Member member=memberShip.getById(email);
		
		return member.isMembership();
		
	}

	@Override
	public void active( boolean membership,String email) {
	
		Member member=memberShip.getById(email);
		member.setMembership(membership);
		memberShip.save(member);
	}

	
}
