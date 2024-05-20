package com.learn.funct;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgram1 {

	public static void main(String[] args) {
		Function<Integer, Integer> square = i->i*i;
		Predicate<Integer> checkOddNumber = i->i%2==0;
		System.err.println(square.apply(4));
		System.err.println(checkOddNumber.test(5));
//		()->System.err.println("this is lambda");
	}

}
