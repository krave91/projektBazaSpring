package com.example.usluga.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransakcjaRepository extends CrudRepository<Transakcja, Long>{
	public Transakcja findById(@Param("id") Long id);
	
	public List<Transakcja> findAll();
	
	@Query("select tran from Transakcja tran where tran.klient2.id= :klientId")
	public List<Transakcja> getKlientTransaction(@Param("klientId") Long klientId);

}
