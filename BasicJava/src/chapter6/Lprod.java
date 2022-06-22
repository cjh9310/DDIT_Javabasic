package chapter6;

// Value Object(VO: 값을 가지고 있는 객체)
// Date Transfer Object(DTO: 데이트럴 운반해주는 객체)
// Model(데이터)
// // Item(안드로이드 분야에서 많이 사용했음) (DB기준 데이터의 각 행을 Item이라 칭함)
// Bean(객체)
public class Lprod {
	private int lprodId;
	private String lprodGu;
	private String lprodNm;
	
	public int getLpordId() {
		return lprodId;
	}
	public void setLpordId(int lprodId) {
		this.lprodId =lprodId;
	}
	public String getLprodGu() {
		return lprodGu;
	}
	public void  getLprodGu(String lprodGu) {
		 this.lprodGu = lprodGu;
		 
	}public String getLprodNm() {
		return lprodNm;
	}
	public void  getLprodNm(String lprodNm) {
		 this.lprodNm = lprodNm;
}
}