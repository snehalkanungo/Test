package com.jnit.genericconcept;

import java.util.ArrayList;
import java.util.List;

// Generic property, generic method and generic class
public class GenericMain {
	
	public static void main(String[] args) {
		
	
   List<String>intsum = new ArrayList<>();
	//instsum.add("1");
   
   Box<Integer>b1 = new Box<>();
   b1.setContnet(10);
   
   Box<Integer>b2 = new Box<>();
   b2.setContnet(100);
   Box<String>b3 = new Box<>();
   b3.setContnet("hello");
}
}