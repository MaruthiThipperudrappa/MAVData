package streams_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreations {
	public static void main(String[] args) {
		
		String[] str=new String[] {"java","Kotlin","Python","Jsp/html","Aws"};
		Stream<String> atr=Arrays.stream(str);
		List<String> str1=atr.sorted().collect(Collectors.toList());
		
		System.out.println(str1);	
	}

}
