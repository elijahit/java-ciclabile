package org.lessons.elijah;


public class Main {

	public static void main(String[] args) {
		System.out.println("ARRAY CON COSTRUTTORE");
		arrayWithConstructor();
		System.out.println();
		
		System.out.println("ARRAY SENZA COSTRUTTORE");
		arrayWithoutConstructor();
		
	}

	private static void arrayWithoutConstructor() {
		Ciclabile array = new Ciclabile();
		array.addElemento(1);
		array.addElemento(2);
		array.addElemento(3);
		
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.hasAncoraElementi());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.hasAncoraElementi());
		array.getArray();
	}

	private static void arrayWithConstructor() {
		Integer[] arrayContainer = {1,2,3,4,5,6,7,8,9,10};
		Ciclabile array = new Ciclabile(arrayContainer);
		
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.hasAncoraElementi());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.getElementoSuccessivo());
		System.out.println(array.hasAncoraElementi());
		array.getArray();
	}

}
