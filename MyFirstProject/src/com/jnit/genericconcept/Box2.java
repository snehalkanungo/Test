package com.jnit.genericconcept;

//2 generic properties together, like T & U, they can be anything like Integer,String, Student, etc.
//Its main method class is GenericMethod-refer that class.

public class Box2<T,U> {

	private T contents;
	private U text;
	
	public T getContents() {
		return contents;
	}
	public void setContents(T contents) {
		this.contents = contents;
	}
	public U getText() {
		return text;
	}
	public void setText(U text) {
		this.text = text;
	}
	
}
