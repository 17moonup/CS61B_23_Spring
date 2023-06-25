//	Lecture3 : References, Recursion, and Lists

//	Created On 23-6-24

public class Lecture3() {
	//	The mystery of the Walrus.
	//	Frames		Objects
	//	  a  ------Walrus instance
	//			   |
	//	  b  ->  weight
	Walrus a = new Walrus(1000, 8.3);  //	The new key word goes out the memory finds the bits it needs the 96 bits 
	Walrus b ;						   //	and it shouts the  location which a will dutifully record.  
	b = a ;							//	a - > Walrus instance
	b.weight = 5;					//	b - > Walrus instance
	//	Declaration and Instantiation of Arrays
	int [] a;						//	Declaration creates a 64 bit box intended only for  storing a reference to an int array
	new int []{0,2,3,4,6};
	//	Instantiates a new Object && Object is anonymous!
	a = new int[](1,3,4,6);			//	Assignment:link 
	System.out.println(a);
	System.out.println(b);
}