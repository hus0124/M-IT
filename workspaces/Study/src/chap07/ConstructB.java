package chap07;

public class ConstructB extends ConstructA {
	
	int f3;
	public ConstructB(){
		//super() 가 이미 존재한다. 상속하므로.
		System.out.println("B() 호출됨");}
		
		public ConstructB(int f1, String s1){
			super(f1, s1);			//	super 부모 클래스. this 자신 클래스
									//  super(매개값) : 매개값과 동일한 타입, 개수, 순서 맞는 부모 생성자 호출.
		}							//  부모 생성자 없다면 컴파일 오류 발생. 반드시 자식 생성자의 첫 줄에 위치.
									//  부모 클래스에 기본(매개변수 없는) 생성자가 없다면 필수 작성.
		
		public ConstructB(int f1, String s1, int f3){
			super(f1, s1);
			this.f3 = f3;
		}
	}

