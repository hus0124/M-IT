package chap02;

/*
 * ?��리연?��?�� : A && B, A || B, !A, A & B, A | B,
 * c?��?��?��?��?�� && ! || �? ?��?��?�� 
 */
public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int var1 = 20;
		int a;
		int b=10;
		
		boolean flag = ( (a=num) > 11) && ((b=var1) < 20 );
		System.out.println("flag=" + flag + ",a=" + a + ",b=" +b);
		
		flag = ( (a=num) > 11) & ((b=var1) < 20 );
		System.out.println("flag=" + flag + ",a=" + a + ",b=" +b);
        // ?��바의 추�??�� ?���? ?��?��?�� & A�? false ?��?��?��?�� B�? true?���? false?���? ?��?��?��?��.
		// && A�? false?���? B�? 무엇?��?�� ?��?�� 무시, ?��?�� ?�� ?��.
		
	  }
}
