package static_member;

public class Calculator {
	// ���� �ʵ�� ���� �޼ҵ�
	static double pi = 3.14159;
	
	static int plus(int x, int y){
		return x + y;
	}
	
	static int minus(int x, int y){
		return x - y;
	}
	
	static double calcularea(double radius){
		return pi * radius * radius;
	}

}
