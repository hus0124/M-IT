package chap08_InterfaceReview;

public class ClassA {
	// �ʵ� ����
	OracleDB db;	// �ٸ� ��ü�� �ʵ�� ����
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
