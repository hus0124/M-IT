package JavaTestReady;
/*
 * while���� Math.random() �żҵ带 �̿��Ͽ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�, 
 * ���� ���� 6�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 6�̸� ������ ���ߴ� �ڵ带 �ۼ��Ͻÿ�. 
 * ���� ���� 6�� �Ǵ� ������ (1, 5), (2, 4), (3, 3), (4, 2), (5, 1) �Դϴ�.
 */
public class Prob2_5 {

	public static void main(String[] args) {
		boolean run = true;
		
		while(run){
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if((num1 + num2)==6){
				run=false;
			}
		}

	}

}
