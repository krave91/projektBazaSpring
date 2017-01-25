package com.example.usluga.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TowarRepository extends CrudRepository<Towar, Long> {
	
	public Towar findById(@Param("id") Long id);
	
	public List<Towar> findAll();
	
	@Query("select tow from Towar tow where tow.nazwa= :nazwa")
	public Towar getTowar(@Param("nazwa") String nazwa);
}
