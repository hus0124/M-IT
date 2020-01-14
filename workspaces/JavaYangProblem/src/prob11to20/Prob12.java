package prob11to20;

import java.util.Scanner;

public class Prob12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("�߰���縦 �Է��Ͻÿ� : ");
		int midScore = scan.nextInt();
		System.out.printf("�⸻��縦 �Է��Ͻÿ� : ");
		int finScore = scan.nextInt();
		System.out.printf("����Ʈ������ �Է��Ͻÿ� : ");
		int reportScore = scan.nextInt();
		System.out.printf("�⼮������ �Է��Ͻÿ� : ");
		int attendScore = scan.nextInt();
		scan.close();
		
		printScore(midScore, finScore, reportScore, attendScore);
		
		String grade = calcScore(midScore, finScore, reportScore, attendScore);
		
		switch(grade){
		case "A":
		case "B":
			System.out.println("�� = excellent");
			break;
		case "C":
		case "D":
			System.out.println("�� = good");
			break;
		case "F":
			System.out.println("�� = poor");
			break;
		}
		
		
	}

	private static String calcScore(int midScore, int finScore, int reportScore, int attendScore) {
		float gradeScore = (float) (((float)(midScore + finScore)/2)*0.6 + (float)reportScore*0.2 + (float)attendScore*0.2);
		System.out.printf("���� = %.2f\n", gradeScore);
		String result = "";
		if(gradeScore >= 90) {
			System.out.println("���� = A");
			result = "A";}
		else if(gradeScore >= 80) {
			System.out.println("���� = B");
			result = "B";}
		else if(gradeScore >= 70) {
			System.out.println("���� = C");
			result = "C";}
		else if(gradeScore >= 60) {
			System.out.println("���� = D");
			result = "D";}
		else
			result = "F";
		return result;
	}

	private static void printScore(int a, int b, int c, int d) {
		System.out.printf("�߰���� : %d\n",a);
		System.out.printf("�⸻��� : %d\n",b);
		System.out.printf("����Ʈ���� : %d\n",c);
		System.out.printf("�⼮���� : %d\n",d);
		
	}

}
