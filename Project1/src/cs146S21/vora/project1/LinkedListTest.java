package cs146S21.vora.project1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	@DisplayName("Adding Values to LinkedList")
	public void testInsertItem() {
		// testing to see if it recognizes 2 values in the LinkedList
		// this test is also checking the insertItem Functionality
		LinkedList A = new LinkedList();
		long timeStart = System.currentTimeMillis();
		A.insertItem("hi");
		A.insertItem("hello");
		A.insertItem("hello");
		long timeEnd = System.currentTimeMillis();
		long totalTime1 = timeEnd - timeStart;
		System.out.println("The time it takes to insert values: " + totalTime1);
		// At the event of two identical items being added, the identical item is not
		// added
		long timeStart2 = System.currentTimeMillis();
		int actual = A.countNumValue(A);
		long timeEnd2 = System.currentTimeMillis();
		long totalTime2 = timeEnd2 - timeStart2;
		System.out.println("The time it takes to count values: " + totalTime2);
		assertTrue(actual == 2);
	}

	@Test
	@DisplayName("Deleting From LinkedList")
	public void testInsertItemsNull() {
		// testing to see if it recognizes 0 values in the LinkedList
		LinkedList A = new LinkedList();
		LinkedList B = new LinkedList();
		A.insertItem("data");
		A.insertItem("science");
		A.insertItem("ai");
		A.insertItem("robots");
		int checkA = A.countNumValue(A);
		assertTrue(checkA == 4);
		long timeStart2 = System.currentTimeMillis();
		A.deleteValue("robots");
		long timeEnd2 = System.currentTimeMillis();
		long totalTime2 = timeEnd2 - timeStart2;
		System.out.println("The time it takes to delete a value: " + totalTime2);
		checkA = A.countNumValue(A);
		assertTrue(checkA == 3);
	}

	@Test
	@DisplayName("Adding 0 Values in LinkedList")
	public void testDeleteValue() {
		// testing to see if it recognizes 0 values in the LinkedList
		LinkedList A = new LinkedList();
		int actual = A.countNumValue(A);
		assertTrue(actual == 0);
	}

	@Test
	@DisplayName("Determining if Item is in Set")
	public void testCheckItemExists() {
		// testing to see if it recognizes 0 values in the LinkedList
		LinkedList A = new LinkedList();
		long timeStart2 = System.currentTimeMillis();
		A.insertItem("music");
		A.insertItem("chocolate");
		A.insertItem("sleep");
		Boolean expected = false;
//		Boolean actual = A.checkItemExists("music", A);
		Boolean actual = A.checkItemExists("hi", A);
		long timeEnd2 = System.currentTimeMillis();
		long totalTime2 = timeEnd2 - timeStart2;
		System.out.println("The time it takes to determine value in set " + totalTime2);
		assertTrue(actual == expected);
	}

	@Test
	@DisplayName("Finding Reference to Value")
	public void testReturnRef() {
		// testing to see if it recognizes 0 values in the LinkedList
		LinkedList A = new LinkedList();
		long timeStart2 = System.currentTimeMillis();
		A.insertItem("hi");
		A.insertItem("hello");
		int actual = A.returnRef("hi");
		int expected = 1;
		long timeEnd2 = System.currentTimeMillis();
		long totalTime2 = timeEnd2 - timeStart2;
		System.out.println("The time it takes to determine value in set " + totalTime2);
		assertTrue(actual == expected);
	}

	@Test
	@DisplayName("Finding Union Between Two Lists")
	public void testListUnion() {
		// testing to see if it recognizes 0 values in the LinkedList
		LinkedList A = new LinkedList();
		A.insertItem("hi");
		A.insertItem("hello");
		A.insertItem("bye");
		LinkedList B = new LinkedList();
		LinkedList C = new LinkedList();
		B.insertItem("hi");
		B.insertItem("apple");
		B.insertItem("mangos");
		long timeStart2 = System.currentTimeMillis();
		C.listUnion(A, B);
		int actual = C.countNumValue(C);
		int expected = 5;
		// union of A and B should result in 5 values
		long timeEnd2 = System.currentTimeMillis();
		long totalTime2 = timeEnd2 - timeStart2;
		System.out.println("The time it takes to determine union between sets " + totalTime2);
		assert (actual == expected);
	}

	@Test
	@DisplayName("Finding Intersection Between Two Lists")
	public void testListIntersection() {
		// testing to see if it recognizes 0 values in the LinkedList
		LinkedList A = new LinkedList();
		A.insertItem("hi");
		A.insertItem("hello");
		A.insertItem("bye");
		LinkedList B = new LinkedList();
		LinkedList C = new LinkedList();
		B.insertItem("hi");
		B.insertItem("apple");
		B.insertItem("mangos");
		long timeStart2 = System.currentTimeMillis();
		C.listIntersection(A, B);
		int actual = C.countNumValue(C);
		int expected = 1;
		// intersection of A and B should result in 1 value
		long timeEnd2 = System.currentTimeMillis();
		long totalTime2 = timeEnd2 - timeStart2;
		System.out.println("The time it takes to determine the intersection of the sets " + totalTime2);
		assert (actual == expected);
	}

}
