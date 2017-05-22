package de.htwg.gib.teamprojekt.terminal;

public class CardReaderController {

	EgkData egkData;

	public CardReaderController() {
		createDummyData();
	}

	public EgkData getEgkData() {
		return egkData;
	}

	private void createDummyData() {
		egkData = new EgkData();
		egkData.setId("12345");
		egkData.setNachname("Stein");
		egkData.setVorname("Emanuel");
		egkData.setStrasse("Burgenweg");
		egkData.setHausnummer("15");
		egkData.setPostleitzahl("88291");
		egkData.setOrt("Bergdorfen");
		egkData.setVersichtertennummer("773826145");
		egkData.setVersichertenverhaeltnis(1);
	}

}
