package streams_Java8;

public class Singleton {
	
	
	private static Singleton singleinstance=null;
	
	public String s;
	
	private Singleton() {
		s="my name is maruthi";
	}
	
	public static synchronized Singleton getInstance() {
		if(singleinstance==null) 
			singleinstance=new Singleton();
		return singleinstance;	
	}
	public static void main(String[] args) {
		Singleton x=getInstance();
		
		Singleton y=getInstance();
		
		System.out.println(x.hashCode());

		System.out.println(y.hashCode());
		
		System.out.println(x.s);
	}

}
