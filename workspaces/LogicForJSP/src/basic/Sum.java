package basic;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i =1; i<101; i++) {
			sum += i;
		}
		System.out.println("for문 결과:"+sum);	//for문
		
		sumcalc(100,1);	//메소드
		
		Alladd o_allAdd = new Alladd();
		int o_sum = o_allAdd.sum(100,1);
		System.out.println("클래스 결과:"+o_sum);	//클래스
		
		Alladd o1_allAdd = new Alladd(100,1);
		int o1_sum = o1_allAdd.sum();
		System.out.println(o1_sum);					//생성자 오버로딩 클래스
	}

	private static void sumcalc(int a, int b) {
		int sum = 0;
		int tmp = 0;
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		for(int i = a; i <= b; i++) {
			sum+=i;
		}
		System.out.println("메소드 결과:"+sum);
	}

}
