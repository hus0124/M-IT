package chap03;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String : 라이브러리 클래스
		// C언어의 구조체와 비슷한 것이 클래스
		// str : 일종의 포인터 c언어 char* ptr = "홍길동" 자바는 딱히 포인터 없다.
		String str1 = "홍길동";
		String str2 = "홍길동";	// 이 둘은 동일한 내용이므로 주소 하나
		
		String str3 = new String("홍길동");	// 내용은 동일하나 new 로 객체 새로 만들어 정보 따로 저장됨.
		if(str1 == str2)	// 주소를 비교한 것.
		{ 
			System.out.println("동일한 (같은 객체) 값이다");
		}
		else
		{
			System.out.println("다른 객체이다.");
		}
		
		if(str2 == str3)
		{ 
			System.out.println("동일한 (같은 객체) 값이다");
		}
		else
		{
			System.out.println("다른 객체이다.");
		}
		
		// 주소가 아니라 내용을 비교할 수도 있다. equals() 메소드를 사용한다.
		if(str1.equals(str2))
		{
			System.out.println("같은 내용입니다");
		}
		else
		{
			System.out.println("다른 내용입니다.");
		}
		
		if(str2.equals(str3))
		{
			System.out.println("같은 내용입니다");
		}
		else
		{
			System.out.println("다른 내용입니다.");
		}

	}

}
