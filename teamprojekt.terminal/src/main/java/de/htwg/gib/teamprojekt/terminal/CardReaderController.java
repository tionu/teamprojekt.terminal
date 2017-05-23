package de.htwg.gib.teamprojekt.terminal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		egkData.setId("Bb4LtVF8");
		egkData.setNachname("Gr�fin");
		egkData.setVorname("Stephanie Tatjana");
		try {
			egkData.setGeburtsdatum(new SimpleDateFormat("dd.MM.yyyy").parse("16.09.1993"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		egkData.setStrasse("Burgenweg");
		egkData.setHausnummer("15c");
		egkData.setPostleitzahl("88291");
		egkData.setOrt("Bergdorfen");
		egkData.setVersichertennummer("X110345360");
		egkData.setVersichertenstatus("3");
	}

}
