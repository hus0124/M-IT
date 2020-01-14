package chap02;

/*
 * ?°?´?„° ???…
 * ? •?ˆ˜ : char 2 byte (êµ?? œ?–´ ì§??›?„ ?œ„?•´ Unicode UTF-8 ë¥? ì§??›.) c?–¸?–´?˜ char?Š” ?ë°”ì—?„œ?Š” byte ?? ê°™ë‹¤.
 * ? •?ˆ˜?Š” 0~2?˜ 16 -1 ê¹Œì? (?Œ?ˆ˜?Š” ?—†?‹¤)
 * long 8 byte ?Š” c?–¸?–´?˜ long long?— ???‘
 * ?‹¤?ˆ˜ : c?–¸?–´?? ?™?¼(float, double)
 * ?…¼ë¦? : ì°?(true)ê³? ê±°ì§“(false) -> 1 byte ?¬ê¸?
 */

public class Primitive {		// ?´?˜?Š¤ ?´ë¦„ì? ??ë¬¸ìë¡? ?‹œ?‘?•œ?‹¤. ë©”ì†Œ?“œ ?´ë¦„ì? ?†Œë¬¸ìë¡? ?‹œ?‘?•œ?‹¤.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1 = 0x23;
		// char c1 = '?•œ';
		short s1 = 432;
		int num = 30; 		// default ê°? int
		long ll = 234L; 	// long ?„?„ ?‘œ?‹œ?•˜ê¸? ?œ„?•´ L?„ ì¶”ê? ê¸°ìˆ 
		float f1 = 0.43f;
		double d1 = 0.54;	// defaultê°? double
		boolean flag = true;	// ?…¼ë¦¬í˜• 1 byte, true or false
		
		System.out.println("b1 = " + b1);
		//System.out.println("c1 = " + c1);
		System.out.println("s1 = " + s1);
		System.out.println("num = " + num);
		System.out.println("ll = " + ll);
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		System.out.println("flag = " + flag);
	
	}

}
