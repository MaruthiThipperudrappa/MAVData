package streams_Java8;

public class asdfasdf {
	
	private static asdfasdf singleton=null;
	
	public String s;
	
	private asdfasdf() {
		s="my name is maruthi";
	}
	
	public static synchronized asdfasdf getInstance() {
		if(singleton==null) 
			singleton=new asdfasdf();
		return singleton;
	}
	public static void main(String[] args) {
		
		asdfasdf f=new asdfasdf();
		System.out.println(f);
		System.out.println(f.s);
	}

}
