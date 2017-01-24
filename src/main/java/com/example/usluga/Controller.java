package com.example.usluga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usluga.domain.Klient;
import com.example.usluga.service.Service;

@RequestMapping("/controller")
@RestController
public class Controller {
	@Autowired
	Service service;

	@RequestMapping("/id/{id}")
	public Klient pobierzId(@PathVariable("id") Long id) {
		Klient result = service.getId(id);
		return result;
	}
	
	@RequestMapping("/all")
	public List<Klient> pobierzWszystkich() {
		List<Klient> result = service.getAll();
		return result;
	}
	
	@RequestMapping("/nazwisko/{nazwisko}")
	public Klient pobierzNazwisko(@PathVariable("nazwisko") String nazwisko) {
		Klient result = service.getKlient(nazwisko);
		return result;
	}
	

}
