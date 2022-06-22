package chapter6;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	Board(){
		this(null,null,null,null,0);
	}
	Board(String title, String content){
		this(title,content,null,null,0);
	}
	Board(String title, String content, String writer){
		this(title,content,"로그인한 회원아이디",null,0);
	}
	Board(String title, String content, String writer,String date){
		this(title,content,writer,date,0);
	}
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
