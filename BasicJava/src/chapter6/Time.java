package chapter6;

public class Time {
	int hour;
	int minute;
	int second;
	Time() {
		this(00,00,00);
	}
	Time(int hour,int minute,int second) {
		if(hour>24) {
			hour =00;
		}else{
			this.hour =hour;
		}if(minute>=60) {
			minute =00;
		}else {
			this.minute=minute;
		}
		if(second>=60) {
			second=00;
		}else {
			this.second =second;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}

		
}
