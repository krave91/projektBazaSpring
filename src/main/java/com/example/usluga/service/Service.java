package com.example.usluga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.usluga.domain.Klient;
import com.example.usluga.domain.KlientRepository;

@Component
public class Service {

	@Autowired
	KlientRepository klientRepository;

	public Klient getId(Long id) {
		Klient klient = klientRepository.findById(id);
		return klient;
	}
	
	public List<Klient> getAll(){
		List<Klient> list = klientRepository.findAll();
		return list;
	}

	public Klient getKlient(String nazwisko) {
		Klient klient = klientRepository.getKlient(nazwisko);
		return klient;
	}
}
