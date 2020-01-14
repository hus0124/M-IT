package chap07;

public class ConstructA {
	int f1;
	String s1;
	
	//디폴트 생성자 존재. 근데 이게 없으면 자식들은 부모 객체 생성할 때 부모 생성자 super 필수 작성해서 호출한다. 
	public ConstructA(){
		System.out.println("A()생성자가 호출됨");
	}
	
	public ConstructA(int f1, String s1){
		this.f1=f1;
		this.s1=s1;
	}
}
