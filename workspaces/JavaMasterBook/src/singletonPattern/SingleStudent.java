package singletonPattern;

public class SingleStudent {
	private static SingleStudent instance = new SingleStudent(); // 정보은닉, 스태틱한 객체 생성 인스턴스화.
	
	public static SingleStudent getInstance(){
		return instance;		// 객체를 리턴시켜주는 함수 . 스태틱 객체를 리턴시키므로 함수도 스태틱.
	}
}
