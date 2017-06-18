package de.htwg.gib.teamprojekt.terminal;

import de.gecko.egkfeuer.model.EgkPatient;
import de.gecko.egkfeuer.model.ekg.DelegatingToPatientConverter;
import de.gecko.egkfeuer.model.ekg.v51.ToPatientConverterV51;
import de.gecko.egkfeuer.model.ekg.v52.ToPatientConverterV52;
import de.gecko.egkfeuer.service.CardReaderService;
import de.gecko.egkfeuer.service.CardReaderServiceImpl;
import de.gecko.egkfeuer.service.CardTerminalsServiceImpl;

public class CardReaderController {

	public EgkPatient getEgkPatient() {
		CardReaderService cardReaderService = new CardReaderServiceImpl(
				new DelegatingToPatientConverter(new ToPatientConverterV51(), new ToPatientConverterV52()),
				new CardTerminalsServiceImpl());
		return cardReaderService.read();
	}

}
