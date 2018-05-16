package utils;

public class LinkedSeq<T> implements Seq<T> {

	public static <S> Seq<S> of(S... elements) {
		Seq<S> result = Nil.nil();
		for (int i = elements.length - 1; i >= 0; i--) {
			result.cons(elements[i]);
			System.out.print(elements[i] + " ");
		}
		System.out.println();
		return result;
		
	}
	private final T first;
	
	private final Seq<T> rest;
	
	public LinkedSeq(T first, Seq<T> rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public T first() {
		return this.first;
	}

	@Override
	public Seq<T> rest() {
		return this.rest;
	}

	@Override
	public Seq<T> cons(T obj) {
		return new LinkedSeq<>(obj, rest);
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
	
}
