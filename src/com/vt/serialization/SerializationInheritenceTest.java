package com.vt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInheritenceTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StudentTest obj = new StudentTest();
		obj.setId(123);
		obj.setName("Hello");

		FileOutputStream fos = new FileOutputStream("fis.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj); 
		oos.flush();
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("fis.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentTest obj1 = (StudentTest) ois.readObject();

		System.out.println(obj1.getName()); // will get default values by calling default constructor by jvm
		System.out.println(obj1.getId());
		ois.close();
		fis.close();

	}

}

class PersonTest {
	public PersonTest() {
		name = "demo";
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class StudentTest extends PersonTest implements Serializable {
	private static final long serialVersionUID = -7687208573452473747L;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
