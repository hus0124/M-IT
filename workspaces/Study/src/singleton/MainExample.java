package singleton;

import java.util.Calendar;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SingleTon s = new SingleTon(); 객체 생성이 안 됨. 다른 클래스에서 접근이 불가능.
		
		// SingleTon 클래스도 private. instance도 private.
		// SingleTon 에 접근 가능한 instance. instance에 접근 가능한 getInstance. 
		System.out.println("호출함");
		SingleTon s1 = SingleTon.getInstance(); 
		s1.data[0] = 10;
		
		System.out.println(s1.data[0]);
		Calendar now = Calendar.getInstance();	// Calendar 라는 싱글톤에 getInstance로 접근.
		
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int num = 10;
		for (int i = 0; i < 10; i++){
			
			s1.data[i] = num++;
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(s1.data[i]);
		}
		
		// SingleTon s2 = new SingleTon();
		// 싱글톤 처리이므로 new 로 객체 새로 만들지 못하게 된다.

	}

}
