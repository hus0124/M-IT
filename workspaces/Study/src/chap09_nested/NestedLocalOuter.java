package chap09_nested;

import java.util.Timer;
import java.util.TimerTask;

public class NestedLocalOuter {
	// ����Ŭ���� ����
	void method(){
		// �ֱ��� Ÿ�̸� �۾� 
		// Ÿ�̸� Ŭ������ ���� 
		// ���� Ŭ���� : �޼ҵ� �ȿ����� ����Ϸ��� ������ Ŭ����
		class MyTimer extends Timer {
			private void run() {	// �ð� Ÿ�Ӿƿ��Ǹ� ����Ǵ� �޼ҵ�
				for(int i = 0; i<10;i++){
					System.out.println("Ÿ�Ӿƿ� �߻�");
				}

			}
		}
		
		MyTimer t = new MyTimer();
		t.schedule(new TimerTask(){	//�ֱ����� ���� ������Ű�� �޼ҵ�

			@Override
			public void run() {
				// Ÿ�Ӿƿ��Ǹ� ���� 
				for(int i = 0; i<10;i++){
					System.out.println("Ÿ�Ӿƿ� �߻�");
				}
			}}, 100L);		// �����ð�
	}
}
