package arrayBaekjun;

import java.util.Arrays;

public class Arraypractice {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[5];
		
		arr1[4] = 6;
		System.out.println(arr1[4]);
		int value = arr1[0];
		System.out.println(value);
		
		for(int ele:arr1)
		System.out.print(ele + " ");
		System.out.println();
		
		arr2 = Arrays.copyOf(arr1, 5);
		
		for(int ele:arr2)
			System.out.print(ele + " ");
		System.out.println();
		
		arr1[3] = 5;
		
		for(int ele:arr1)
			System.out.print(ele + " ");
			System.out.println();
		
		for(int ele:arr2)
			System.out.print(ele + " ");
			System.out.println();
			
		System.out.println(Arrays.toString(arr1));	
		System.out.println(Arrays.toString(arr2));
	
	}

}
