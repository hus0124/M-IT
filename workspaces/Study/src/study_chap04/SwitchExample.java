package study_chap04;

import java.util.Scanner;	// 외부에서 정의된 class 사용할 때 import 해서 가져온다.

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		// 자바에서 숫자 입력 받기. scanner 는 c언어 scanf 에 해당하는 기능이다.
		System.out.print("정수 입력: ");		// println printf 없이 커서가 바로 옆으로 올 수 있게 print만 해 줌
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		switch (num)
		{
		case 1:
			System.out.println("더하기");
		    break;
		
	    case 2:
		System.out.println("빼기");
	    break;
	
	    case 3:
	    System.out.println("곱하기");
	    break;

	    default:
	    System.out.printf("나누기");
	}

		// 자바에서는 문자열도 가능하다
		String value;
		System.out.println("메뉴 선택: ");
		value = scanner.next(); 	// next() 문자열 입력
		
		switch (value)
		{
		case "10":
			System.out.println("10대");
			break;
		case "20":
			System.out.println("20대");
			break;
		default:
			System.out.println("기타");
			break;
				
		}
}
}
