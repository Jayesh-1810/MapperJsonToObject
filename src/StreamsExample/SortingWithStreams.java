package StreamsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWithStreams {

	public static void main(String[] args) {

//		Given a list of custom objects , 
//		sort the list based on various parameter of the object.
//		Suppose you have list of employee object then sort the list based on name ,
//		salary etc.
//		try to prepare this questions to solve using traditional way 
//		and using java 8 stream api.
		
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "John", 150, "ny", List.of("JAVA", "DB")));
		emplist.add(new Employee(2, "Doe", 500, "ny", List.of("JAVA", "DB", "SPRING")));
		emplist.add(new Employee(3, "Harry", 1000, "cal", List.of("")));
		emplist.add(new Employee(4, "Andrew", 125, "ny", List.of("JAVA", "DB", "java")));
		emplist.add(new Employee(5, "JD", 120, "nj", List.of("DB", "MS")));
		emplist.add(new Employee(6, "Marc", 120, "nj", List.of("DB", "MS", "KAFKA", "J2EE")));
		emplist.add(new Employee(7, "JP", 1200, "cal", List.of("DB", "KAFKA", "J2EE")));
		
		// default by id
		Collections.sort(emplist, new Comparator<Employee>() {
		
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		Collections.sort(emplist, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
		
		System.out.println("======================sorted by Id================");
		emplist.forEach(System.out::println);
		
		
		
		// default by name
		Collections.sort(emplist, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
		System.out.println("======================sorted by name(traditional approach)================");
		emplist.forEach(System.out::println);
		
		// Java 8 Stream API Way-- using comparator
		
		List<Employee> sortedListwithnames = emplist.stream()
				.sorted(Comparator.comparing(e->e.getName()))
				.collect(Collectors.toList());
		
		System.out.println("======================sorted by name(Java 8 Stream API Way)================");
		sortedListwithnames.forEach(System.out::println);
		
		// traditonal way
		// we can create a comparator and then pass it to collections.sort method
		// without converting to stream
		System.out.println("=====================================================");
		emplist.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by Name:");
        emplist.forEach(System.out::println);
		
		

	}

}
