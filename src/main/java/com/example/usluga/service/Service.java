package com.example.usluga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.usluga.domain.Klient;
import com.example.usluga.domain.KlientRepository;
import com.example.usluga.domain.Towar;
import com.example.usluga.domain.TowarRepository;

@Component
public class Service {

	@Autowired
	KlientRepository klientRepository;
	
	@Autowired
	TowarRepository towarRepository;
	

	public Klient getKlientId(Long id) {
		Klient klient = klientRepository.findById(id);
		return klient;
	}
	
	public List<Klient> getKlientAll(){
		List<Klient> list = klientRepository.findAll();
		return list;
	}

	public Klient getKlient(String nazwisko) {
		Klient klient = klientRepository.getKlient(nazwisko);
		return klient;
	}
	
	
	public Towar getTowarId(Long id) {
		Towar  towar= towarRepository.findById(id);
		return towar;
	}
	
	public List<Towar> getTowarAll(){
		List<Towar> list = towarRepository.findAll();
		return list;
	}

	public Towar getTowar(String nazwa) {
		Towar towar = towarRepository.getTowar(nazwa);
		return towar;
	}
	
	
	
	
}
