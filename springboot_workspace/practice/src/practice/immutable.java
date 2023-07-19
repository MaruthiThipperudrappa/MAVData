package practice;

import java.util.StringTokenizer;

final class employee{
	final String pancardNumber;
	employee(String pancardNumber){
		this.pancardNumber=pancardNumber;
	}
	public String getPancardNumber() {
		return pancardNumber;
	}
}

 public class immutable {
	public static void main(String[]args) {
		employee e= new employee("ABC 123");
		String s1=e.getPancardNumber();
		System.out.println(s1);
		StringTokenizer st=new StringTokenizer(s1);
		
		System.out.println("Next token " +st.nextToken());
	}

}
