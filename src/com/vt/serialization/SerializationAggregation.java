package com.vt.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAggregation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		PersonTest1 obj = new PersonTest1();
		obj.setName("Hello");
		
		Address address = new Address("123", "abc", "xyz");
		obj.address = address;

		FileOutputStream fos = new FileOutputStream("fis.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj); 
		oos.flush();
		oos.close();
		fos.close();


	}

}

class PersonTest1 implements Serializable {
	private static final long serialVersionUID = 7423610754208295771L;
	private String name;
	Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
class Address{  
	 String addressLine,city,state;  
	 public Address(String addressLine, String city, String state) {  
	  this.addressLine=addressLine;  
	  this.city=city;  
	  this.state=state;  
	 }  
	}  
