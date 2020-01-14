package chap03;

// concatenation 연결, 뒤에 계속 추가
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;		// 6.0 이 문자열로 자동 형변환되어 JDK6.0 으로 연결된다.
		String str2 = str1 + "특징";		// 
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;	//문자열이 먼저 나와서 뒤에도 문자열도 붙음
		String str4 = 3 + 3.0 + "JDK";	// 일단 숫자가 먼저 나와서 계산하다가 문자열 나오면 붙음
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = 6 * 2 + "JDK" + 4 * 5; // + 연산자만이 문자열과 붙고 곱하기는 그냥 숫자로 계산
		String str6 = "JDK" + 4 * 5;
		System.out.println(str5);
		System.out.println(str6);

	}

}
