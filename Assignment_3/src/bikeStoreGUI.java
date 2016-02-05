import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class bikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JLabel txtColor;
	private JLabel txtSize;
	private JLabel txtPrice;
	private JTextField Color;
	private JTextField Size;
	private JTextField Price;
	
	bikeStore myBikeStore = new bikeStore();
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bikeStoreGUI frame = new bikeStoreGUI();
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
	public bikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 19, 153, 228);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JButton btnAddBike = new JButton("Add bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bikeStore.addBike(Color.getText(), Integer.parseInt(Size.getText()), Integer.parseInt(Price.getText()));
				textArea.setText(myBikeStore.getAllBikes());
				Color.setText("");
				Price.setText("");
				Size.setText("");
			}
		});
		btnAddBike.setBounds(267, 218, 117, 29);
		contentPane.add(btnAddBike);
		
		txtColor = new JLabel();
		txtColor.setEnabled(false);
		txtColor.setText("Color:");
		txtColor.setBounds(188, 25, 90, 26);
		contentPane.add(txtColor);
		
		txtSize = new JLabel();
		txtSize.setText("Size:");
		txtSize.setEnabled(false);
		txtSize.setBounds(189, 63, 90, 26);
		contentPane.add(txtSize);
		
		txtPrice = new JLabel();
		txtPrice.setText("Price:");
		txtPrice.setEnabled(false);
		txtPrice.setBounds(189, 101, 90, 26);
		contentPane.add(txtPrice);
		
		Color = new JTextField();
		Color.setBounds(314, 25, 130, 26);
		contentPane.add(Color);
		Color.setColumns(10);
		
		Size = new JTextField();
		Size.setColumns(10);
		Size.setBounds(314, 63, 130, 26);
		contentPane.add(Size);
		
		Price = new JTextField();
		Price.setColumns(10);
		Price.setBounds(314, 101, 130, 26);
		contentPane.add(Price);
	}
}
