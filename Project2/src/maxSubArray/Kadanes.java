package maxSubArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Kadanes {
	
	static int[] result = new int[3];
	public static int[] kadaneMax(int [] nums) {
		int len = nums.length; // length of array
		int startDay = 0;//tracks starting index
		int endDay = 0; //tracks ending index
		
		int tempMax = 0; //temp max
		int tempStart = 0; //temp start
		
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
	 //returns array of result, first val is max, second is start day and third is end day
		result[0] = max; 
		result[1]= startDay;
		result[2] = endDay;
		return result;
		
	}
}
