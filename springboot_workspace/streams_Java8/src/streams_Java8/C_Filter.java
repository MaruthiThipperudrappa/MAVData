package streams_Java8;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class C_Filter {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Kotlin");
		al.add("Python");
		al.add("Jsp/html");
		al.add("aws");
		
		List<String> result=al.stream()
				.filter(str ->str.length()==4)
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		long Count=al.stream()
				.filter(str ->str.length()==6)
				.count();
		
		
		System.out.println(Count);
		
		
		

	}

}
