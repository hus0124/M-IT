package prob21to30;

public class Prob30 {

	public static void main(String[] args) {
		
		Test30 bookshop = new Test30();
		
		bookshop.setBook("자바완성", "황완성", 25000);
		bookshop.viewBook();
		
		bookshop.setBname("JSP잡기");
		bookshop.setAuthor("송JP");
		bookshop.setPrice(35000);
		
		System.out.println("책이름 : " + bookshop.getBname());
		System.out.println("저  자 : " + bookshop.getAuthor());
		System.out.println("가  격 : " + bookshop.getPrice() + "원");
	}

}
