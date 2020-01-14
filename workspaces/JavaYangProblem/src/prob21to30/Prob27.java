package prob21to30;

public class Prob27 {

	public static void main(String[] args) {
		
		String[] name = {"소서노", "주몽", "모팔모"};
		int[][] score = {{90,95,100} , {75,55,65}, {100,100,100}};
		double[] avg = {0.0, 0.0, 0.0};
		char[] grade = new char[3];
		String[] pass = new String[3];
		int [] rank = {1,1,1};
		
		int[] sum = new int[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum[i] += score[i][j];
			}
		}
		
		for(int i = 0; i < 3; i++) {
			avg[i] = (double)sum[i] / 3;
		}
		
		for(int i = 0; i < 3; i++) {
			if(avg[i] >= 90) {
				grade[i] = 'A';
				pass[i] = "pass";}
			else if(avg[i] >= 80) {
				grade[i] = 'B';
				pass[i] = "pass";}
			else if(avg[i] >= 70) {
				grade[i] = 'C';
				pass[i] = "pass";}
			else if(avg[i] >= 60) {
				grade[i] = 'D';
				pass[i] = "pass";}
			else {
				grade[i] = 'F';
				pass[i] = "fail";}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(avg[i] < avg[j])
					rank[i] = rank[i] + 1;
			}
		}
				
		System.out.printf("번호\t" + "이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t" + "재수강\t" + "순위\n");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d\t",i+1);
			System.out.printf(name[i]+"\t");
			for(int j=0; j < 3; j++) {
			System.out.printf(score[i][j]+"\t");
			}
			System.out.printf(sum[i] + "\t");
			System.out.printf(avg[i]+"\t");
			System.out.printf(grade[i]+"\t");
			System.out.printf(pass[i]+"\t");
			System.out.printf(rank[i]+"\t");
			System.out.println();
		}
	}

}
