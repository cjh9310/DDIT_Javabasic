package pratice;

public class one {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("********************");
		
		for(int i=1; i<=5; i++) {
			for(int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*************************");
		for(int i=1; i<=6; i++) {
			for(int j=6; j>i; j--) {
				System.out.println("");
			}
			for(int z=1; z<=6; z++) {
				System.out.print("*");
			}
		}
}
}

