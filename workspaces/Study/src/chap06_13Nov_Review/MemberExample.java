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
		final String nation = "Korea";	// final ���� �ʱ�ȭ�� ����� ���ÿ� �ϰų� ������ ���ؼ� �Ѵ�.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���̵� : ");
		id = scan.next();
		System.out.println("�̸� : ");
		name = scan.next();
		System.out.println("��й�ȣ : ");
		pw = scan.next();
		System.out.println("����ȣ : ");
		phone = scan.next();
		System.out.println("�̸����ּ� : ");
		email = scan.next();
		
		Member member = new Member(id, name, pw, phone, email);
		// �����͸� �����ϴ� ��ü �ϳ��� �����ؼ� �װ͸� ����ؼ� ������ ���� �ϰ� �ʹٸ� singleTon ���
		
		CommonData store = CommonData.getInstance();
		store.data[store.count] = member;
		store.count++;
		
		
	}
	
}
