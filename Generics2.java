package Generic;

public class Generics2<E> {
	E[] myXArray;
//	Y[] myYArray;
//	Z[] myZArray;
	
	
	
	

	public Generics2(E[] a) {
		this.myXArray=a;
	}

	public static void main(String[] args) {
		//Generics takes Multiple Datatypes to same method or class, 
		//so that we dont have to write same logic for different datatypes
		Integer[] a = {1,2,3};
		Double[] b = {1.1,2.2,3.3};
		Character[] c = {'a','b','c'};
		
		new Generics2<Integer>(a).toPrint();
		new Generics2<Double>(b).toPrint();
		new Generics2<Character>(c).toPrint();
		
		//toPrint(a);
		//toPrint(b);
		//toPrint(c);
	}

	private void toPrint() {
		toPrint(myXArray);
		
	}

	private static<E> void toPrint(E[] inputArray) {
		for (E element: inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
		
	}

}
