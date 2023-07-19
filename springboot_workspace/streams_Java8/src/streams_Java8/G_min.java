package streams_Java8;

import java.util.ArrayList;


public class G_min {

	public static void main(String[] args) {
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(18);
		in.add(31);
		in.add(62);
		in.add(33);
		in.add(74);
		in.add(98);
		
		Integer result=in.stream().min((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println(result);
		

	}

}
