package streams_Java8;

 class Parent{
	 String name;
		
		void method() {
		
			System.out.println("method of Parent");
		}	
}
 
 class child extends Parent{
	 int id;
	 
	 void method() {
		 System.out.println("method of child class");
	 }
	 
 }


public class upcasting_downcasting {
	
		
	public static void main(String[] args) {
		
		System.out.println("upcasting");
		Parent p=new child();
		p.name="maruthi";
		System.out.println(p.name);
		p.method();
		
		System.out.println("*****************************");
		
		System.out.println("downcasting");
		child c=(child)p;
		c.id=1;
		System.out.println(c.id);
		c.method();
		
		

	}

}
