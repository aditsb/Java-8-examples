import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LambdaFunctionExample {
	public Map<String, Integer> filter(List<String> names, Function<String, Integer> f) {
		Map<String, Integer> filteredNames = new HashMap<String, Integer>();
		for (String st4 : names) {
			filteredNames.put(st4, f.apply(st4));

		}

		return filteredNames;

	}

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		System.out.println("Before Sorting");
		names.add("XUZ");
		names.add("XABC");
		names.add("ASDF");
		names.add("SSSD");
		names.forEach(System.out::println);

		Collections.sort(names, (String st4, String s5) -> st4.compareTo(s5));
		System.out.println("After Sorting");
		names.forEach(System.out::println);
		System.out.println("After filtering");

		new LambdaFunctionExample().filter(names, (String s) -> s.length()).entrySet().forEach(entry -> {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		});
	}
}