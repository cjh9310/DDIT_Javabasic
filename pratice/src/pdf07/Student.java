package pdf07;

public class Student extends Human{
	private String major;
	
	public Student(String name, int age , String major) {
		
	}

	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString()+"major=" + major;
	}
}
