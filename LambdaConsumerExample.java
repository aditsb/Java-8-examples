import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumerExample {
	public static <T> void getLength(List<T> names, Consumer<T> con) {
		for (T st4 : names) {
			con.accept(st4);
		}

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

		getLength(names, (String s) -> {
			int len = s.length();
			System.out.println(len);
		});

		List<Integer> num = new ArrayList<Integer>();
		System.out.println("Before Sorting");
		num.add(123);
		num.add(230);
		num.add(200);
		num.add(560);
		num.forEach(System.out::println);
		getLength(num, (Integer s) -> {
			int len = s.sum(s, 100);
			System.out.println(s+" "+len);
		});

	}
}