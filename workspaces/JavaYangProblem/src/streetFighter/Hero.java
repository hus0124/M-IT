package streetFighter;

public class Hero {
	String name;
	int hp;
	
	Hero(String _name, int _hp){
		name = _name;
		hp = _hp;
	}
	
	void punch(Hero enemy) {
		enemy.hp -= 10;
		System.out.printf("[%s]ÀÇ ÆÝÄ¡!\n", name);
		System.out.printf("\t%s HP : %d\n", enemy.name, enemy.hp);
	}
}
