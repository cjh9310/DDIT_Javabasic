package chapter3;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		System.out.println("-------------------");
		x++;
		++x;
		System.out.println("x=" +x);
		System.out.println("-------------------");
		y--;
		--y;
		System.out.println("y=" +y);
		System.out.println("-------------------");
		z = x++;
		System.out.println("z=" +z); // z 결과가 나오고
		System.out.println("x="+x);  // 후에 x가 증가함
		System.out.println("-------------------");
		z = ++x;
		System.out.println("z="+z); // x결과가 나오고 z도 같이 증가
		System.out.println("x="+x);
		System.out.println("-------------------");
		z = ++x + y++;
		System.out.println("z="+z); //15+8
		System.out.println("x="+x);
		System.out.println("y="+y); // 기존 y=8이 적용되고 그 후에 1증가함
		
	}

}
