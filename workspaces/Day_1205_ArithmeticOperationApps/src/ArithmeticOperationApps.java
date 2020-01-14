import java.util.Scanner;	// ctl + shift + o 라이브러리 전부 임포트

public class ArithmeticOperationApps {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int result=0;
		
		String operator=null;
		
		Scanner scan = new Scanner(System.in);
		
		ArithmeticOperations ao = new ArithmeticOperations();
		
		/* 입력화면 구현 */ 
		System.out.println("정수값 >> ");
		num1 = scan.nextInt();
		System.out.println("연산자 >> ");
		operator=scan.next();
		System.out.println("정수값 >> ");
		num2 = scan.nextInt();
		
		/* 결과뷰 출력 화면 구현 */
		System.out.println("==========================");
		System.out.println(num1 + " " + operator + " " + num2 + " 을 계산합니다.");
		System.out.println("==========================");
		
		if(operator.equals("+")){
			result = ao.addition(num1, num2);
			System.out.println("연산의 결과는 " + num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");	
		}
		else if(operator.equals("-")){
			result = ao.subtraction(num1, num2);
			System.out.println("연산의 결과는 " + num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");	
		}
		else if(operator.equals("*")){
			result = ao.multiplication(num1, num2);
			System.out.println("연산의 결과는 " + num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");	
		}
		else if(operator.equals("/")){
			System.out.println("연산의 결과는 " + num1 + " " + operator + " " + num2 + " = " + (float)(ao.division(num1, num2)) + " 입니다.");	
		}
		else{
			System.out.println("정확하게 정수값과 연산자를 입력해 주세요.");
		}
	}

}
