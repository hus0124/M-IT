package study.chap05_Nov06;

public class Compare {

	public static void main(String[] args) {
		// 기본 데이터 타입의 변수
		// 정수, 실수 , 논리
		
		int num = 10;		// 기본 타입 변수의 저장 위치는 stack. 저장 시점은 변수가 초기화 될 때이다.
		int var1;			// 초기화하지 않으면 stack에 저장되지 않는다.
		var1 = 20;			// stack에 저장된다. 값이 대입되는 초기화 시점.
		
		if (num==10)
		{
			System.out.println(num);
		}
		
		// 참조 타입의 변수
		// 배열, 열거형(enum), 클래스 , 인터페이스
		
		String str = "홍길동";	// str은 참조 변수, : 홍길동 이란 내용은 heap에 저장되고 그 주소는 스택 안의 참조 변수 str에 들어있다. 
	    // str = null	 이렇게 하면 홍길동에 접근 방법이 사라짐. 주소가 없어지니까.
		
		String str2 = "홍길동";	// heap 영역에 저장된 동일한 객체
		
		if (str==str2)		// 두 참조변수의 주소값을 비교한다
			System.out.println("동일한 객체를 참조한다");
		else
			System.out.println("다른 객체를 참조한다");
		
		if (str.equals(str2))		// 두 참조변수의 내용을 비교한다.
			System.out.println("같은 데이터 값을 가진다");
		else
			System.out.println("다른 데이터 값을 가진다");
		
		System.out.println("str2의 문자열의 길이 = " + str2.length());
		String str3 = null;		//아무것도 참조하지 않음
		// str3 = method1(); 이런 식으로 메소드 결과를 받도록 했는데 null 값이 올 수 도 있다. 그러면 nullpoint exception
		// 예를 들면 홈페이지에서 정보입력 하나 비워두고 엔터 치는 경우.
		
		if (str3 != null)
		    System.out.println("str3의 문자열의 길이 = " + str3.length());
		else	// null 이면 에러처리
			System.out.println("에러발생");
		
		
	}

}
