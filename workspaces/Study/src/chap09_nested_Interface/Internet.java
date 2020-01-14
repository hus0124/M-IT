package chap09_nested_Interface;

import chap09_nested_Interface.Button.OnClickListener;

public class Internet implements OnClickListener {
//인터페이스의 추상 메소드를 재정의
	@Override
	public void onClick() {
		System.out.println("네이버 접속");

	}

}
