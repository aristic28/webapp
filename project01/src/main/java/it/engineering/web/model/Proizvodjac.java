package it.engineering.web.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the proizvodjac database table.
 * 
 */
@Entity
@NamedQuery(name="Proizvodjac.findAll", query="SELECT p FROM Proizvodjac p")
public class Proizvodjac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long pib;

	private String adresa;

	private BigInteger maticniBroj;

	//bi-directional many-to-one association to Mesto
	@ManyToOne
	@JoinColumn(name="mestoPtt")
	private Mesto mesto;

	public Proizvodjac() {
	}
	
	public Proizvodjac(long pib, String adresa, BigInteger maticniBroj, Mesto mesto) {
		super();
		this.pib = pib;
		this.adresa = adresa;
		this.maticniBroj = maticniBroj;
		this.mesto = mesto;
	}


	public long getPib() {
		return this.pib;
	}

	public void setPib(long pib) {
		this.pib = pib;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public BigInteger getMaticniBroj() {
		return this.maticniBroj;
	}

	public void setMaticniBroj(BigInteger maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public Mesto getMesto() {
		return this.mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

}