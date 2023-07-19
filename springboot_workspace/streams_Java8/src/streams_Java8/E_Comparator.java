package streams_Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E_Comparator {
	
	
	  private static void findDuplicatesUsingJava8(int[] inputArray) {   
	        Set<Integer> uniqueElements = new HashSet<>();
	          
	        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
	                                                .filter(i -> !uniqueElements.add(i))
	                                                .boxed()
	                                                .collect(Collectors.toSet());
	          
	        System.out.println(duplicateElements);
	        
			/*
			 * Set<Integer>
			 * duplicateElements1=Arrays.stream(inputArray).filter(i->uniqueElements.add(i)
			 * .anyMatch(uniqueElements.add(i))).
			 */	        
	    }

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Kotlin");
		al.add("Python");
		al.add("Jsp/html");
		al.add("aws");
		
		List<String> result=al.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		List<String> result1=al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("result1"+result1);
	
	
	ArrayList<Integer> in=new ArrayList<Integer>();
	in.add(18);
	in.add(31);
	in.add(62);
	in.add(33);
	in.add(74);
	in.add(18);
	
	Object[] input=in.toArray();
	
	for(Object obj:input)
		System.out.println("conversion from arraylist to array" + obj);
	
	
	
	List<Integer> result2=in.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
	System.out.println(result2);
	
	List<Integer> result12=in.stream().distinct().collect(Collectors.toList());
	System.out.println(result12);
	
	
	  int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
	  
	  System.out.println("======Duplicates Using Java 8 Streams======");
      
      findDuplicatesUsingJava8(inputArray);
	 
	
	//List<Integer> result123=in.stream().filter(i->in.).collect(Collectors.toList());
	
	}
	
}
