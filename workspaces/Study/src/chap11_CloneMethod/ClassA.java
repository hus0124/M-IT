package chap11_CloneMethod;

import java.util.Arrays;

public class ClassA implements Cloneable{	// clone 메소드 사용위해 객체에 인터페이스 구현.
	// 필드
	int num;
	int arr[]; 
	
	public ClassA(int num, int[] arr){
		this.num = num;
		this.arr = arr;
		}
	
	public ClassA getobject(){
		ClassA a = null;
		try{
		a = (ClassA)clone();	//재정의하면 재정의한 메소드가 호출됨.
		} catch(CloneNotSupportedException e){}
	return a;
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
		//classA의 복사방법 재정의 	
		ClassA classA = (ClassA)super.clone();
		classA.arr = Arrays.copyOf(arr,arr.length); // 클론 배열 하나 만들어서 여기에 기존 배열을 깊은 복사.
		return classA;
		}
}
