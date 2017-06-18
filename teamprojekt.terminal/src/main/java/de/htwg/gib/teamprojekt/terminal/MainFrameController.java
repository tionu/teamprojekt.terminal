package de.htwg.gib.teamprojekt.terminal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.WriterException;
import com.journaldev.qrcode.generator.GenerateQRCode;

import de.gecko.egkfeuer.model.EgkPatient;

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

				EgkPatient egkData = cardReaderController.getEgkPatient();

				ObjectMapper mapper = new ObjectMapper();

				DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
				mapper.setDateFormat(df);

				try {
					System.out.println(mapper.writeValueAsString(egkData));

					mainFrame.getLblEgkData().setText("<html>" + egkData.getSurname() + ", " + egkData.getGivenName()
							+ "<br>Vers.-Nr.: " + egkData.getHealthInsuranceNumber() + "</html>");
					
					try {
						URL url = new URL("http://jira.studipark.de:8080/teamprojekt.relay/api/terminal");
						URLConnection connection = url.openConnection();
						connection.setDoOutput(true);
						connection.setRequestProperty("Content-Type", "application/json");
						connection.setConnectTimeout(5000);
						connection.setReadTimeout(5000);
						OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
						out.write(mapper.writeValueAsString(egkData));
						out.close();
						
						BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
						
						while (in.ready()){
							System.out.println(in.readLine());
						}
							
						in.close();
						
					} catch (Exception e3){
						e3.printStackTrace();
					}

					String ressourceId = "not yet know";

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
