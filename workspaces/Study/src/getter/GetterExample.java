package getter;

public class GetterExample {

	// getter setter 데이터 보호, 엉뚱한 데이터가 저장되지 않게
	// 직접 접근 허용하면 이상한 데이터가 들어갈까봐.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member("Hong", "홍길동", "1234", "1111", "hong@naver.com");
		
		Member lee = new Member();
		lee.setId("lee");
		lee.setName("이순신");
		lee.setPw("1234");
		lee.setPhone("2222");
		lee.setEmail("lee@gmail.com");
		
		System.out.println("아이디" + member.getId());
		System.out.println("이름" + member.getName());
		System.out.println("비밀번호" + member.getPw());
		System.out.println("전화번호" + member.getPhone());
		System.out.println("이메일" + member.getEmail());
		
		
	}

}
