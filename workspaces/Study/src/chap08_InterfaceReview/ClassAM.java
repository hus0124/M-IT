package chap08_InterfaceReview;

public class ClassAM {
	MariaDB db;
	
	public ClassAM(MariaDB maria){
		db = maria;
	}
	public void insert(){
		db.insert();
	}

	public void select(){
		db.select();
	}
}
