package chap07_Exercise;

public class Child extends Parent {
	private String name;
	
	public Child(){
		// 기본생성자 super(); 따라서 parent 호출됨.
		this("홍길동");	// parent 호출 다 끝나고 여기로 돌아오면 다시 14행의 this.name = name; 으로 가게 된다.
		System.out.println("Child() call");
	}
	
	public Child(String name){
		
		this.name = name;
		System.out.println("Child(String name) call");	// 이게 먼저 호출되고 나서 다시 this("홍길동") 아래로 간다.
	}

}
