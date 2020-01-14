package study.chap05_Nov06;

public class ArrayExample {

	/*
	 * c언어 int main(void) : 입력파라미터 없을때
	 * 		int main(int argc, char* argv[])
	 * 
	 * 자바 main(String [] args) : 배열이므로 length 포함. int argc는 불필요.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  int arr[4];
		    int[4] arr; C언어 처럼 선언만 해선 배열 사용이 안된다 */
		
		// 자바에서 배열은 객체이다. 인스턴스화(객체를 생성) : 힙 영역에 메모리 할당 받아야 한다. 
		
		int[] arr1 = new int[4];	// new : 객체를 생성하는 호출 방법
			// arr1 : 참조변수 (주소저장)
		
		arr1[2] = 20; 	// 실행 가능. 객체 생성 했으니까 메모리 있다.
		System.out.println("arr1[2] = " + arr1[2]);
		
		/* int[] arr2; 
		   arr2[2] = 10; 이런 방법으론 불가능. int[] arr2 선언만 하면 null 값 된다. 메모리할당 못 받은 상태라서 값을 못 넣는다 */
		
		double darr[] = new double[10];
		
		for(int i = 0; i < 10; i++)
		{
			darr[i] = 0.1;
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("darr[" + i + "] = " + darr[i]);
		}
		
		String str1 = "홍길동";	// 변경불가. 프로그램의 일부
		String str2 = new String("홍길동");	// 변경가능. 생성된 객체.
		str2.replace("홍길동", "이방원");
		System.out.println(str2);
		
		int narr[] = {1, 2, 3, 4, 5};	// 이건 값을 직접 지정해서 초기화. heap 영역에 int 5개가 할당되어 값이 들어감.
		int aarr[] = new int[10];	// 객체 생성 하면 초기값 0이 들어간다.
		
		for(int i = 0; i < aarr.length ; i++) // i < 10 안해도 arr의 길이 구하는 length 사용하면 된다.
		{
			System.out.println(aarr[i]);
		}
		
		
	}

}
