package com.jnit.genericconcept;
//This is custom generic class
public class Box<T> //{Box class with one generic property .i.e. T}
{

	public T contnet;

	public T getContnet() {
		return contnet;
	}

	public void setContnet(T contnet) {
		this.contnet = contnet;
	}
	
}
