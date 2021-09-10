package com.sports.services;


import com.sports.entity.Member;

public interface MemberDao{

	void addMember(Member member);
	
	boolean isMembershipActive(String email);
	
	
	void active(boolean membership,String email);
	
}
