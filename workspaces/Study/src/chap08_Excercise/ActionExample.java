package chap08_Excercise;

public class ActionExample {

	public static void main(String[] args) {
		Action action =	new Action(){		//�͸�����ü ���
			@Override
			public void work(){
			System.out.println("���縦 �մϴ�");}
		};		// ���Թ��̶� ; �����ݷ�
		action.work();
	}

}
