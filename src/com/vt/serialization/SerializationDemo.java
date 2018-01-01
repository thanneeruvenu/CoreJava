package com.vt.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		SerializableObject obj = new SerializableObject();
		obj.setA(12);
				
		FileOutputStream fos = new FileOutputStream("fis.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		fos.close();
		
	}

}
