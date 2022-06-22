package chapter7;

public class Parent1 {
	public String nation;
	public Parent1() { 
		this("대한민국"); //this라 아래가 먼저 호출된다?   컨트롤 누르고 this클릭하면 우선 실행할 코드를 보여줌.
		System.out.println("Parent() call");
	}
	public Parent1(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
// 결론 1. Parent1(String nation)
//     2. Parent1()
 //    3. Child1(String name)
//     4. Child1()
//    순으로 실행되어진다.