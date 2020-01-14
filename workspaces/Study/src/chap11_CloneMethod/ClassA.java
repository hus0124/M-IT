package chap11_CloneMethod;

import java.util.Arrays;

public class ClassA implements Cloneable{	// clone �޼ҵ� ������� ��ü�� �������̽� ����.
	// �ʵ�
	int num;
	int arr[]; 
	
	public ClassA(int num, int[] arr){
		this.num = num;
		this.arr = arr;
		}
	
	public ClassA getobject(){
		ClassA a = null;
		try{
		a = (ClassA)clone();	//�������ϸ� �������� �޼ҵ尡 ȣ���.
		} catch(CloneNotSupportedException e){}
	return a;
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
		//classA�� ������ ������ 	
		ClassA classA = (ClassA)super.clone();
		classA.arr = Arrays.copyOf(arr,arr.length); // Ŭ�� �迭 �ϳ� ���� ���⿡ ���� �迭�� ���� ����.
		return classA;
		}
}
