package ch5_Stream;

public class Coffee implements Comparable<Coffee>{
	
	public enum Origin {Columbia, Ethiopia}
	String menu;
	int price;
	Origin origin;
	
	
	public Origin getOrigin() {
		return origin;
	}
	public String getMenu() {
		return menu;
	}
	public int getPrice() {
		return price;
	}
	
	public Coffee(String menu, int price, Origin origin) {
		this.menu = menu;
		this.price = price;
		this.origin = origin;
	}
	
	@Override
	public int compareTo(Coffee o) {
		// TODO Auto-generated method stub
		
		return Integer.compare(price, o.price);
	}
}
