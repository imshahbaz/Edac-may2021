package com.sports.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sports.entity.Member;
import com.sports.repository.MemberShip;
@Service
public class MemberDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private MemberShip memberShip;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Member member = memberShip.findMemberByEmail(username);
		/*
		 * System.out.println(member); MemberDetails details=new MemberDetails(member);
		 * System.out.println(details.getUsername());
		 * System.out.println(details.getPassword()); return new
		 * User(details.getUsername(),details.getPassword(),details.getAuthorities());
		 */
		return new MemberDetails(member);
	}

}
