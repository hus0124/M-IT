package chap08_Polymorphism;

public class PolymorpExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		for(int i = 0; i<10;i++){		// run() �̳� roll() ���� �ݺ� ������ �����Ƿ� for ������ �ݺ� ������ �ɾ���.
			int problemLocation = mycar.run();
			
			if(problemLocation==1){
				mycar.fl = new NexenTire("�տ���", 15);
			}
			else if(problemLocation==2){
				mycar.fr = new HankookTire("�տ�����", 13);
			}
			else if(problemLocation==3){
				mycar.bl = new HankookTire("�ڿ���", 12);
			}
			else if(problemLocation==4){
				mycar.bl = new NexenTire("�ڿ�����", 14);
			}
		}

	}

}
