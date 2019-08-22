package foreach;

import java.util.List;

public class View {

	public static void main(String[] args) {
		List<String> people = List.of("Jake", "Alex", "Aaron", "Gurneet");
		
		people.forEach(person -> System.out.println(person));
		
		people.forEach(System.out::println);
	}
}
