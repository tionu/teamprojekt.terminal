package de.htwg.gib.teamprojekt.terminal;

import java.util.Date;

public class EgkData {

	private String id;

	private String nachname;
	private String vorname;
	
	private Date geburtsdatum;

	private String strasse;
	private String hausnummer;
	private String postleitzahl;
	private String ort;

	
	private String versichertennummer;
	private String versichertenstatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getVersichertennummer() {
		return versichertennummer;
	}

	public void setVersichertennummer(String versichtertennummer) {
		this.versichertennummer = versichtertennummer;
	}

	public String getVersichertenstatus() {
		return versichertenstatus;
	}

	public void setVersichertenstatus(String versichertenverhaeltnis) {
		this.versichertenstatus = versichertenverhaeltnis;
	}

}
