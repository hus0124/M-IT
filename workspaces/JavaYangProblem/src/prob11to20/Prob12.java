package prob11to20;

import java.util.Scanner;

public class Prob12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("중간고사를 입력하시오 : ");
		int midScore = scan.nextInt();
		System.out.printf("기말고사를 입력하시오 : ");
		int finScore = scan.nextInt();
		System.out.printf("레포트점수를 입력하시오 : ");
		int reportScore = scan.nextInt();
		System.out.printf("출석점수를 입력하시오 : ");
		int attendScore = scan.nextInt();
		scan.close();
		
		printScore(midScore, finScore, reportScore, attendScore);
		
		String grade = calcScore(midScore, finScore, reportScore, attendScore);
		
		switch(grade){
		case "A":
		case "B":
			System.out.println("평가 = excellent");
			break;
		case "C":
		case "D":
			System.out.println("평가 = good");
			break;
		case "F":
			System.out.println("평가 = poor");
			break;
		}
		
		
	}

	private static String calcScore(int midScore, int finScore, int reportScore, int attendScore) {
		float gradeScore = (float) (((float)(midScore + finScore)/2)*0.6 + (float)reportScore*0.2 + (float)attendScore*0.2);
		System.out.printf("성적 = %.2f\n", gradeScore);
		String result = "";
		if(gradeScore >= 90) {
			System.out.println("학점 = A");
			result = "A";}
		else if(gradeScore >= 80) {
			System.out.println("학점 = B");
			result = "B";}
		else if(gradeScore >= 70) {
			System.out.println("학점 = C");
			result = "C";}
		else if(gradeScore >= 60) {
			System.out.println("학점 = D");
			result = "D";}
		else
			result = "F";
		return result;
	}

	private static void printScore(int a, int b, int c, int d) {
		System.out.printf("중간고사 : %d\n",a);
		System.out.printf("기말고사 : %d\n",b);
		System.out.printf("레포트점수 : %d\n",c);
		System.out.printf("출석점수 : %d\n",d);
		
	}

}
