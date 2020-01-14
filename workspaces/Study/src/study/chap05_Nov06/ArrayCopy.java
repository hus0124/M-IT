package study.chap05_Nov06;

public class ArrayCopy {
/*
 * 배열 Array 의 단점 : 한 번 크기를 정해서 생성하면 크기 변경 불가. 더 필요하면 큰 배열 새로 만들고 이전 배열로부터 주소를 복사 받음..
 * System.arryCopy() 라는 메소드 사용.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2, 4, 6, 8};	// 길이 4로 생성. 크기 고정, 변경불가.
		int arr2[] = new int[10];	// 크기 더 큰 배열 새로 생성.
		
		//복사.1 반복문 사용해서 복사.
		
		/*for (int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}*/
		
		arr2[4] = 10;

		//복사2. 함수 사용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // arraycopy(원본배열, 복사할위치, 복사받을배열, 복사받을위치, 원본배열길이) 
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		
		

	}

}
