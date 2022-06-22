package chapter11;

import java.util.Objects;

public class Member {
	private String id;
	public Member(String id) {
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
}
