package chap02;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0x0011;
		
		int sNum = num << 2; 	// ?��쪽으�? 2 비트 ?��?�� 
		int rNum = num >> 2; 	// ?��른쪽?���? 2비트 ?��?�� 
		int threeShift = num >>> 3  ;	// ?��른쪽?���? 2비트 ?��?�� 3�?
		
		System.out.printf("num = %x\n", num);		// 0x0011
		System.out.printf("num = %x\n", sNum);		// 결과 16진법 44 10진법 68
		System.out.printf("num = %x\n", rNum);
		System.out.printf("num = %x\n", threeShift);
		
		int num1 = 0xF0000000;	// �??��비트 1?�� ?��?���?
		int num2 = num1 >>> 3;
		System.out.printf("num = %x\n", num1);
		System.out.printf("num = %x\n", num2);
		
		int num3 = 17;
		System.out.printf("num = %#x\n", num3);
		System.out.printf("num = %#o\n", num3);

	}

}
