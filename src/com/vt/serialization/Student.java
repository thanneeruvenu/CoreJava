package com.vt.serialization;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	private static final long serialVersionUID = 1706196587224686613L;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
