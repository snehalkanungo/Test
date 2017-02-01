package com.jnit.genericconcept;

public class GroundShippable<U> implements InterfaceShippable<U>{

	@Override
	public void ship(U u) {
        System.out.println(u);
	}
	
	
	public static void main(String[] args) {
		GroundShippable<Integer>gs = new GroundShippable<>();
         gs.ship(10);
       
	}

	

}
