package com.learn.funct;

@FunctionalInterface
interface FunctionalInterFaceLearn {
	void m1();
}

@FunctionalInterface
interface FunctionTwo extends FunctionalInterFaceLearn {
	
}

@FunctionalInterface
interface FunctionThree extends FunctionTwo{
	void m1();
}