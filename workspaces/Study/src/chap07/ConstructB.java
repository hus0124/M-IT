package chap07;

public class ConstructB extends ConstructA {
	
	int f3;
	public ConstructB(){
		//super() �� �̹� �����Ѵ�. ����ϹǷ�.
		System.out.println("B() ȣ���");}
		
		public ConstructB(int f1, String s1){
			super(f1, s1);			//	super �θ� Ŭ����. this �ڽ� Ŭ����
									//  super(�Ű���) : �Ű����� ������ Ÿ��, ����, ���� �´� �θ� ������ ȣ��.
		}							//  �θ� ������ ���ٸ� ������ ���� �߻�. �ݵ�� �ڽ� �������� ù �ٿ� ��ġ.
									//  �θ� Ŭ������ �⺻(�Ű����� ����) �����ڰ� ���ٸ� �ʼ� �ۼ�.
		
		public ConstructB(int f1, String s1, int f3){
			super(f1, s1);
			this.f3 = f3;
		}
	}

