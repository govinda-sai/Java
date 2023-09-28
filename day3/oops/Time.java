package day3.oops;

public class Time {
	private int hours;
	private int minutes; 
	private int seconds;
	
	public Time() {}
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public Time(int hours, int minutes){
		this.hours = hours;
		this.minutes = minutes;
	}
	public Time(int hours){
		this.hours = hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void print() {
//		System.out.println(hours + ":" + minutes + ":" + seconds);
		System.out.printf("%02d: %02d: %02d\n", this.hours, this.minutes, this.seconds);
	}
	public int getTotalSeconds() {
		return this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Time) {
			Time t = (Time) o;
			return this.hours == t.hours && this.minutes == t.minutes && 
					this.seconds == t.seconds;
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
		return 1;
	}
	
	@Override 
	public String toString() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;
	}
}