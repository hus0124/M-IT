package basic;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i =1; i<101; i++) {
			sum += i;
		}
		System.out.println("for�� ���:"+sum);	//for��
		
		sumcalc(100,1);	//�޼ҵ�
		
		Alladd o_allAdd = new Alladd();
		int o_sum = o_allAdd.sum(100,1);
		System.out.println("Ŭ���� ���:"+o_sum);	//Ŭ����
		
		Alladd o1_allAdd = new Alladd(100,1);
		int o1_sum = o1_allAdd.sum();
		System.out.println(o1_sum);					//������ �����ε� Ŭ����
	}

	private static void sumcalc(int a, int b) {
		int sum = 0;
		int tmp = 0;
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		for(int i = a; i <= b; i++) {
			sum+=i;
		}
		System.out.println("�޼ҵ� ���:"+sum);
	}

}
