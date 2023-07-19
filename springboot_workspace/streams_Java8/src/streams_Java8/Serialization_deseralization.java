package streams_Java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_deseralization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialization
		
		FileOutputStream fos=new FileOutputStream("Text.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee();
		oos.writeObject(e);
		
		//De-serialization
		
		@SuppressWarnings("resource")
		FileInputStream fis=new FileInputStream("Text.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee) ois.readObject();
		System.out.println(e1);
		
		
		FileOutputStream mar=new FileOutputStream("text.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream one=new ObjectOutputStream(mar);
		Employee oe=new Employee();
		one.writeObject(oe);
		
		FileInputStream ide=new FileInputStream("text.txt");
		@SuppressWarnings("resource")
		ObjectInputStream owe=new ObjectInputStream(ide);
		Employee eo=(Employee) owe.readObject();
		System.out.println("***********");
		System.out.println(eo);
		
	}

}
