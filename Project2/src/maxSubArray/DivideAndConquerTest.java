package maxSubArray;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class DivideAndConquerTest {

	@Test

	public void test() {
		DivideAndConquer d = new DivideAndConquer();
		try {
			File myObj = new File("maxSumtest.txt");
			Scanner myReader = new Scanner(myObj);
			int line = 0;
			while (myReader.hasNextLine()) {
				line++;
				String data = myReader.nextLine();
				String[] dataSplit = data.split("  ");
				int[] numbers = new int[dataSplit.length];
				for (int i = 0; i < dataSplit.length; i++) {
					try {
						numbers[i] = Integer.parseInt(dataSplit[i]);
					} catch (NumberFormatException e) {

					}
				}
				int[] checkNums = Arrays.copyOfRange(numbers, 0, 100);

				int max = d.maxSubSum(checkNums, 0, checkNums.length-1);
				int maxPay = max;
				if (numbers.length >= 2) {

					assertEquals(numbers[100], maxPay);
	
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
