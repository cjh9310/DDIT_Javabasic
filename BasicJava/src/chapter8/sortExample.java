package chapter8;

import java.util.Arrays;

public class sortExample {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("나",20);
		students[1] = new Student("마",21);
		students[2] = new Student("우리",23);
		
		Arrays.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
