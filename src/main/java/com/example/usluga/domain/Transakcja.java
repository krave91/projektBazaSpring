package com.example.usluga.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "transakcja")
public class Transakcja {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name="klientId")
	private Klient klient2;

//	@Column(name = "towarId")
//	private Long towarId;
//	
	@Column(name = "ilosc")
	private int ilosc;
}
