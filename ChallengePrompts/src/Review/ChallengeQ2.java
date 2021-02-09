package Review;

public class ChallengeQ2 {
	public static String uniqueLetters(String str)
	   {
		int leng = str.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <str.length(); i++) {
			int count = 0;
			for (int j = i+1; j <str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				} 	
			}
			if(count == 0) {
				sb.append(str.charAt(i));
			}
		}
		
		String unique = sb.toString();
		return unique;
	   }

}
