package chap02;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0x0011;
		
		int sNum = num << 2; 	// ?™¼ìª½ìœ¼ë¡? 2 ë¹„íŠ¸ ?´?™ 
		int rNum = num >> 2; 	// ?˜¤ë¥¸ìª½?œ¼ë¡? 2ë¹„íŠ¸ ?´?™ 
		int threeShift = num >>> 3  ;	// ?˜¤ë¥¸ìª½?œ¼ë¡? 2ë¹„íŠ¸ ?´?™ 3ë²?
		
		System.out.printf("num = %x\n", num);		// 0x0011
		System.out.printf("num = %x\n", sNum);		// ê²°ê³¼ 16ì§„ë²• 44 10ì§„ë²• 68
		System.out.printf("num = %x\n", rNum);
		System.out.printf("num = %x\n", threeShift);
		
		int num1 = 0xF0000000;	// ë¶??˜¸ë¹„íŠ¸ 1?´ ?˜?„ë¡?
		int num2 = num1 >>> 3;
		System.out.printf("num = %x\n", num1);
		System.out.printf("num = %x\n", num2);
		
		int num3 = 17;
		System.out.printf("num = %#x\n", num3);
		System.out.printf("num = %#o\n", num3);

	}

}
