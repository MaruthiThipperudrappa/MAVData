package streams_Java8;

import java.lang.reflect.InvocationTargetException;

public class NewInstanceMethod {

	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException, NoSuchMethodException, SecurityException {
	
		
		Employee e=new Employee();
		System.out.println(e);
		e.name="maruthi";
		
		System.out.println(e.name);
		
		//creating object with new instance
		
		Employee em=(Employee) Class.forName("streams_Java8.Employee").newInstance();
		
		System.out.println(em.name);
		em.name="once upon a time";
		System.out.println(em.name);
		
		
		System.out.println("**********************");
		
		//Employee em1=(Employee) Class.getConstructor().newInstance();;
		
		/*
		 * Class<?> cee=Class.forName("Employee"); Constructor<Employee>
		 * ctor=(Constructor<Employee>) cee.getConstructor(Employee.class);
		 * 
		 * Employee pem=ctor.newInstance(Employee.class);
		 * System.out.println("************************"); System.out.println(pem);
		 */
	}

}
