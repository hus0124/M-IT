package JavaTestReady;

import java.util.Arrays;

public class Prob2_9 {

	public static void main(String[] args) {
		int[][] array = {
	            { 95, 86, 72 },
	            { 83, 90, 95, 87 },
	            { 78, 84, 92, 88, 90 },
	            { 69, 86, 95 }
	        };

	        int sum = 0;
	        double avg = 0.0;
//작성위치
	        int count = 0;
	        
	        for (int i = 0; i < array.length; i++){
	        	for (int j = 0; j < array[i].length; j++){
	        		sum += array[i][j];
	        		count++;
	        	}
	        }
	        avg = (double)sum / count;
	        
	        System.out.println("sum: " + sum);
	        System.out.println("avg: " + avg);

	        
	}

}
