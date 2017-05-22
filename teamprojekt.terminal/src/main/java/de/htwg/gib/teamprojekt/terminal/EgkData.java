package de.htwg.gib.teamprojekt.terminal;

public class EgkData {

	private String id;

	private String Nachname;
	private String Vorname;

	private String strasse;
	private String hausnummer;
	private String postleitzahl;
	private String ort;

	private String versichtertennummer;
	private int versicherungsverhaeltnis;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
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

	public String getVersichtertennummer() {
		return versichtertennummer;
	}

	public void setVersichtertennummer(String versichtertennummer) {
		this.versichtertennummer = versichtertennummer;
	}

	public int getVersicherungsverhaeltnis() {
		return versicherungsverhaeltnis;
	}

	public void setVersicherungsverhaeltnis(int versichertenverhaeltnis) {
		this.versicherungsverhaeltnis = versichertenverhaeltnis;
	}

}
