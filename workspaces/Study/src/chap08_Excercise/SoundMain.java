package chap08_Excercise;

public class SoundMain {
	private static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());

	}

}
