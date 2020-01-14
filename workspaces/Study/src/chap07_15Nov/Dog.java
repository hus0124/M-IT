package chap07_15Nov;

public class Dog extends Animal {
	int furcount;		// ÅÐ°¥ÀÌ È½¼ö
	
	public void method(){
		sound();
		age = 10;
	}

	@Override
	public void sound() {
		System.out.println("¿Ð¿Ð");
	}
}
