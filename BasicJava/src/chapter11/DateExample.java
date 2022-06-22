package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
	public static void main(String[] args) {
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일" ));
		System.out.println(now);
		// 실시간 날짜 표시할때.
	}
}
