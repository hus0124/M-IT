package chap08_DefaultInherit;

public interface ReChildDB extends InterfaceDB {
//������
	@Override	
	default void update() {
		System.out.println("UPDOWN rechildȣ��");
	}
}
