package org.lessons.elijah;

import java.util.ArrayList;
import java.util.List;

public class Ciclabile implements ICiclabile {
	private int cicloCounter = 0;
	private Integer[] array;
	private List<Integer> arrayWithoutConstructor = new ArrayList<Integer>();
	
	public Ciclabile(Integer[] array) {
		this.array = array;
	}
	
	public Ciclabile() {
		
	}
	
	public void addElemento(int i) {
		arrayWithoutConstructor.add(i);
		this.array = arrayWithoutConstructor.toArray(Integer[]::new);
	}
	
	public int getElementoSuccessivo() {
		if(!hasAncoraElementi()) return -1;
		cicloCounter++;
		return array[cicloCounter-1];
	}
	
	public boolean hasAncoraElementi() {
		if(cicloCounter == array.length) return false;
		return true;
	}

	public void getArray() {
		List<Integer> arrayContainer = new ArrayList<>();
		for(int arrayElement: array) {
			arrayContainer.add(arrayElement);
		}
		System.out.println(arrayContainer.size() > 0 ? arrayContainer : "Array vuoto");
	}
	
	

}
