package chap07_Exercise;

public class Ex5Child extends Ex5Parent {

	private int studentNo;
	
	public Ex5Child(String name, int studentNo){
		// 이것만 딸랑 쓰면 에러 this.name = name;
		
		super(name);		// 부모 Ex5Parent 의 생성자 호출해서 초기화한다.
		
		this.studentNo = studentNo;
	}
}
