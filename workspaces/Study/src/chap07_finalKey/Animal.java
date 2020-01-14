package chap07_finalKey;

public class Animal {
	public final void sound(){		// 파이널이므로 상속에서 재정의 불가능.
		System.out.println("소리를 냅니다");
	}

}
