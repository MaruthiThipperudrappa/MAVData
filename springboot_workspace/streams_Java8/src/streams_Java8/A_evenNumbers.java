package streams_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A_evenNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		List<Integer> result=list.stream()
		.filter(num ->num%2==0)
		.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> result1=list.stream().distinct().collect(Collectors.toList());
		System.out.println(result1);
		
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list1.add(i);
		}}}
			
			//list1.stream().filter().collect(Collectors.toList());
		
		
		
		
		//List<Integer> mq=list.stream().filter(list->list.reverse(mq)).collect(Collectors.toList());
		/* Predicate:boolean
		 * Fuction-Input,output
		 * Supplier 
		 * Consumer */	
	
