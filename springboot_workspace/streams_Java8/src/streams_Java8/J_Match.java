package streams_Java8;

import java.util.ArrayList;

public class J_Match {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Kotlin");
		al.add("Python");
		al.add("Jsp/html");
		al.add("aws");
		
		
Boolean result=	al.stream().allMatch(str ->str.contains("java"));
System.out.println(result);

Boolean result1=al.stream().anyMatch(str ->str.contains("java"));
System.out.println(result1);
	}

}
