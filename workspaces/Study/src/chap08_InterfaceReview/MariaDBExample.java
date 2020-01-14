package chap08_InterfaceReview;

public class MariaDBExample {

	public static void main(String[] args) {
		ClassAM maria = new ClassAM(new MariaDB());
		maria.insert();
		

	}

}
