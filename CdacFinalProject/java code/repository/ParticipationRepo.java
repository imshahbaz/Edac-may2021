package com.sports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sports.entity.Participation;
@Repository
public interface ParticipationRepo extends JpaRepository<Participation, Integer>{

	@Query(value="select * from participation p where p.email=:email and p.t_id=:t_id",nativeQuery = true)
	Participation getParticipation(@Param("email") String email,@Param("t_id") int tId);
	
	@Query(value="select * from participation p order by p.email asc",nativeQuery = true)
	List<Participation> getAll();
	
}
