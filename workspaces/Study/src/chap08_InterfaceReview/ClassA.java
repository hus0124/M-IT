package chap08_InterfaceReview;

public class ClassA {
	// 필드 선언
	OracleDB db;	// 다른 객체를 필드로 선언
	MariaDB mb;
	
	public ClassA(OracleDB oracle){
		db = oracle;
	}
	
	public ClassA(MariaDB maria){
		mb = maria;
	}
	public void insert(){
		db.insert();
	}

	public void insert1(){
		mb.insert();
	}
	public void select(){
		db.select();
	}
}
