package com.jnit.snehal;

import java.util.Arrays;

//import java.awt.List;

import java.util.List;

public class HelloUSA { // toString() method

	String fname, lname;

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) { 
		this.fname = fname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[first=" + fname + " , last= " + lname + "]";
	}

    @Override
	public boolean equals(Object obj) {  //equals method
		// TODO Auto-generated method stub
		if (obj instanceof HelloUSA) {
			HelloUSA ha = (HelloUSA)obj;
			return ha.fname.equals(fname) && ha.lname.equals(lname);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello MacBook Air");
		HelloUSA h = new HelloUSA();
		h.setFname("John");
		h.setLname("Michael");
		System.out.println(h);
		

		List<Integer> intnum = Arrays.asList(1, 2, 3, 4);
		System.out.println(intnum);
		
		int a[] = { 3, 4, 5, 6 };
		System.out.println(Arrays.toString(a));
		//System.out.println(a);

		HelloUSA h1 = new HelloUSA();
		h1.setFname("John");
		h1.setLname("Michael");
		System.out.println(h == h1);
		System.out.println(h.equals(h1));

		String a1="abc";
		String a2="abc";
		System.out.println(a1.equals(a2));
		
	}

}
