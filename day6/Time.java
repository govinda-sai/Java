package day6;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
	}

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public Time(int hours) {
		this.hours = hours;
	}

	// setters
	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	// getters
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void print() {
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
	
	public int hashCode() {
		return this.hours;
	}
	
	public String toString() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;
	}
}