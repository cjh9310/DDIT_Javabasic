package chapter6;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		if(id.equals("hong")&& password.equals("12345")) {
			}return true;
	}void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
