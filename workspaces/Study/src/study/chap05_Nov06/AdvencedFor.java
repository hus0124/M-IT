package study.chap05_Nov06;

public class AdvencedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 6, 9, 12};
		int sum = 0;
		
		// ���� for ���� �迭�� �÷����� �׸� ��Ҹ� ���� ó���ϹǷ� �ε��� ��� ��. int i �ʱ�� ���ǽ� ������ ��� ��.
		
		for(int num :arr)	// for(Ÿ�� ���� : �迭)
		{
			System.out.println(num);
			sum = sum + num;
		}
		
		System.out.println("�� = " + sum);

	}

}
