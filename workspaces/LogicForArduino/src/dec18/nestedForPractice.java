package dec18;

public class nestedForPractice {

	public static void main(String[] args) {
		// �ֻ��� �� �� ������ 7�� �Ǵ� ����� ���� ��� ����Ͻÿ�.
		// ��� �� : �ֻ��� 1,6 2,5 ��
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if((i+j)==7)
					System.out.print("(" + i + ", " + j + ")");
			}
		}

		
	}

}
