package study.chap05_Nov06;

public class ArrayWrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 만들었는데 주소 저장하는 객체만 만들어놓고 착각하면 안 된다. 실 내용을 담은 배열까지 만들어야 한다.
		
		String arr[] = new String[5];			// string 객체의 참조 변수를 저장하는 배열을 5개 생성. 문자열 배열.
												// arr[i] : String 객체의 주소를 저장한다.
		arr[0] = "홍길동";						// 이게 참조변수 arr[0]이 가리키는 실제 내용 입력하는 것.
		arr[1] = "자바";
		arr[2] = new String("백두산");
		
		System.out.println(arr[0].length());	// arr[0]는 string 객체. 그 길이 구하는 건 메소드, length(). 그냥 배열 길이는 length.
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
		System.out.println(arr[3].length());	// arr[3]은 아직 가리키는 내용 없다. nullpoint exception
		
		
			

	}

}
