package chap02;

/*
 * ?…¼ë¦¬ì—°?‚°? : A && B, A || B, !A, A & B, A | B,
 * c?–¸?–´?—?„œ?Š” && ! || ë§? ?ˆ?—ˆ?‹¤ 
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
        // ?ë°”ì˜ ì¶”ê??œ ?…¼ë¦? ?—°?‚°? & Aê°? false ?´?”?¼?„ Bê°? true?¸ì§? false?¸ì§? ?Œ?‹¨?•œ?‹¤.
		// && Aê°? false?´ë©? Bê°? ë¬´ì—‡?´?“  ?Œ?‹¨ ë¬´ì‹œ, ?‹¤?–‰ ?•ˆ ?•¨.
		
	  }
}
