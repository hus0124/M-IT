package chap08_Polymorphism;

public class PolymorpExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		for(int i = 0; i<10;i++){		// run() 이나 roll() 에는 반복 조건이 없으므로 for 문으로 반복 조건을 걸어줌.
			int problemLocation = mycar.run();
			
			if(problemLocation==1){
				mycar.fl = new NexenTire("앞왼쪽", 15);
			}
			else if(problemLocation==2){
				mycar.fr = new HankookTire("앞오른쪽", 13);
			}
			else if(problemLocation==3){
				mycar.bl = new HankookTire("뒤왼쪽", 12);
			}
			else if(problemLocation==4){
				mycar.bl = new NexenTire("뒤오른쪽", 14);
			}
		}

	}

}
