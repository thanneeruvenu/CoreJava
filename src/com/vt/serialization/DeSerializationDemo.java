package com.vt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// serialization
		SerializableObject obj = new SerializableObject();
		obj.setA(12);
				
		FileOutputStream fos = new FileOutputStream("fis.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		fos.close();
		
		
		//deserialization
		FileInputStream fis = new FileInputStream("fis.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableObject obj1 = (SerializableObject) ois.readObject();
	
		System.out.println(obj1.getA());
		ois.close();
		fis.close();
		
		
	}

}
