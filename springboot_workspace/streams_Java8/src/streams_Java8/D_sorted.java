package streams_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D_sorted {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Kotlin");
		al.add("Python");
		al.add("Jsp/html");
		al.add("aws");
		
		List<String> result=al.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		}

}
