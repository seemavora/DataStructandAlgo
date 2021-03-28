package maxSubArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Kadanes {
	
	static int[] result = new int[3];
	public static int[] kadaneMax(int [] nums) {
		int len = nums.length;
		int startDay = 0;
		int endDay = 0;
		
		int tempMax = 0;
		int tempStart = 0;
		
		int max = Integer.MIN_VALUE;
		{
	 
	        for (int i = 0; i < len; i++)
	        {
	            tempMax += nums[i];
	 
	            if (max < tempMax)
	            {
	                max = tempMax;
	                startDay = tempStart;
	                endDay = i;
	            }
	 
	            if (tempMax < 0)
	            {
	                tempMax = 0;
	                tempStart = i + 1;
	            }
	        }

	    }
	 
		result[0] = max;
		result[1]= startDay;
		result[2] = endDay;
		return result;
		
	}
	public static void main(String[] args) {
		   
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int [] resultArr = kadaneMax(a);
		int maxPay = resultArr[0];
		int startDay = resultArr[1] +1;
		int endDay = resultArr [2] + 1;
        System.out.println("Maximum contiguous sum is " +
                                       maxPay + " starting at day " + startDay + " ending at " +endDay);

        try {
            File myObj = new File("maxSumtest.txt");
            Scanner myReader = new Scanner(myObj);
            int [] tall = new int [100];
            while (myReader.hasNextLine()) {
            	String data = myReader.nextLine();
            	String[] dataSplit = data.split("  ");
            	int[] numbers = new int[dataSplit.length];
            	for(int i = 0; i <dataSplit.length; i ++) {
            		try {
            			numbers[i] = Integer.parseInt(dataSplit[i]);
            		}catch(NumberFormatException e){
            			
            		}
            	}
            	int[] checkNums = Arrays.copyOfRange(numbers, 0, 100);
            	
            		
            		resultArr = kadaneMax(checkNums);
            		maxPay = resultArr[0];
            		startDay = resultArr[1];
            		endDay = resultArr [2];
            		if(maxPay > 0) {
            			
            			System.out.println("Maximum contiguous sum is " +
            					maxPay + " starting at day " + startDay + " ending at " +endDay);
//              System.out.println(data);
            		}
            	
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
	}

}
