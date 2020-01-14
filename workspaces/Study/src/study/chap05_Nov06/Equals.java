package study.chap05_Nov06;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");	//str1 과 주소 다르다.
		String str4 = new String("홍길동");	//str3 와 값은 같지만 주소는 또 다르다
		
		if(str1==str2)	// 주소 비교
			System.out.println("str1 과 str2 는 같은 객체를 참조");
		else
			System.out.println("str1 과 str2 는 다른 객체를 참조");
		
		if(str2==str3)	// 주소 비교
			System.out.println("str2 과 str3 는 같은 객체를 참조");
		else
			System.out.println("str2 과 str3 는 다른 객체를 참조");
		
		//객체의 내용을 비교
		
		if(str1.equals(str2))	// 주소 비교
			System.out.println("str1 과 str2 는 같은 내용(값)");
		else
			System.out.println("str1 과 str2 는 다른 내용(값)");
		
		if(str2.equals(str3))	// 주소 비교
			System.out.println("str2 과 str3 는 같은 내용(값)");
		else
			System.out.println("str2 과 str3 는 다른 내용(값)");
		
		// new str3 와 str4 끼리 비교
		
		if(str3 == str4)	// 주소 비교
			System.out.println("str3 과 str4 는 같은 주소");
		else
			System.out.println("str3 과 str4 는 다른 주소");
		
		if(str3.equals(str4))	// 주소 비교
			System.out.println("str3 과 str4 는 같은 내용(값)");
		else
			System.out.println("str3 과 str4 는 다른 내용(값)");

	}

}
