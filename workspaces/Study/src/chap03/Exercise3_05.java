package chap03;

public class Exercise3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 356;
		int cutt = value - (value % 100);	// 0.1 ���� �Ǽ� ���ϸ� �Ǽ������� �ٲ�鼭 ������� �Ҽ��� Ƣ���
		System.out.println("����� = " + cutt);
		
		int cutt2 = value / 100 * 100;
		System.out.println("�����2 = " + cutt2);
		
		int cutt3 = (int)(value * 0.01)	* 100;
		System.out.println("�����3 = " + cutt3);
		

	}

}
