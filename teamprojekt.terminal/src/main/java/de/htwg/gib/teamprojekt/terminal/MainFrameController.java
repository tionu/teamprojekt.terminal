package de.htwg.gib.teamprojekt.terminal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.WriterException;
import com.journaldev.qrcode.generator.GenerateQRCode;

public class MainFrameController {

	private MainFrame mainFrame;
	private CardReaderController cardReaderController;

	public MainFrameController() {
		super();
		this.cardReaderController = new CardReaderController();
		this.mainFrame = new MainFrame();
		initialize();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameController mainFrameController = new MainFrameController();
					mainFrameController.getMainFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	private void initialize() {
		mainFrame.getBtnEgkEinlesen().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ImageIcon qrCode = new ImageIcon();

				EgkData egkData = cardReaderController.getEgkData();

				ObjectMapper mapper = new ObjectMapper();

				try {
					System.out.println(mapper.writeValueAsString(egkData));

					mainFrame.getLblEgkData().setText("<html>" + egkData.getNachname() + ", " + egkData.getVorname()
							+ "<br>Vers.-Nr.: " + egkData.getVersichtertennummer() + "</html>");

					String ressourceId = egkData.getId();

					qrCode = new ImageIcon(GenerateQRCode.createQRImage(ressourceId));
				} catch (WriterException e1) {
					e1.printStackTrace();
				} catch (JsonProcessingException e2) {
					e2.printStackTrace();
				}
				mainFrame.getLblQrCode().setIcon(qrCode);

			}
		});

	}

}
