package study.chap05_Nov06;

public class ArrayExample {

	/*
	 * c��� int main(void) : �Է��Ķ���� ������
	 * 		int main(int argc, char* argv[])
	 * 
	 * �ڹ� main(String [] args) : �迭�̹Ƿ� length ����. int argc�� ���ʿ�.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  int arr[4];
		    int[4] arr; C��� ó�� ���� �ؼ� �迭 ����� �ȵȴ� */
		
		// �ڹٿ��� �迭�� ��ü�̴�. �ν��Ͻ�ȭ(��ü�� ����) : �� ������ �޸� �Ҵ� �޾ƾ� �Ѵ�. 
		
		int[] arr1 = new int[4];	// new : ��ü�� �����ϴ� ȣ�� ���
			// arr1 : �������� (�ּ�����)
		
		arr1[2] = 20; 	// ���� ����. ��ü ���� �����ϱ� �޸� �ִ�.
		System.out.println("arr1[2] = " + arr1[2]);
		
		/* int[] arr2; 
		   arr2[2] = 10; �̷� ������� �Ұ���. int[] arr2 ���� �ϸ� null �� �ȴ�. �޸��Ҵ� �� ���� ���¶� ���� �� �ִ´� */
		
		double darr[] = new double[10];
		
		for(int i = 0; i < 10; i++)
		{
			darr[i] = 0.1;
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("darr[" + i + "] = " + darr[i]);
		}
		
		String str1 = "ȫ�浿";	// ����Ұ�. ���α׷��� �Ϻ�
		String str2 = new String("ȫ�浿");	// ���氡��. ������ ��ü.
		str2.replace("ȫ�浿", "�̹��");
		System.out.println(str2);
		
		int narr[] = {1, 2, 3, 4, 5};	// �̰� ���� ���� �����ؼ� �ʱ�ȭ. heap ������ int 5���� �Ҵ�Ǿ� ���� ��.
		int aarr[] = new int[10];	// ��ü ���� �ϸ� �ʱⰪ 0�� ����.
		
		for(int i = 0; i < aarr.length ; i++) // i < 10 ���ص� arr�� ���� ���ϴ� length ����ϸ� �ȴ�.
		{
			System.out.println(aarr[i]);
		}
		
		
	}

}
