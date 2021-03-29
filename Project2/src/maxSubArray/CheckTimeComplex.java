package maxSubArray;

import java.util.Random;

public class CheckTimeComplex {

	static double elapsedTime = 0;
	public static void main(String[] args) {

checkTime();
	}
	public static double checkTime() {
		
		Random random = new Random();
//		random.setSeed(20);
		BruteForce b = new BruteForce();
		Kadanes k = new Kadanes();
		DivideAndConquer dc = new DivideAndConquer();
		for(int i =0; i<10; i++){
			int [] randArr = new int[100];
			for(int j = 0;j<100; j++) {	
				int randomInteger = random.nextInt();
				randArr[j] = randomInteger;
			}
			
			long timeStart = System.currentTimeMillis();
//			k.kadaneMax(randArr);
//			dc.maxSubSum(randArr, 0, randArr.length-1);
			b.bruteForce(randArr);
			long timeStop = System.currentTimeMillis();
			elapsedTime = (timeStop - timeStart) + elapsedTime;
		}
		System.out.println(elapsedTime/10);
		return (elapsedTime/10);
	}

}
