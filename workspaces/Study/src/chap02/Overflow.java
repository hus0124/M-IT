package chap02;

/*
 * overflow 결과�? ?��출할 ?�� 주의?�� �?
 * ?��?��결과�? ???���??��?�� ?��?�� ?��계�?? ?��?���? 경우
 */
public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MAX_VALUE;	//int ?��?�� 최�? ?��계치
		int b = Integer.MAX_VALUE;
		
		int sum = a + b;
		
		sum = add(a, b);

	}
	// ?��?��?�� 결과�? ?��?��?�� 것을 ?��?�� ?�� ?��?��. 직접 ?��?���? 말고 ?��?���? ?��?��?��?�� �??��?�� ?��?��, ?��류�?? 줄여?��
	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		if(a==Integer.MAX_VALUE && b == Integer.MAX_VALUE){
			System.out.println("결과값이 ?��칩니?��.");
		return -1;	// ?��?��발생?�� ?���? 처리 �??��?���? ?���?
		}
		else
		return a + b;	
	}

}
