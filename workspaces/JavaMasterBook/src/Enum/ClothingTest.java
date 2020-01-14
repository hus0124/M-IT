package Enum;

public class ClothingTest {

	public static void main(String[] args) {
		ClothingInfo_ENUM obj1 = new ClothingInfo_ENUM("20191204", "패딩", "면100%", Season.WINTER);
		System.out.println("상품코드 : " + obj1.code);
		System.out.println("상품명 : " + obj1.name);
		System.out.println("소재 : " + obj1.material);
		System.out.println("계절구분 : " + obj1.season);
		
	}

}
