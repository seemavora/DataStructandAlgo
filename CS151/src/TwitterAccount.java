
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TwitterAccount {
    private int numberOfFollowers;
    private String username;

    public TwitterAccount(int numberOfFollowers, String username) {
        this.numberOfFollowers = numberOfFollowers;
        this.username = username;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return numberOfFollowers + ", " + username;
    }
    public static void main(String[] args) {
        ArrayList<TwitterAccount> accounts = new ArrayList<>();
        accounts.add(new TwitterAccount(22, "maria"));
        accounts.add(new TwitterAccount(550900, "lexfridman"));
        accounts.add(new TwitterAccount(340900, "foundmyfitness"));
        accounts.add(new TwitterAccount(22, "abcdxyz"));
        // Use Collections.sort with your comparator as a second argument)
        //
        
//        Collections.sort(accounts, new TwitterComparator());
//        for(TwitterAccount t : accounts) {
//        	System.out.println(t); 
//        }
        
      Comparator<TwitterAccount> comp = (x,y) -> x.getUsername().compareTo(y.getUsername());
      
    
    
    }
}

//class TwitterComparator implements Comparator<TwitterAccount>{
//	
//	public int compare(TwitterAccount x, TwitterAccount y) {
//		return -1 *x.getUsername().compareTo(y.getUsername());
//	}
//}