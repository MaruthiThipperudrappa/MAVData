package practice;

public class string {

	public static void main(String[] args) {
		String s1=new String("maruthi");
		char[] ch= {'m','a','r','u','t','h','i'};
		System.out.println(s1);
		System.out.println(ch);
		String s2=new String(ch);
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s3);
		String s4="maruthi";
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		String s=new StringBuilder().append(s1).append(s2).toString();
		System.out.println(s);
		String[] sentences=s3.split("\\.");
		System.out.println(s1.toUpperCase());
		StringBuffer sb=new StringBuffer(s1);
		sb.insert(1, "java");
		System.out.println(sb);
		
		
		
		
	}

}
