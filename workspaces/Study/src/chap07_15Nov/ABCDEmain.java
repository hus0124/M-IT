package chap07_15Nov;
/*
 *      a
 *    b   c
 *    d   e   상속 구조
 */   
public class ABCDEmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		B b2 = d;	// 자식이므로 형변환 생략하고 타입 변환.
		// b2 = c; 상속 관계 아니라 형변환 생략하고 타입 변환이 안 됨
		// b2 = e;
		

	}

}
