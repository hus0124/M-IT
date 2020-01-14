package dec17;

import java.util.Random;

public class Montyhall {

	public static void main(String[] args) {
		Random ran = new Random();
		double normalcount=0;
		double changecount=0;
		int game = 0;	// �׻� 0�� �������� ����.
		int loop = 10000000;	//1000����
		
		for(int i=0; i<loop; i++) {
			int montyhall = ran.nextInt(3);	// 0 1 2 �� �ϳ� ��ǰ
			if(game==montyhall)
				normalcount++;
		}
		
		System.out.println("�� �ٲ��� �� Ȯ�� : " + (normalcount/loop)*100 + "%");
				
		for(int i=0; i<loop; i++) {
			int montyhall = ran.nextInt(3);	// 0 1 2 �� �ϳ� ��ǰ
			if(montyhall==0) 
				game = ran.nextInt(2)+1; // 1 �Ǵ� 2 �� �����ָ� ������ �ϳ� ����
			if(montyhall==1)
				game = 1;	// 1���� �� �����ְ� 2�� ������. 1�� �ٲ�.
			if(montyhall==2)
				game = 2;	// 2���� �� �����ְ� 1�� ������. 2�� �ٲ�.
			if(game==montyhall)
				changecount++;
		}
		
		System.out.println("�ٲ��� �� Ȯ�� : " + (changecount/loop)*100 + "%");
		
	}
	
}
