package maxSubArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class BruteForce {
	
	static int[] result = new int[3];
	public static int [] bruteForce(int []Arr) {
		int len = Arr.length;
		int max = Arr[0];
		int startDay = 0;
		int endDay = 0;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j<len; j++) {
				sum = Arr[j]+sum;
				if (sum > max) {
					max = sum;
					startDay=i;
					endDay =j;
				}
				result[0] = max;
				result[1] = startDay;
				result[2] = endDay;
			}
	
		}
		return result;
	}

	public static void main(String[] args) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int [] resultArr = bruteForce(a);
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
            	
            		
            		resultArr = bruteForce(checkNums);
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
