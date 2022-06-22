package chapter8;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public int compareTo(Student o) {  
		// o에 있는 age와 this.age를 비교함
//		// 나이순으로 오름차순
//		if(this.age > o.age) {
//			return 1;
//		}else if (this.age < o.age) {
//			return -1;
//		}
//		return 0;
		// 이름 오름차순
		if(this.name.compareTo(o.name)>0) {
			return 1;
		}else if(this.name.compareTo(o.name)<0) {
			return -1;
		}else {
			return 0;
		}
		// 혹은 아래처름
//		return this.name.compareTo(o.name);
		// 역순
//		return  -this.name.compareTo(o.name);
	}
}
