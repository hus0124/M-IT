package arrayBaekjun;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P2920test {

	public static void main(String[] args) {
		String[] str1 = {"ȫ�浿","�����","����","���ﵵ","������"};
        String[] str2 = {"like","love","pika","lonely","you"};
        String[] str3 = {"like","love","pika","lonely","you"};
        
        int[] num1 = {82,45,26,4,7,3};
        int[] num2 = {82,45,26,4,7,3};       
        int[] num3 = {82,45,26,4,7,3};
        
        //��������
        Arrays.sort(str1);  // ���ﵵ , ������ , ����� , ���� , ȫ�浿
        Arrays.sort(str2); // like , lonely , love , pika , you
        Arrays.sort(num1); // 3 , 4 , 7 , 26 , 45 , 82
        Arrays.sort(num3, 1, num3.length);  
        
        //�������� ���ڿ� �迭
        Arrays.sort(str3, Collections.reverseOrder()); // you , pika , love , lonely , like
        
        // ��������
        List <int[]> list = Arrays.asList(num2);
		Collections.reverse(list);	// ��������
        
        for (String sele1 : str1){//��������
        	System.out.print(sele1 + " ");
        }
        System.out.println();
        for (String sele2 : str2){//��������
        	System.out.print(sele2 + " ");
        }
        System.out.println();
        for (String sele2 : str3){//��������
        	System.out.print(sele2 + " ");
        }
        System.out.println();
        for (int element : num1){//��������
        	System.out.print(element + " ");
        }
        System.out.println();
        for (int element : num2){//��������
        	System.out.print(element + " ");
        }
        System.out.println();
        for (int element : num3){//�������� ��������
        	System.out.print(element + " ");
        }
        System.out.println();

	}

}
