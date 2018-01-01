package com.vt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationInheritenceDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Student obj = new Student("Hai");
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
		Student obj1 = (Student) ois.readObject();
	
		System.out.println(obj1.getName());
		System.out.println(obj1.getId());
		ois.close();
		fis.close();
	}

}
