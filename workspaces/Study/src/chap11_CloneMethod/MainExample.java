package chap11_CloneMethod;

public class MainExample {	//±Ì¿∫ ∫π¡¶ 

	public static void main(String[] args) {
		
		ClassA c1 = new ClassA(10, new int[]{5,10});
		System.out.println(c1.num);
		
		for(int i = 0; i < c1.arr.length; i++){
			System.out.println("arr[" + i + "]= " + c1.arr[i]);
		}

		ClassA c2 = c1.getobject();
		System.out.println(c1.num);
		
		for(int i = 0; i < c2.arr.length; i++){
			System.out.println("arr[" + i + "]= " + c2.arr[i]);
		}

		c1.num = 20;
		c1.arr[0]=8;
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c1.arr[0]);
		System.out.println(c2.arr[0]);
	}
	
}
