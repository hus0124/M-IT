package chap06_Nov11;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week now = Week.MONDAY;		// �����ʿ� �ִ� ���� enum ���� ���. ��ü.
		// �ð� ��꿡 ���� ���̴� ���.
		
		Calendar cur = Calendar.getInstance();
		
		int year = cur.get(Calendar.YEAR);		//Calendar.YEAR : enum �� �̿��ϴ� ���.
		
		System.out.println("�⵵ : " + year);
		
		int month = cur.get(Calendar.MONTH);
		int date = cur.get(Calendar.DATE);
		
		System.out.println(year + "�� " + (month + 1) + "�� " + date + "��");	// month 0~11���� �����Ƿ� 1 ���ؾ� �Ѵ�.

		cur.add(Calendar.YEAR, 1);
		cur.set(2020, 10, 11);
		System.out.println("2020/11/11 : " + cur.get(Calendar.DAY_OF_WEEK));
		
		if(now == Week.MONDAY){
			System.out.println("�������Դϴ�");
		}
		else if(now == Week.TUESDAY){
			System.out.println("ȭ�����Դϴ�");
		}
		
		System.out.println(now);
		
		int diff = now.compareTo(Week.FRIDAY);	// now�� Week.FRIDAY�� ���̰� = 0 - 4 = -4
		System.out.println(diff);
		
		// ���ڿ� �Է� �޾Ƽ� enum Ÿ������ ��ȯ�� �� ����Ѵ� : "MONDAY" -> Week.MONDAY �� ��ȯ.
		
		/*Scanner scan = new Scanner(System.in);
		
		String week = scan.next();
		Week w1 = Week.valueOf(week);	// ���ڿ� -> enum ��ü�� ��ȯ�ϴ� �޼ҵ�.
		*/
		int num = 12;
		String str = String.valueOf(num);	// num�� string���� ��ȯ.
		System.out.println(str);
		
		String str1 = "13";
		int num1 = Integer.valueOf(str1);	// str ���ڿ��� int �� ��ȯ
		System.out.println(str1);
		
		Week arr[] = Week.values();		// Week��� enum ��ü�� ���� ��� MONDAY ~ SUNDAY ���� �迭�� �����. �迭 ũ��� 7.
		
		for(Week a : arr)
		{
			System.out.println(a);
		}
	}

}
