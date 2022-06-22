package chapter3;

public class operation {

	public static void main(String[] args) {
		 int v1 = 5;
		 int v2 = 2;
		 
		 int result1 = v1 + v2;
		 System.out.println("result1 =" + result1);
		 
		 int result2= v1-v2;
		 System.out.println("result2 =" + result2);
		 
		 int result3 = v1 * v2;
		 System.out.println("result3 =" + result3);
		 
		 int result4 = v1 / v2;
		 System.out.println("result4 =" + result4);
		 
		 int result5 = v1 % v2;
		 System.out.println("result5 =" + result5);
		 
		 double result6 = (double) v1 / v2;
		 System.out.println("result6 =" + result6);
		 
		 System.out.println(" ");
		 char c1 = 'A' +1;
		 char c2 = 'A';
		 //char c3 = c2 +1;
		 System.out.println("c1: "+c1);
		 System.out.println("c2: "+c2);
		 //System.out.println("c3: "+c3);
		 
		 System.out.println(" ");
		 String str1 = "JDK" + 6.0;
		 String str2 = str1 + " "
		 		+ "특징";
		 System.out.println(str2);
		 String str3 = "JDK" + 3+3.0;
		 String str4 = 3+3.0 +"JDK";
		 System.out.println(str3);
		 System.out.println(str4);
		 
		 
		 
		 
	}
}
