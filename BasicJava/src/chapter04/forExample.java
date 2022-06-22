package chapter04;

public class forExample {

	public static void main(String[] args) {
		//150
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		//151
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}System.out.println("1~100합 : "+sum);
	
		//152
		int sum1 = 0;
		int ii=0;
		for(ii=1; ii<=100; ii++) {
			sum1 +=ii;	
		}System.out.println("1~"+(ii-1)+" 합 : "+sum1);
	
		//152-2
		for(float x=0.1f; x<=1.0f; x+=0.1f) { // 증가값이 정수로 들어가면 적용이 안되니 동일한 실수 float를 넣어줌
			System.out.println(x);
		}
		// 153
		for(int m=2; m<=9; m++) {
			System.out.println("***"+m+"단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}
		}
		for(int i=2; i<=9; i++) {
			System.out.printf("***%d 단***\n",i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
		//154
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//155
		int sum2=0;
		int i2 =1;
		while(i2<=100) {
			sum2 +=i2;
			i2++;
		}System.out.println("1~"+(i2-1)+"합: "+sum2);
		
	}

}
