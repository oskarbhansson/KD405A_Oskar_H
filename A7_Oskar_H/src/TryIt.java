import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.MEDEA_3);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//letter O
		px.setPixel(20, 20, Color.RED);
		px.setPixel(20, 21, Color.RED);
		px.setPixel(20, 22, Color.RED);
		px.setPixel(20, 23, Color.RED);
		px.setPixel(20, 24, Color.RED);
		px.setPixel(20, 25, Color.RED);
		
		px.setPixel(21, 25, Color.RED);
		px.setPixel(22, 25, Color.RED);
		px.setPixel(23, 25, Color.RED);
		px.setPixel(24, 25, Color.RED);
		px.setPixel(25, 25, Color.RED);
		px.setPixel(26, 25, Color.RED);
		px.setPixel(27, 25, Color.RED);
		px.setPixel(28, 25, Color.RED);
		px.setPixel(29, 25, Color.RED);
		px.setPixel(30, 25, Color.RED);
		
		px.setPixel(30, 20, Color.RED);
		px.setPixel(30, 21, Color.RED);
		px.setPixel(30, 22, Color.RED);
		px.setPixel(30, 23, Color.RED);
		px.setPixel(30, 24, Color.RED);
		px.setPixel(30, 25, Color.RED);
		
		px.setPixel(21, 20, Color.RED);
		px.setPixel(22, 20, Color.RED);
		px.setPixel(23, 20, Color.RED);
		px.setPixel(24, 20, Color.RED);
		px.setPixel(25, 20, Color.RED);
		px.setPixel(26, 20, Color.RED);
		px.setPixel(27, 20, Color.RED);
		px.setPixel(28, 20, Color.RED);
		px.setPixel(29, 20, Color.RED);
		px.setPixel(30, 20, Color.RED);
		
		
		//dot
		px.setPixel(30, 27, Color.RED);
		
		
		//letter H
		px.setPixel(21, 29, Color.RED);
		px.setPixel(22, 29, Color.RED);
		px.setPixel(23, 29, Color.RED);
		px.setPixel(24, 29, Color.RED);
		px.setPixel(25, 29, Color.RED);
		px.setPixel(26, 29, Color.RED);
		px.setPixel(27, 29, Color.RED);
		px.setPixel(28, 29, Color.RED);
		px.setPixel(29, 29, Color.RED);
		px.setPixel(30, 29, Color.RED);
		
		px.setPixel(26, 29, Color.RED);
		px.setPixel(26, 30, Color.RED);
		px.setPixel(26, 31, Color.RED);
		px.setPixel(26, 32, Color.RED);
		px.setPixel(26, 33, Color.RED);
		px.setPixel(26, 34, Color.RED);
		
		px.setPixel(21, 34, Color.RED);
		px.setPixel(22, 34, Color.RED);
		px.setPixel(23, 34, Color.RED);
		px.setPixel(24, 34, Color.RED);
		px.setPixel(25, 34, Color.RED);
		px.setPixel(26, 34, Color.RED);
		px.setPixel(27, 34, Color.RED);
		px.setPixel(28, 34, Color.RED);
		px.setPixel(29, 34, Color.RED);
		px.setPixel(30, 34, Color.RED);
		
		
		
		
		
		
		
		
	}

}
