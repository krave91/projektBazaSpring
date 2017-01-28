package com.example.usluga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usluga.domain.Klient;
import com.example.usluga.domain.Towar;
import com.example.usluga.domain.Transakcja;
import com.example.usluga.service.Service;

@RequestMapping("/controller")
@RestController
public class Controller {
	@Autowired
	Service service;

	@RequestMapping("/klient/id/{id}")
	public Klient pobierzIdKlienta(@PathVariable("id") Long id) {
		Klient result = service.getKlientId(id);
		return result;
	}
	
	@RequestMapping("/klient/all")
	public List<Klient> pobierzWszystkichKlientow() {
		List<Klient> result = service.getKlientAll();
		return result;
	}
	
	@RequestMapping("/klient/nazwisko/{nazwisko}")
	public Klient pobierzNazwiskoKlienta(@PathVariable("nazwisko") String nazwisko) {
		Klient result = service.getKlient(nazwisko);
		return result;
	}
	
	@RequestMapping("/towar/id/{id}")
	public Towar pobierzIdTowaru(@PathVariable("id") Long id) {
		Towar result = service.getTowarId(id);
		return result;
	}
	
	@RequestMapping("/towar/all")
	public List<Towar> pobierzWszystkieTowary() {
		List<Towar> result = service.getTowarAll();
		return result;
	}
	
	@RequestMapping("/towar/nazwa/{nazwa}")
	public Towar pobierzNazweTowaru(@PathVariable("nazwa") String nazwa) {
		Towar result = service.getTowar(nazwa);
		return result;
	}
	
	
	@RequestMapping("/transakcja/id/{id}")
	public List<Transakcja> pobierzTransakcjeKlienta(@PathVariable("id") Long id) {
		List<Transakcja> result = service.getTransactionList(id);
		return result;
	}
	
//	@RequestMapping("/transakcja/all")
//	public List<Transakcja> pobierzWszystkieTransakcje() {
//		List<Transakcja> result = service.getTransactionAll();
//		return result;
//	}
//	
//	@RequestMapping("/transakcja/idKlienta/{klientId}")
//	public Transakcja pobierzTransakcjeKlienta(@PathVariable("klientId") Long klientId) {
//		Transakcja result = service.getKlientTransaction(klientId);
//		return result;
//	}
	

}
