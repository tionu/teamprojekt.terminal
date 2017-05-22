package de.htwg.gib.teamprojekt.terminal;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnEgkEinlesen;
	private JLabel lblQrCode;
	private JLabel lblEgkData;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setBackground(Color.WHITE);
		setTitle("eGK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 224);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));

		btnEgkEinlesen = new JButton("eGK einlesen");
		contentPane.add(btnEgkEinlesen, BorderLayout.SOUTH);

		lblQrCode = new JLabel("");
		lblQrCode.setBackground(Color.WHITE);
		lblQrCode.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblQrCode, BorderLayout.CENTER);

		lblEgkData = new JLabel("");
		contentPane.add(lblEgkData, BorderLayout.NORTH);
	}

	public JButton getBtnEgkEinlesen() {
		return btnEgkEinlesen;
	}

	public JLabel getLblQrCode() {
		return lblQrCode;
	}

	public JLabel getLblEgkData() {
		return lblEgkData;
	}
}
