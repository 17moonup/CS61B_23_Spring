/** This is a practice for [CS61B Spring23] in Lecture1:
 HW 0B : A Java Crash Course ( Part 2 )
 Goals and Outcomes:
 * Understand how fundamental data structures in Python translate to Java
 * Be able to read short Java snippets that use data structures
 * Be able to implement programs in Java that use data structures
Created On: 23-6-21
*/
import java.util.Arrays;
import java.util.ArrayList;							//  util is utility, which means reusable tools typically 
//import java.util.regex.Pattern					//  refers to a set of general-purpose, including random 
//import java.util.Random							//  number generator, array, list, regex.pattern...
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Hw0 {
//	Hw01A	->	starTriangle
	public static void main(String[] args) {
		starTriangle();
	}
	public static void starTriangle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	Arrays
	public static void arrays() {
	int[] zeroedArray = new int[3];					//  Declaration ---> Array.
	int[] array = {4,2,0};							//  Initialization ---> 4,7,10
	array[0] = 5;									//  Substitudtion the element in an array by index
	System.out.println("FirstValue:" + array[0]);		
	System.out.println("StringTypeArray: " + Arrays.toString(array));			//	Transforming type(array) to String. Arrays.toString
	System.out.println("Array's length: " + array.length);
	for (int i : array) {
		System.out.println(i);
	}
}
//	Lists
	public static void lists() {				
	List <String> lst = new ArrayList<>();		//  Declaration ---> List 
	lst.add("0");								//  Add 
	lst.add("1");
	lst.set(0, "wtf");							//  Set
	
	if (lst.contains("1")) {					//  lst.contains
		System.out.println("1 in the lst");
	}
	else {
		System.out.println("wtf");
	}
	for (String elem : lst ) {					//  elements : lst 
		System.out.println(elem);
	}											 
	System.out.println("FirstValue: " + lst.get(0));			 	//  Choose
	System.out.println("List's length: " + lst.size());				//  Size
}
//	Set
	public static void set() {
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(2);
		set.add(1);
		set.add(1);
		set.remove(1);
		System.out.println(set.size());
		if (set.contains(1)) {
			System.out.println("1 in the set");
		}
		else {
			System.out.println("wtf");
		}
		for (int i : set) {
			System.out.println(i);
		}
}
//  Dictionaries/Map
	public static void map() {
		Map<String, String> map = new HashMap<>();
		map.put("hello", "hi");
		map.put("hello", "goodbye");
		System.out.println(map.get("hello"));
		System.out.println(map.size());
		if (map.containsKey("hello")) {
    		System.out.println("\"hello\" in map");
		}
		for (String key : map.keySet()) {
    		System.out.println(key);
		}
}
//	Class
public static class Point {
//	Public for calling 
	public int x;
	public int y;
	public Point (int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	public Point() {
		this(0,0);
	}
//	Functions in class
	public double distanceTo(Point other) {
		return Math.sqrt(
			Math.pow(this.x - other.x, 2) + 
			Math.pow(this.y - other.y, 2)
		);
	}
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
	public static void point() {
		Point p1 = new Point(2,5);
		Point p2 = new Point(2,3);
		Point p3 = new Point();
		System.out.println("Point 1 : ( " + p1.x + " , " + p1.y + " ) ");
		System.out.println("distance:" + p1.distanceTo(p2));
		p1.translate(2,5);
		System.out.println("Point 1 : ( " + p1.x + " , " + p1.y + " ) ");
		System.out.println("Point 3: " + p3);
}
	//	Programs && Exception 
	public static int minIndex(int[] numbers) {
		// Assume numbers.length >= 1
		// if (numbers.length == 0) {
		// 	throw new Exception("There are no elements in the array!");
		// }		
		int m = numbers[0];
		int idx = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < m) {
				m = numbers[i];
				idx = i;
		}
	}	

	return m;	
}
	public static void point1() {
		Point p1 = new Point(2,5);
		Point p2 = new Point(2,3);
		Point p3 = new Point();
		System.out.println("Point 1 : ( " + p1.x + " , " + p1.y + " ) ");
		System.out.println("distance:" + p1.distanceTo(p2));
		p1.translate(2,5);
		System.out.println("Point 1 : ( " + p1.x + " , " + p1.y + " ) ");
		System.out.println("Point 3: " + p3);
}

//	ListExercises
//	Created on: 23-6-23

public class ListExercise {
	public static int sum(List<Integer> lst) {
		int total = 0;
		for ( int i : lst) {
			total += i;
		}
		return total;
	}
	public static List even(List<Integer> lst) {
		var le = new ArrayList<>();
		for (int i : lst) {
			if (i % 2 == 0) {
				 le.add(i);
			}
		}
		return le;
	}
	public static List common(List<Integer> L1, ArrayList<Integer> L2) {
		var lc = new ArrayList<>();
		for (int elem : L1) {
			for (int i = 0; i < L2.size(); i++) {
				if (elem == L2.get(i))
					lc.add(elem);
			}
		}
		return lc;
	}
	public static int count0ccurrencesOfC(List<String> word, char c) {
		var num = 0;
		for (String words : word) {
			for (char cha : words.toCharArray()) {
				if (cha == c) {
					num ++;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		List <Object> ls = new ArrayList<>();
		ls.add(2);
		ls.add(5);
		ls.add(6);
		ls.add("s");
		System.out.println(ls);
		var la = new ArrayList<Integer>();
		la.add(2);
		la.add(4);
		List <String> word = new ArrayList<>();
		word.add("acsd");
		System.out.println(count0ccurrencesOfC(word,'b'));
		//System.out.println(common(ls,la));
		
	}	
}

//	MapExercises
//	Created on 23-6-24
	public class MapExercise {
	//	letterToNum	
	public static Map<Character, Integer> letterToNum() {
		Map<Character, Integer> map1 = new HashMap<>();
		int number = 1; 
		for (char letter = 'a';letter <= 'z';letter++) {
			map1.put(letter,number);
			number++;
		}
		return map1;
	}
	//	Squares
	public static Map<Integer, Integer> squares(List<Integer> nums) {
		Map <Integer, Integer> map2 = new HashMap<>();
		for (int num : nums) {
			if (nums.size() == 0) {
				return map2;
			}
			else {
				map2.put(num, num * num);
			}
		}
		return map2;
	}
	//	countWords
	public static Map<String, Integer> countWords(List<String> words) {
		Map <String, Integer> map3 = new HashMap<>();
		int num = 0;
		for (String word : words) {
			int count = map3.getOrDefault(word, 0);
			map3.put(word, count + 1);
		}
		return map3;
	}
	public static void main (String[] args) {
		// var la = new ArrayList<Integer>();
		// 	la.add(2);
		// 	la.add(4);
		starTriangle();
		List<Integer> Map_nums = List.of(1,2,3,4,5);
		List<String> Map_chars = List.of("fuck", "fuck", "what");
		System.out.println(squares(Map_nums));
		System.out.println(countWords(Map_chars));
		//point1();
		//arrays();
		//lists();
		//set();
		//map();
		// int[] array = {4,2,0,-1,5};
		// System.out.println(minIndex(array));
		// System.out.println(letterToNum(nums));
		}
	}
}