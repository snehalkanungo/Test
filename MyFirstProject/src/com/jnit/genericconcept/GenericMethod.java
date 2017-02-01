package com.jnit.genericconcept;

import java.util.List;

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Integer,String>b = new Box2<>();
		b.setContents(20);
		b.setText("hii");
		
	}
	
	//Generic method [<T> data-type method-name()]
		public static <T> void print(List<T>somelist){
			for(T t : somelist){
				System.out.println(t);
			}
		}
		
		public static <T> void printm(){
			System.out.println("hello");
		}
	}



