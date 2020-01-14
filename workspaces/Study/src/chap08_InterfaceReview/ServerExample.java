package chap08_InterfaceReview;

public class ServerExample {

	public static void main(String[] args) {
		ClassA oracle = new ClassA(new OracleDB());
		oracle.insert();
		
		ClassA maria = new ClassA(new MariaDB());
		maria.insert1();		// classA 에서 insert와 insert1 두 개를 만들어야지만 작동.
		maria.insert();		// 되는 것처럼 보이지만 에러. 널포인트익셉션.
	}
	
}
