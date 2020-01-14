package prob31to38;

public class SubEntry extends Entry {
	String definition;
	int year;
	
	SubEntry(String w){
		super(w);
	}
	
	SubEntry(String w, String d, int y){
		this(w);
		definition = d;
		year = y;
	}
	
	public void printView() {
		System.out.println("���� : " + definition);
		System.out.println("�ñ� : " + year);
	}
}
