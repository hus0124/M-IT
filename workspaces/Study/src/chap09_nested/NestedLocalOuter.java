package chap09_nested;

import java.util.Timer;
import java.util.TimerTask;

public class NestedLocalOuter {
	// 로컬클래스 예시
	void method(){
		// 주기적 타이머 작업 
		// 타이머 클래스를 정의 
		// 로컬 클래스 : 메소드 안에서만 사용하려고 정의한 클래스
		class MyTimer extends Timer {
			private void run() {	// 시간 타임아웃되면 실행되는 메소드
				for(int i = 0; i<10;i++){
					System.out.println("타임아웃 발생");
				}

			}
		}
		
		MyTimer t = new MyTimer();
		t.schedule(new TimerTask(){	//주기적인 일을 구동시키는 메소드

			@Override
			public void run() {
				// 타임아웃되면 실행 
				for(int i = 0; i<10;i++){
					System.out.println("타임아웃 발생");
				}
			}}, 100L);		// 지연시간
	}
}
