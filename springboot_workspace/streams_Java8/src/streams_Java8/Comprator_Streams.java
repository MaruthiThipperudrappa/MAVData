package streams_Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comprator_Streams {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<Employee>();
	/*	for(int i=0;i<5;i++) {*/
			al.add(new Employee("A", 20000));
			al.add(new Employee("B", 40000));
			al.add(new Employee("C", 69000));
			al.add(new Employee("D", 1000));
			al.add(new Employee("E", 90000));
			al.add(new Employee("F", 33300));
		
		List<Employee> employeeresult=
		al.stream()
				.sorted(Comparator
				.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());

		System.out.println(employeeresult);
		
		List<Employee> employeeresult1=
				al.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.collect(Collectors.toList());
		System.out.println(employeeresult1);
				
		List<Employee> Count=al.parallelStream().filter(e ->e.getSalary()>60000).collect(Collectors.toList());
		System.out.println(Count);
				
		Long Count1=al.parallelStream().filter(e ->e.getSalary()>60000).count();
		System.out.println(Count1);

	}

}
