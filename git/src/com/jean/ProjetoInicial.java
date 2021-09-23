package com.jean;

import com.jean.model.shark;

public class ProjetoInicial {

	public static void main(String[] args) {
		
		shark Shark = new shark();
		Time time = new Time();		
		
		System.out.println(Shark);
		System.out.println(time);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello People!");*/
	}

}

class Time {
	private String nome;
	private String npag;
}
