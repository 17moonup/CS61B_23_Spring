/** This is a practice for [CS61B Spring23] in Lecture1:
 HW 0B : A Java Crash Course ( Part 2 )
 Goals and Outcomes:
 * Understand how fundamental data structures in Python translate to Java
 * Be able to read short Java snippets that use data structures
 * Be able to implement programs in Java that use data structures
Created Time: 23-6-21
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

public class Hw01b {
//	Arrays
	public static void arrays() {
	int[] zeroedArray = new int[3];					//  Declaration ---> Array.
	int[] array = {4,2,0};							//  Initialization ---> 4,7,10
	array[0] = 5;									//  Substitudtion the element in an array by index
	System.out.println("FirstValue:" + array[0]);		
	System.out.println("StringTypeArray: " + Arrays.toString(array));		//	Transforming type(array) to String. Arrays.toString
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
//	Sets
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
//  Dictionaries/Maps
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
public static void main (String[] args) {
	//arrays();
	//lists();
	//set();
	//map();
	}
}