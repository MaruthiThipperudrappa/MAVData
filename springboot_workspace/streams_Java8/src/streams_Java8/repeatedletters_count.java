package streams_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class repeatedletters_count {

	public static void main(String[] args) {
		String[] s= {"s","a","s","a"};	
		List<String> l = new ArrayList<String>();
		//l.add(0,1);
		l.addAll(l);
		List<String> st = l.stream().sorted((s1, s2) -> s1.compareTo(s2))
				/* .distinct() */.collect(Collectors.toList());
		System.out.println(st);
		

}
}

