package JavaTestReady;
/*
 * ��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, x�� y�� 0���� ũ�ų� ���� �ڿ��� �Դϴ�. (10��)
 */
public class Prob2_4 {

	public static void main(String[] args) {
				
		for(int i=0; i <= 60/4 ; i++){
			for(int j=0; j <= 60/5 ; j++){
				if((4*i + 5*j) == 60){
					System.out.println("(" + i + "," + j + ")");
					
				}
			}

		}
	}
}
