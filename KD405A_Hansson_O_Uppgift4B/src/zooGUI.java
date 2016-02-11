import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class zooGUI extends JFrame {
	
	
	private ArrayList<Animal> myAnimals = new ArrayList();{
	
	myAnimals.add(new Dog("Canis Lupus", "blufsiblufs", 80, false));
	myAnimals.add(new Dog("Canis Lupus", "mufsimugs", 9, true));
	myAnimals.add(new Cat("Lynx Lynx", "mjau mjau", 80, 120));
	myAnimals.add(new Snake("serpentinus snapeus", false));
	myAnimals.add(new Snake("stor fet kobra", true));
	
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zooGUI frame = new zooGUI();
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
	public zooGUI() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 22, 379, 185);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		for( Animal animals:myAnimals){
			textArea.append(animals.getInfo() + "\n");
		}
	}

}
