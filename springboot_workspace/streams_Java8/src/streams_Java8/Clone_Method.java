package streams_Java8;

public class Clone_Method {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e= new Employee();
		
		Employee e1=(Employee) e.clone();
		
		System.out.println(e1);



	}

}
