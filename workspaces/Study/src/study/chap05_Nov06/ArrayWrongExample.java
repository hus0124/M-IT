package study.chap05_Nov06;

public class ArrayWrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �迭 ������µ� �ּ� �����ϴ� ��ü�� �������� �����ϸ� �� �ȴ�. �� ������ ���� �迭���� ������ �Ѵ�.
		
		String arr[] = new String[5];			// string ��ü�� ���� ������ �����ϴ� �迭�� 5�� ����. ���ڿ� �迭.
												// arr[i] : String ��ü�� �ּҸ� �����Ѵ�.
		arr[0] = "ȫ�浿";						// �̰� �������� arr[0]�� ����Ű�� ���� ���� �Է��ϴ� ��.
		arr[1] = "�ڹ�";
		arr[2] = new String("��λ�");
		
		System.out.println(arr[0].length());	// arr[0]�� string ��ü. �� ���� ���ϴ� �� �޼ҵ�, length(). �׳� �迭 ���̴� length.
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
		System.out.println(arr[3].length());	// arr[3]�� ���� ����Ű�� ���� ����. nullpoint exception
		
		
			

	}

}
