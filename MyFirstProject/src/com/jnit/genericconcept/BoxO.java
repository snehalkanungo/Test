package com.jnit.genericconcept;
//Type erasure : it converts any type to Object type at compile time, like Box of T type 
//will be converted to Object type by automatic created class name BoxO at compile time.
public class BoxO {

	public Object contnet;

	public Object getContnet() {
		return contnet;
	}

	public void setContnet(Object contnet) {
		this.contnet = contnet;
	}

	
	
}
