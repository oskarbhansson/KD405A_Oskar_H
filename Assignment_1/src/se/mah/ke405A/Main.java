package se.mah.ke405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel txtNamn;
	private JLabel txtNamn_1;
	private JLabel txtPersonnummer;
	private JLabel txtAdress;
	private JLabel txtTelefonnummer;
	private JTextField txtWalterWhite;
	private JTextField textField;
	private JTextField txtRodeoDrive;
	private JTextField textField_1;
	private JTextField txtHeisenbergkingpincom;
	private JLabel txtMedlemmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 408);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		mnMedlem.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		mnHjlp.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp ...");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 42, 131, 232);
		contentPane.add(scrollPane);
		
		JTextArea txtrVdfsvsdVgdsvdsVdsvdsvs = new JTextArea();
		txtrVdfsvsdVgdsvdsVdsvdsvs.setEditable(false);
		txtrVdfsvsdVgdsvdsVdsvdsvs.setText("Walter White\nFlynn\nGus Fring\nJesse Pinkman");
		scrollPane.setColumnHeaderView(txtrVdfsvsdVgdsvdsVdsvdsvs);
		
		txtNamn = new JLabel();
		txtNamn.setForeground(Color.WHITE);
		txtNamn.setText("E-post:");
		txtNamn.setBounds(164, 248, 130, 26);
		contentPane.add(txtNamn);
		
		txtNamn_1 = new JLabel();
		txtNamn_1.setForeground(Color.WHITE);
		txtNamn_1.setBackground(Color.LIGHT_GRAY);
		txtNamn_1.setText("Namn:");
		txtNamn_1.setBounds(164, 96, 130, 26);
		contentPane.add(txtNamn_1);
		
		txtPersonnummer = new JLabel();
		txtPersonnummer.setForeground(Color.WHITE);
		txtPersonnummer.setText("Personnummer:");
		txtPersonnummer.setBounds(164, 134, 130, 26);
		contentPane.add(txtPersonnummer);
		
		txtAdress = new JLabel();
		txtAdress.setForeground(Color.WHITE);
		txtAdress.setText("Adress:");
		txtAdress.setBounds(164, 172, 130, 26);
		contentPane.add(txtAdress);
		
		txtTelefonnummer = new JLabel();
		txtTelefonnummer.setForeground(Color.WHITE);
		txtTelefonnummer.setText("Telefonnummer:");
		txtTelefonnummer.setBounds(164, 210, 130, 26);
		contentPane.add(txtTelefonnummer);
		
		txtWalterWhite = new JTextField();
		txtWalterWhite.setForeground(Color.BLACK);
		txtWalterWhite.setText("Walter White");
		txtWalterWhite.setBounds(306, 96, 130, 26);
		contentPane.add(txtWalterWhite);
		txtWalterWhite.setColumns(10);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setText("1961");
		textField.setBounds(306, 134, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtRodeoDrive = new JTextField();
		txtRodeoDrive.setForeground(Color.BLACK);
		txtRodeoDrive.setText("101 Rodeo Drive, Alberquerque, NM");
		txtRodeoDrive.setBounds(306, 172, 260, 26);
		contentPane.add(txtRodeoDrive);
		txtRodeoDrive.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setText("555-11 22 33 44 ");
		textField_1.setBounds(306, 210, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtHeisenbergkingpincom = new JTextField();
		txtHeisenbergkingpincom.setForeground(Color.BLACK);
		txtHeisenbergkingpincom.setText("Heisenberg@kingpin.com");
		txtHeisenbergkingpincom.setBounds(306, 248, 201, 26);
		contentPane.add(txtHeisenbergkingpincom);
		txtHeisenbergkingpincom.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/oskarhansson/Documents/Interaktionsdesign/Programmering 2/walter-white.png"));
		label.setBounds(448, 6, 195, 167);
		contentPane.add(label);
		
		txtMedlemmar = new JLabel();
		txtMedlemmar.setText("Medlemmar");
		txtMedlemmar.setBounds(6, 6, 130, 26);
		contentPane.add(txtMedlemmar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/Users/oskarhansson/Documents/Interaktionsdesign/Programmering 2/GoldsGym_Logo.png"));
		label_1.setBounds(504, 230, 139, 128);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("/Users/oskarhansson/Documents/Interaktionsdesign/Programmering 2/new_gg_logo.png"));
		label_2.setBounds(134, 6, 373, 98);
		contentPane.add(label_2);
	}
}
