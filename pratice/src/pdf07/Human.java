package pdf07;

public class Human {
	private String name;
	private int age;
	public Human() {
		
	}
	public Human(String name, int age) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", ";
	}
}
