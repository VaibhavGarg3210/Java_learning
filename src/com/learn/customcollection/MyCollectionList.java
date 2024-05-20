package com.learn.customcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCollectionList {
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(45);
		array.add(78);
		array.add(96);
		array.add(1);
		array.add(9);
		array.add(77);
		System.err.println(array);
		//Collections.sort(array,new MyComparator());
		Comparator<Integer> c = (i1,i2)-> (i1<i2)?-1: (i1>i2)?1:0;
		Collections.sort(array,c);
		System.err.println(array);
	}

}

class MyComparator implements Comparator<Integer>{

	//Assending Order
	@Override
	public int compare(Integer i1, Integer i2) {
		if (i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}
	
}
