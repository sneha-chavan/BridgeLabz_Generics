package Generic;

public class Generics<E> {
	E[] myArray;
	
	
	
	public Generics(E[] myArray) {
		super();
		this.myArray = myArray;
	}

	public static void main(String[] args) {
		//Generics takes Multiple Datatypes to same method or class, 
		//so that we dont have to write same logic for different datatypes
		Integer[] a = {1,2,3};
		Double[] b = {1.1,2.2,3.3};
		Character[] c = {'a','b','c'};
		
		new Generics<Integer>(a).toPrint();
		new Generics<Double>(b).toPrint();
		new Generics<Character>(c).toPrint();
		
		//toPrint(a);
		//toPrint(b);
		//toPrint(c);
	}

	private void toPrint() {
		toPrint(myArray);
		
	}

	private static<E> void toPrint(E[] inputArray) {
		for (E element: inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
		
	}

}
