package streams_Java8;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapSortingByKey {

	public static void main(String[] args) {
		Map<String, Integer> itemtoprice=new HashMap<>();
		itemtoprice.put("Sony Bravia",10000);
		itemtoprice.put("Apple iphone",79000);
		itemtoprice.put("JBL",5000);
		itemtoprice.put("HP Laptop",100000);
		itemtoprice.put("Samsung galaxy",8000);
		
		itemtoprice.entrySet().parallelStream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("");
		
		itemtoprice.entrySet().parallelStream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
				
		itemtoprice.entrySet().stream()
		.filter(map ->Objects.nonNull(itemtoprice)).collect(Collectors.toList());
	}
}
