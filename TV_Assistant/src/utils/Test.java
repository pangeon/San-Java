package utils;

public class Test {

	public static void main(String[] args) {
		Seq<String> s1 = LinkedSeq.of("Kamil", "Adam", "Monika");
		System.out.println(s1.isEmpty());
		
		Seq<Double> s2 = LinkedSeq.of(Math.PI, Math.E, Math.abs(-99.9));
		System.out.println(s2.isEmpty());
	}

}
