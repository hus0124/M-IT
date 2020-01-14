package chap02;

/*
 * overflow ê²°ê³¼ê°? ?‚°ì¶œí•  ?•Œ ì£¼ì˜?•  ê²?
 * ?—°?‚°ê²°ê³¼ê°? ???¥ê°??Š¥?•œ ?‘œ?˜„ ?•œê³„ë?? ?„˜?–´ê°? ê²½ìš°
 */
public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MAX_VALUE;	//int ?‘œ?˜„ ìµœë? ?•œê³„ì¹˜
		int b = Integer.MAX_VALUE;
		
		int sum = a + b;
		
		sum = add(a, b);

	}
	// ?—‰?š±?•œ ê²°ê³¼ê°? ?‚˜?˜¤?Š” ê²ƒì„ ?”¼?•  ?ˆ˜ ?ˆ?Œ. ì§ì ‘ ?”?•˜ì§? ë§ê³  ?•¨?ˆ˜ë¥? ?‚¬?š©?•´?„œ ê°??Š¥?•œ ?—?Ÿ¬, ?˜¤ë¥˜ë?? ì¤„ì—¬?¼
	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		if(a==Integer.MAX_VALUE && b == Integer.MAX_VALUE){
			System.out.println("ê²°ê³¼ê°’ì´ ?„˜ì¹©ë‹ˆ?‹¤.");
		return -1;	// ?—?Ÿ¬ë°œìƒ?‹œ ?‹¤ë¥? ì²˜ë¦¬ ê°??Š¥?•˜ê²? ?„¤ê³?
		}
		else
		return a + b;	
	}

}
