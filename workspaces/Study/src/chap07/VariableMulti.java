package chap07;

public class VariableMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ű������� ������ ���� ��� : 2��  �� 5�� ���� �𸦶�
				int sum = add(10, 20, 30, 40, 50, 60);
				System.out.println("�� = " + sum);
				sum = add(10,20);
				System.out.println("�� = " + sum);
				sum = add(10,20,30);
				System.out.println("�� = " + sum);
			}

			private static int add(int ...data) {	// �Ű������� ��� ���ص� ���� �� �ִ� ' ... ' ���� ǥ���Ѵ�.
				// data : �迭�̴�. 
				int sum = 0;
				for(int i = 0; i < data.length; i++){
					sum += data[i];
				}
				return sum;
	}

}
