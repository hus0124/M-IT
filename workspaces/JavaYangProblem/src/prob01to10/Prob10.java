package prob01to10;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Input name: ");
		String name = scan.next();
		System.out.printf("Input gender: ");
		String gender = scan.next();
		System.out.printf("Input age: ");
		int age = scan.nextInt();
		System.out.printf("Input tall: ");
		float height = scan.nextFloat();
		scan.close();
		String male = "M";
		
		String genderVar = (gender.equals(male)) ? "����":"����";
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + genderVar);
		System.out.println("���� : " + age + "��");
		System.out.println("���� : " + height + "cm");
	}

}
