package chap07;

public class ConstructA {
	int f1;
	String s1;
	
	//����Ʈ ������ ����. �ٵ� �̰� ������ �ڽĵ��� �θ� ��ü ������ �� �θ� ������ super �ʼ� �ۼ��ؼ� ȣ���Ѵ�. 
	public ConstructA(){
		System.out.println("A()�����ڰ� ȣ���");
	}
	
	public ConstructA(int f1, String s1){
		this.f1=f1;
		this.s1=s1;
	}
}
