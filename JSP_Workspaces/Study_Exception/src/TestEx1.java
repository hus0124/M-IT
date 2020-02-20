
public class TestEx1 {
	int exec() {
		int a = 1;
		int b = 0;
		int sum = 0;
		
		try {
		
			sum = a/b; //예외 발생
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("exec 메소드 예외 발생");
			return a;
		}
		finally {
			System.out.println("예외 발생 상관 없이 무조건 출력");
			
		}
		
		System.out.println("finally 밑으로 실행이 된다!");
		return sum;
	}
}
