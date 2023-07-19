package streams_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class I_Map {

	public static void main(String[] args) {
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(18);
		in.add(31);
		in.add(62);
		in.add(33);
		in.add(74);
		in.add(98);
		
		List<Integer> all=in.stream().map(str ->str+10).collect(Collectors.toList());
				//(System.out::println);
		System.out.println(all);

		List<Integer> all1=in.stream()
				.filter(str ->str>50)
				.map(str->str+10)
				.collect(Collectors.toList());
		System.out.println(all1);
		
		
	}

}
