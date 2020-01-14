package study.chap05_Nov06;

public class StringArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = { "자바", "C언어", "DBMS" };
		String more[] = new String[15];
		
		System.arraycopy(str, 0, more, 0, str.length);	//주소값 복사 받음. 이른바 '얕은 복사' : 주소만 복사됨.
		
		for (int i = 0; i < more.length; i++)
		{
			System.out.println(more[i]);
		}
		
		for (int i = 0; i < str.length; i++)
		{
			if(str[i] == more[i])
			{
				System.out.println("같은 객체를 참조");	// 얕은 복사로 주소 복사했으니 같은 객체 참조됨.
			}
			else
			{
				System.out.println("다른 객체를 참조");
			}
		}
		
		//깊은 복사. 객체 생성해서 내용값을 복사
		
		for (int i = 0; i<str.length; i++)
		{
			more[i] = new String(str[i]);
		}
		
		for (int i = 0; i < more.length; i++)
		{
			System.out.println(more[i]);
		}
		
		for (int i = 0; i < str.length; i++)
		{
			if(str[i] == more[i])
			{
				System.out.println("같은 객체를 참조");
			}
			else
			{
				System.out.println("다른 객체를 참조");	// 깊은 복사로 새 개체에 내용값을 복사해서 주소가 다름. 다른 객체 참조가 됨.
			}
		}
				

	}

}
