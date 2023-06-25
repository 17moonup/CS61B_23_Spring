//	SLLists, Nested Classes, Sentinel Nodes

//	Created On: 23-6-25

public class Lecture4 {
// Improvement #1: Rebranding and Culling
public class IntList {
	private int first;
	private IntList rest;
	//Use private keyword to prevent code in other classes from using members of a class.
	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}
} 

// public class IntNode {
// 	public int item;
// 	public IntNode next;

// 	public IntNode(int i, IntNode n) {
// 		item = i;
// 		next = n;	
// 	}
// }

//	Improvement #2: Bureaucracy
//	IntNode X = new IntNode(10, null);
//	SLList Y =new SLList(10);

//	Improvement	#5:	Fast size() 
//	SLList class acts as a middle man between user and the naked recursive data
//	structure. Allows us to store meta information about entire list.
//	Object-oriented	programming approach 
public class SLList {
	private IntNode first;
//	Improvement #3: Access Control
	public SLList(int x) {
		first = new IntNode(x, null);
	}
/**	Static Nested Classes
 * 	If the nested class never uses any instance variables or methods
 * 	of the out class, declare it static.
 * 	Static means:
 * 	1. Static classes cannot access outer class's instance variables or methods.
 * 	2. Results in a minor savings of memory.
 */
//	Improvement #4:	Nested Classes
	public static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}
	public void addFirst(int x) {
		first = new IntNode(x,first);
	}	
	public int getFirst() {
		return first.item;
	}
}
public static void main(String[] args) {
		SLList L = new SLList(15);
		L.addFirst(10);
		int x = L.getFirst();
		System.out.println(x);
	}
}