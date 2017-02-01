package com.jnit.genericconcept;

//Generic Interface of type T. In the class the T can be anything like of type Car, Book,Laptop.
//Main method class is Laptop. 
//And another main method class is GroundShippable. 
public interface InterfaceShippable<T> {
	
	public void ship(T t);

}
