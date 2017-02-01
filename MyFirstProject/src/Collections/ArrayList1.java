package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
 
	public static void main(String[] args) {
		List<String>intsum = new ArrayList<>();
		intsum.add("new");
		intsum.add("hello");
		intsum.add("world");
		intsum.add("usa");
		
		//System.out.println(intsum);
		Collections.sort(intsum);	
	for(String s : intsum){
			System.out.println(s);
		}
		System.out.println(intsum.size());
	System.out.println("-----------------------------------------");
	
	    System.out.println(intsum.remove("usa")); //boolean value
		System.out.println(intsum.contains("new")); //boolean value
		System.out.println(intsum.isEmpty()); //boolean value
		System.out.println(intsum.indexOf("hello"));
	    System.out.println(intsum.set(0,"old"));  //set new value but returns original value 
	System.out.println(intsum.get(0));
	System.out.println("-----------------------------------------");		
	
	for(String s1 : intsum){
			System.out.println(s1);
		}
	System.out.println("-----------------------------------------");
	
	Collections.sort(intsum);
	List<GeneralInfo>gfo = new ArrayList<>();
	Collections.sort(gfo);//This 3 lines will give error bcoz it consideres the objects of Generalinfo
//  are different.So to make it usable, we need to implement camparable interfaces and use compareTo() method.
	
	//Custom Comparator class(or interface kind of) that is using compareTo() method.
	Collections.sort(gfo,(gg1,gg2) -> gg1.getCity().compareTo(gg2.getCity()));
	}
}
