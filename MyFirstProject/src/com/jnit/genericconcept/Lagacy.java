package com.jnit.genericconcept;


import java.util.ArrayList;
import java.util.List;

// pass by reference, use generics at some places and some places not.
public class Lagacy {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String>somelist = new ArrayList<>();
         somelist.add("hello");
         addSomethingnew(somelist);
         System.out.println(somelist);
        
	}
	
        public static void addSomethingnew(List l){
        	 l.add("Meow");
        	 //System.out.println(l);
         }
	

}
