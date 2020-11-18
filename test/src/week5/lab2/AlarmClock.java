package week5.lab2;

public class AlarmClock {

	//Variables
	private Time currentTime;
	private Time alarmTime;
	private boolean set = true;

	
	//Constructors
	public AlarmClock() {		//assigned Alarm Clock to 0,0
		currentTime = new Time(0,0);
		alarmTime = new Time(0,0);
	}
	
	public AlarmClock(int h, int m) {
		currentTime = new Time(h,m);
		alarmTime = new Time(0,0);
	}
	
	
	//Getters & Setters 
	public void setAlarmTime(int h, int m) { // sets Alarm time
		alarmTime.setTime(h, m, 0);
	}
	
	public String showAlarmTime() {			//displays Alarm time
		return (alarmTime.getHour() + ":" + alarmTime.getMinute() + ":");
	}
	
	public boolean isAlarmStatus() {
			return set;
		}
	
	public void setCurrentTime(int h, int m) {
		currentTime.setTime(h, m, 0);
	}
	
	public void Tick() {
		currentTime.tick();
	}
	
	public String showCurrentTime() {		//displays Current Time
		return (currentTime.getHour() + ":" + currentTime.getMinute()) + ":" + currentTime.getSecond() + ":";
	}
	
	public void enableAlarm() {
		set = true;
	}
	public void disableAlarm() {
		set = false;
	}
	
	
	public boolean checkAlarmTime() {
		int alarmHour = alarmTime.getHour();
		int alarmMinute = alarmTime.getMinute();
		
			if(currentTime.getHour() == alarmTime.getHour() && currentTime.getMinute() == alarmTime.getMinute() && set == true) {
				set = false;
				return true;
			}
			else 
				return false;
	}
	
	
	
	
}
