package stacks;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <String>games = new Stack<String>();
		games.add("Call of Duty Ghosts");
		games.add("Super Monkey Ball");
		games.add("Guitar Hero");
		
		System.out.println(games);
		System.out.println(games.peek());
		System.out.println((games.pop()));
		System.out.println(games);
	}

}
