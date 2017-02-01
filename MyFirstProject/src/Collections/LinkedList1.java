package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Integer>linklist = new LinkedList<>();
		linklist.add(11);
		linklist.add(33);
		linklist.add(21);
		linklist.add(1);
		
		Collections.sort(linklist); //sorting in increasing order
		// Collections.reverse(linklist); //sorting in decreasing order
		for(Integer l : linklist){
			System.out.println(l);
		}
		System.out.println("111111-----------------------------------------");
		
		System.out.println(linklist.get(1));
		System.out.println(linklist.lastIndexOf(21)); 
		linklist.add(1, 4);// boolean value
		System.out.println("22222-----------------------------------------");
		
		Collections.sort(linklist); //sorting in increasing order
		for(Integer l : linklist){
			System.out.println(l);
		}
		System.out.println("3333-----------------------------------------");
		
		
		LinkedList<String>linklist1 = new LinkedList<>();
		linklist1.add("abc");
		linklist1.add("c");
		linklist1.addFirst("bb");
		linklist1.addLast("bbc");
		for(String ll : linklist1){
			System.out.println(ll);
		}
		linklist1.removeFirst();
		linklist1.removeLast();
		System.out.println("44444-----------------------------------------");
		
		for(String ll : linklist1){
			System.out.println(ll);
		}
		System.out.println("44444-----------------------------------------");
         Predicate<String>pd = new Predicate<String>() {
        	 @Override
        	public boolean test(String t) {
        		return t.startsWith("a"); //Prints that starts with a
        	}
		};
		linklist1.removeIf(t -> t.startsWith("a")); //remove that starts with a. this is lambda expression.
		for(String ll : linklist1){
			System.out.println(ll);
		}
	
//removeIf is a in-built method in List and newly added in Java8. 
// [ t -> t.startsWith("a")); is a lambda expression of Predicate i.e. above 4 lines of Predicate.]
//	But we have to use removeIf and Predicate together to perform removal operation. 	

	System.out.println("44444-----------------------------------------");
	
//Looping through a collection(on list and set): It uses ForEach loop and Consumer interface.
//Consumer is a functionl interface in java. forEach accepts or uses Consumer interface only of type String. 
	
	 Consumer<String>con = new Consumer<String>() {
	    public void accept(String t) { //accept is inbuilt method in consumer whichis of void type ie. no return type.
			 System.out.println(t);
		 }
	};
	linklist1.forEach(con); //1 way
	linklist.forEach(t -> System.out.println(t)); //2 way
	//above are 2 ways to get output.
	}
}