package chap11_LogicalCompare;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "1234");
		Member m2 = new Member("홍길동", "1234");
		
		if(m1.hashCode()==m2.hashCode()){System.out.println("같은 해시코드 값");}
		else{System.out.println("다른 해시코드값");}
		
		if(m1.equals(m2)){System.out.println("두 객체는 동일하다");}
		else {System.out.println("두 객체가 다름");}
		
		if(m1==m2){System.out.println("두 객체는 주소가 동일하다");}
		else {System.out.println("두 객체가 주소가 다름");}
		
		// 논리적 동등 비교시 hashcode 오버라이딩 필요. 논리적 주소값에 근거한 hashcode를 재정의 해줘야 논리적 동등 비교가 가능.
		// hashcode 리턴값과 equal 리턴값이 같아야 동등 객체 인정된다.
		// 물리적으로 다른 주소의 객체들을 논리적 동등 비교하기 위해 hashcode 오버라이딩 한다.
		
		System.out.println(m1.toString());	// toString : 객체 정보를 출력한다.
		System.out.println(m2.toString());
		
	}

}
