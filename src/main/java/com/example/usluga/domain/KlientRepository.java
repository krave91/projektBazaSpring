package com.example.usluga.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends CrudRepository<Klient, Long> {
	public Klient findById(@Param("id") Long id);

	
	public List<Klient> findAll();
	
	@Query("select k from Klient k where k.nazwisko= :nazwisko")
	public Klient getKlient(@Param("nazwisko") String nazwisko);
	
}
