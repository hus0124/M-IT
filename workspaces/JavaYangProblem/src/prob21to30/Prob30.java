package prob21to30;

public class Prob30 {

	public static void main(String[] args) {
		
		Test30 bookshop = new Test30();
		
		bookshop.setBook("�ڹٿϼ�", "Ȳ�ϼ�", 25000);
		bookshop.viewBook();
		
		bookshop.setBname("JSP���");
		bookshop.setAuthor("��JP");
		bookshop.setPrice(35000);
		
		System.out.println("å�̸� : " + bookshop.getBname());
		System.out.println("��  �� : " + bookshop.getAuthor());
		System.out.println("��  �� : " + bookshop.getPrice() + "��");
	}

}
