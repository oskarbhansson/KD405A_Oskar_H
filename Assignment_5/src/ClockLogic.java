import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Calendar;




public class ClockLogic {
	

	
	
	private int alarmHour;
	private int alarmMinute;
	private DigitalClockGUI DCGUI;
	
	
	

	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		
		this.DCGUI = digitalClockGUI;
		ClockThread CT = new ClockThread();
		CT.start();
		
		}
	
	private class ClockThread extends Thread{
		@Override
		public void run(){
			DecimalFormat DF = new DecimalFormat("00");
			
			while(true){
				
				/**gets the time from computer */
				
				Calendar cal = Calendar.getInstance();
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				int minutes = cal.get(Calendar.MINUTE);
				int seconds = cal.get(Calendar.SECOND);
				
				/**sets time in GUI*/
				
				String time = DF.format(hour)+":"+ DF.format(minutes) + ":" + DF.format(seconds);
					//System.out.println(time);
				
				DCGUI.lblClock.setText(time);
				
				/**activates the alarm */
				
				if(hour == alarmHour && minutes == alarmMinute && seconds == 00){
					DCGUI.activateAlarm(true);
					
					
				}
				
		
		try {
			Thread.sleep(1000);
			} 
		catch (InterruptedException e) {
			e.printStackTrace();
			
			
			}
	
			}
		}
	}
	/** method for setting the alarm, only works between hours 0-23 and minutes 0-59*/
	public void setAlarm(int hours, int minute){
		
		
		
		
		if(alarmHour <=23){
		alarmHour = hours;
		}
		else{
			
			alarmHour = -1;
			
		}
		if(alarmMinute <=59){
		alarmMinute = minute;
		}
		else{
			
			alarmMinute = -1;
			
		}
		
		/**sets alarmtime on GUI if correct, else displays "OUT OF BOUNDS"*/
		String alarmTime = DCGUI.AlarmHour.getText() + " : " + DCGUI.AlarmMinute.getText();
		
		if (hours <=24 && minute <=59){
		DCGUI.lblAlarmArea.setText(alarmTime);
		}
		else {
			DCGUI.lblAlarmArea.setText(" OUT OF BOUNDS, Sätt nytt alarm ");
		}
}
	/** method for clearing alarm*/
	public void clearAlarm(){
		
		
		DCGUI.activateAlarm(false);

		
		
	}
	
}


