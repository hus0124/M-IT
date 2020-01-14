package arrayBaekjun;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P2920test {

	public static void main(String[] args) {
		String[] str1 = {"홍길동","장발장","허준","김흥도","라이츄"};
        String[] str2 = {"like","love","pika","lonely","you"};
        String[] str3 = {"like","love","pika","lonely","you"};
        
        int[] num1 = {82,45,26,4,7,3};
        int[] num2 = {82,45,26,4,7,3};       
        int[] num3 = {82,45,26,4,7,3};
        
        //오름차순
        Arrays.sort(str1);  // 김흥도 , 라이츄 , 장발장 , 허준 , 홍길동
        Arrays.sort(str2); // like , lonely , love , pika , you
        Arrays.sort(num1); // 3 , 4 , 7 , 26 , 45 , 82
        Arrays.sort(num3, 1, num3.length);  
        
        //내림차순 문자열 배열
        Arrays.sort(str3, Collections.reverseOrder()); // you , pika , love , lonely , like
        
        // 내림차순
        List <int[]> list = Arrays.asList(num2);
		Collections.reverse(list);	// 내림차순
        
        for (String sele1 : str1){//오름차순
        	System.out.print(sele1 + " ");
        }
        System.out.println();
        for (String sele2 : str2){//오름차순
        	System.out.print(sele2 + " ");
        }
        System.out.println();
        for (String sele2 : str3){//내림차순
        	System.out.print(sele2 + " ");
        }
        System.out.println();
        for (int element : num1){//오름차순
        	System.out.print(element + " ");
        }
        System.out.println();
        for (int element : num2){//내림차순
        	System.out.print(element + " ");
        }
        System.out.println();
        for (int element : num3){//범위지정 오름차순
        	System.out.print(element + " ");
        }
        System.out.println();

	}

}
