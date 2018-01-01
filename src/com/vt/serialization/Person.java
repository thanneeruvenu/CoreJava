package com.vt.serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 2007558685936724583L;

	public Person(String name) {
		this.name = name;
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
