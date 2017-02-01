package com.jnit.genericconcept;

public class Laptop implements InterfaceShippable<Laptop> {

	@Override
	public void ship(Laptop ltp) {
		System.out.println("Shipped");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
