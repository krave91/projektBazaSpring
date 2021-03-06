package com.example.usluga.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "klient")
public class Klient {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "imie", length = 45)
	private String imie;

	@Column(name = "nazwisko", length = 45)
	private String nazwisko;
	
	@OneToMany(mappedBy="klient2")
	private List<Transakcja> transakcje;
}
