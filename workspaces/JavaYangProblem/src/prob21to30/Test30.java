package prob21to30;

public class Test30 {

	String bname = "";
	String author = "";
	int price = 0;
	
	void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	void viewBook() {
		System.out.println("å�̸� : " + bname);
		System.out.println("��  �� : " + author);
		System.out.println("��  �� : " + price + "��");
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
