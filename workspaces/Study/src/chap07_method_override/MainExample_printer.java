package chap07_method_override;

public class MainExample_printer {

	public static void main(String[] args) {
		LaserPrinter printer = new LaserPrinter();
		printer.print("문서 1번");		// print 는 부모 꺼, 자식 꺼 둘 다 있다. 그럼 어느게 실행되는가?
		// 부모 자식 메소드 둘 다 존재할 때 자식이 오버라이딩, 즉 재정의한 메소드를 실행하게 되는 것이 규칙이다.

	}

}
