package chap07_15Nov;

public class Dog extends Animal {
	int furcount;		// �а��� Ƚ��
	
	public void method(){
		sound();
		age = 10;
	}

	@Override
	public void sound() {
		System.out.println("�п�");
	}
}
