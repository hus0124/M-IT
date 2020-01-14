package chap08_InterfaceReview;

public class InterExample {

	public static void main(String[] args) {
		ClassAinter classi = new ClassAinter(new OracleDB2());
		classi.insert();
		classi.select();
		
		ClassAinter classi2 = new ClassAinter(new MariaDB2());
		classi2.insert();
		classi2.select();

	}

}
