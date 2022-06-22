package pdf06;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
	}
	
	public Time(int hour,int minute, int second) {
		if((hour>0 && hour<=23) && (minute>=0 && minute<=59) && (second>=0 && second<=59)) {
			this.hour=hour;
			this.minute=minute;
			this.second=second;
		}else {
			hour = hour;
			minute =0;
			second =0;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
}
