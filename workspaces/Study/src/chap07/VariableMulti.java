package chap07;

public class VariableMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수의 개수가 변할 경우 : 2개  지 5개 될지 모를때
				int sum = add(10, 20, 30, 40, 50, 60);
				System.out.println("합 = " + sum);
				sum = add(10,20);
				System.out.println("합 = " + sum);
				sum = add(10,20,30);
				System.out.println("합 = " + sum);
			}

			private static int add(int ...data) {	// 매개변수가 계속 변해도 받을 수 있다 ' ... ' 으로 표현한다.
				// data : 배열이다. 
				int sum = 0;
				for(int i = 0; i < data.length; i++){
					sum += data[i];
				}
				return sum;
	}

}
