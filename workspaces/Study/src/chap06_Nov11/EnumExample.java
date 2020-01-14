package chap06_Nov11;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week now = Week.MONDAY;		// 오른쪽에 있는 것이 enum 열거 상수. 객체.
		// 시간 계산에 많이 쓰이는 방법.
		
		Calendar cur = Calendar.getInstance();
		
		int year = cur.get(Calendar.YEAR);		//Calendar.YEAR : enum 을 이용하는 방법.
		
		System.out.println("년도 : " + year);
		
		int month = cur.get(Calendar.MONTH);
		int date = cur.get(Calendar.DATE);
		
		System.out.println(year + "년 " + (month + 1) + "월 " + date + "일");	// month 0~11까지 나오므로 1 더해야 한다.

		cur.add(Calendar.YEAR, 1);
		cur.set(2020, 10, 11);
		System.out.println("2020/11/11 : " + cur.get(Calendar.DAY_OF_WEEK));
		
		if(now == Week.MONDAY){
			System.out.println("월요일입니다");
		}
		else if(now == Week.TUESDAY){
			System.out.println("화요일입니다");
		}
		
		System.out.println(now);
		
		int diff = now.compareTo(Week.FRIDAY);	// now와 Week.FRIDAY의 차이값 = 0 - 4 = -4
		System.out.println(diff);
		
		// 문자열 입력 받아서 enum 타입으로 변환할 때 사용한다 : "MONDAY" -> Week.MONDAY 로 변환.
		
		/*Scanner scan = new Scanner(System.in);
		
		String week = scan.next();
		Week w1 = Week.valueOf(week);	// 문자열 -> enum 객체로 변환하는 메소드.
		*/
		int num = 12;
		String str = String.valueOf(num);	// num을 string으로 변환.
		System.out.println(str);
		
		String str1 = "13";
		int num1 = Integer.valueOf(str1);	// str 문자열을 int 로 변환
		System.out.println(str1);
		
		Week arr[] = Week.values();		// Week라는 enum 객체의 열거 상수 MONDAY ~ SUNDAY 까지 배열로 저장됨. 배열 크기는 7.
		
		for(Week a : arr)
		{
			System.out.println(a);
		}
	}

}
