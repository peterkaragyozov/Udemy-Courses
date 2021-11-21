import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("d2", "a2", "b1", "b3", "c", "a555")
	    .filter(s -> s.startsWith("a"))
	    .map(s -> s.toUpperCase() + "Peps")
	    .sorted((s1, s2) -> s1.compareTo(s2))
	    .forEach(s -> System.out.println(s));
	}

}
