import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {
	
	private ClockLogic clocklogic;
	JPanel contentPane;
	JTextField AlarmHour;
	JTextField AlarmMinute;
	JLabel lblClock;
	JLabel lblAlarmArea;
	JLabel lblVakna;
	private JLabel lblAlarmTime;
	
	/*public void setTimeOnLabel(String time){
		lblClock.setText(time);
		
		}*/
	
	/*public void setAlarmOnLabel(String alarmTime){
		lblAlarmArea.setText(alarmTime);
	}*/
	
	
	/**method for the alarm*/
	public void activateAlarm(boolean activate){
		
		if (activate == true){
			System.out.println("VAKNA!");
			lblVakna.setText("VAKNA!!!");
			
			
contentPane.setBackground(Color.RED);




		}
else{
	contentPane.setBackground(new Color(238,238,238));
	lblVakna.setText("");
	
	
	lblAlarmArea.setText("");
	clocklogic.setAlarm(-1, -1);
}
		
	
		
		
	}




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setTitle("AlarmClock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblClock = new JLabel("");
		lblClock.setFont(new Font("Origin", Font.PLAIN, 70));
		lblClock.setBounds(6, 22, 340, 142);
		contentPane.add(lblClock);
		
		
		
		JLabel lblHour = new JLabel("Hour:");
		lblHour.setBounds(6, 242, 41, 16);
		contentPane.add(lblHour);
		
		AlarmHour = new JTextField();
		AlarmHour.setBounds(48, 237, 61, 26);
		contentPane.add(AlarmHour);
		AlarmHour.setColumns(10);
		
		JLabel lblMinutes = new JLabel("Minutes:");
		lblMinutes.setBounds(121, 242, 61, 16);
		contentPane.add(lblMinutes);
		
		AlarmMinute = new JTextField();
		AlarmMinute.setBounds(194, 237, 61, 26);
		contentPane.add(AlarmMinute);
		AlarmMinute.setColumns(10);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				
				int hours = Integer.parseInt(AlarmHour.getText());
				int minutes = Integer.parseInt(AlarmMinute.getText());
				clocklogic.setAlarm(hours, minutes);
				
				AlarmMinute.setText("");
				AlarmHour.setText("");
				
			}
		});
		btnSetAlarm.setBounds(286, 237, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clocklogic.clearAlarm();
			}
		});
		btnClearAlarm.setBounds(467, 237, 117, 29);
		contentPane.add(btnClearAlarm);
		
		lblAlarmArea = new JLabel("");
		lblAlarmArea.setBounds(413, 181, 246, 16);
		contentPane.add(lblAlarmArea);
		
		lblAlarmTime = new JLabel("Alarm Time:");
		lblAlarmTime.setBounds(297, 181, 106, 16);
		contentPane.add(lblAlarmTime);
		
		lblVakna = new JLabel("");
		lblVakna.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblVakna.setBounds(404, 20, 269, 127);
		contentPane.add(lblVakna);
		
		clocklogic = new ClockLogic(this);
		
	}
	
	
}
