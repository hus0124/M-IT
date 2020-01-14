package streetFighter;

public class FightProgram {

	public static void main(String[] args) {
		
		Hero choonli = new Hero("√·∏Æ", 30);
		Hero gail = new Hero("∞°¿œ", 30);
		
		choonli.punch(gail);
		gail.punch(choonli);
		choonli.punch(gail);
		gail.punch(choonli);
		choonli.punch(gail);
		

	}

}
