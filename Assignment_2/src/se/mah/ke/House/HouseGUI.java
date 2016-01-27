import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	private ArrayList<House> HouseCity = new ArrayList<House>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 6, 391, 219);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);	
		
		House myHouse1 = new House(1990, 26);
		House myHouse2 = new House(1801, 350);
		House myHouse3 = new House(2010, 170);
		
		System.out.println("house 1 is built " + myHouse1.getYearBuilt() +  " and is " + myHouse1.getSize() + " m2 big");
		System.out.println("house 2 is built " + myHouse2.getYearBuilt() +  " and is " + myHouse2.getSize() + " m2 big");
		System.out.println("house 3 is built " + myHouse3.getYearBuilt() +  " and is " + myHouse3.getSize() + " m2 big");
		
		textArea.append("uppgift 1.2" + "\n" + "\n");
		textArea.append("house 1 is built " + myHouse1.getYearBuilt() +  " and is " + myHouse1.getSize() + " m2 big" + "\n");
		textArea.append("house 2 is built " + myHouse2.getYearBuilt() +  " and is " + myHouse2.getSize() + " m2 big" + "\n");
		textArea.append("house 3 is built " + myHouse3.getYearBuilt() +  " and is " + myHouse3.getSize() + " m2 big" + "\n" + "\n");
		
		textArea.append("Uppgift 1.3" + "\n" + "\n");
		
		myHouses = new House[10];
		
		myHouses[0] = new House(1991,131);
		myHouses[1] = new House(1992,130);
		myHouses[2] = new House(1993,129);
		myHouses[3] = new House(1994,128);
		myHouses[4] = new House(1995,127);
		myHouses[5] = new House(1996,126);
		myHouses[6] = new House(1997,125);
		myHouses[7] = new House(1998,124);
		myHouses[8] = new House(1999,123);
		myHouses[9] = new House(2000,123);
		
		for(int i = 0; i < 10; i++){
			textArea.append("house #" + (i +1) + " is built " + String.valueOf(myHouses[i].getYearBuilt() + " and is " + String.valueOf(myHouses[i].getSize()) + " m2 big" + "\n"));
		
	}
		
		textArea.append( "\n" + "Uppgift 1.4" + "\n" + "\n");
		Random rand = new Random ();
		
		for(int i = 0; i < 100; i++){
			int size = rand.nextInt(990) + 10;
			int yearBuilt = rand.nextInt(215) + 1800;
			
			HouseCity.add(new House(yearBuilt,size));
		}
		for (House Hus:HouseCity){
			textArea.append("House is built " + Hus.getYearBuilt() + " and is " + Hus.getSize() + " m2 big" + "\n");
		}
}}
