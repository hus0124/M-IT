package basic;

public class MorningProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Morning morning = new Morning();
		
		morning.showcolor();
		
		morning.color = "red";
		
		morning.showcolor();
		
		Morning lysCar = new Morning("���κ���", 800);
		lysCar.showcolor();
		lysCar.run(100);
		lysCar.run(400);
		lysCar.run(350);
		
		System.out.println(lysCar.showkm());
		
		lysCar.use(100);
		lysCar.nowPrice();
		
		Morning yhiCar = new Morning("ȭ��Ʈ��");
		yhiCar.showcolor();
		yhiCar.run(1);
		System.out.println(yhiCar.showkm());
		
	}

}
