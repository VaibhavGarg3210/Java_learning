package com.learn.funct;

public class FunctionInterCause{
	public static void main(String[] args) {
		FunctionInterCauseInterface  cause = new ImplementationFuntional();
		//this is before functional interface in java 8
		cause.myInterMethod();
		// we can try this also using functional interface
		FunctionInterCauseInterface causeTwo = ()->{System.err.println("This is without use child class");};
		causeTwo.myInterMethod();
		
		FunctionInterCauseInterfaceWith causeInterfaceWith = new FunctionInterCauseInterfaceWithClass();
		System.err.println(causeInterfaceWith.myInterMethodTwo(2, 5));
		FunctionInterCauseInterfaceWith causeInterfaceWithLam = (a,b)->{return a-b;};
		System.err.println(causeInterfaceWithLam.myInterMethodTwo(2, 10));
	}
}

interface FunctionInterCauseInterfaceWith{
	int myInterMethodTwo(int a,int b);
}

class FunctionInterCauseInterfaceWithClass implements FunctionInterCauseInterfaceWith{

	@Override
	public int myInterMethodTwo(int a, int b) {
		return a*b;
		
	}
	
}

interface FunctionInterCauseInterface {

	void myInterMethod();
}

class ImplementationFuntional implements FunctionInterCauseInterface{

	@Override
	public void myInterMethod() {
		System.err.println("This is Child Class");
	}
}

