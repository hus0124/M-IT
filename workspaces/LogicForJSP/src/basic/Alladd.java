package basic;

public class Alladd {

	int num1, num2;
	
	Alladd(int a, int b){
		System.out.println("�Ű����� �ް� ���ο� ��ü ����");
		num1 = a;
		num2 = b;
	}
	
	Alladd(){
		System.out.println("�Ű����� ���� ���ο� ��ü ����");
	}							// ������ �����ε�. ������.
	
	int sum(int a, int b) {
		int o_sum = 0;
		int tmp = 0;
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		for(int i = a; i <= b; i++) {
			o_sum+=i;
		}
		
		return o_sum;
	}
	
	int sum() {
		int o_sum = 0;
		int tmp = 0;
		if(num1 > num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i = num1; i <= num2; i++) {
			o_sum+=i;
		}
		
		return o_sum;
	}
	
}
