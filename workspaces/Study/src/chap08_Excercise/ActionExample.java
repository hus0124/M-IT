package chap08_Excercise;

public class ActionExample {

	public static void main(String[] args) {
		Action action =	new Action(){		//익명구현객체 사용
			@Override
			public void work(){
			System.out.println("복사를 합니다");}
		};		// 대입문이라 ; 세미콜론
		action.work();
	}

}
