package chap06_13Nov_Review;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id;
		String name;
		String pw;
		String phone;
		String email;
		final String nation = "Korea";	// final 변수 초기화는 선언과 동시에 하거나 생성자 통해서 한다.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 : ");
		id = scan.next();
		System.out.println("이름 : ");
		name = scan.next();
		System.out.println("비밀번호 : ");
		pw = scan.next();
		System.out.println("폰번호 : ");
		phone = scan.next();
		System.out.println("이메일주소 : ");
		email = scan.next();
		
		Member member = new Member(id, name, pw, phone, email);
		// 데이터를 저장하는 객체 하나만 생성해서 그것만 사용해서 데이터 관리 하고 싶다면 singleTon 사용
		
		CommonData store = CommonData.getInstance();
		store.data[store.count] = member;
		store.count++;
		
		
	}
	
}
