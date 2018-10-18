package com.java.nestedclass;

public class MainClass {

	public static void main(String[] args) {
//		OuterClass outer = new OuterClass();
//		OuterClass.InnerClass inner = outer.new InnerClass();
//		inner.add(5);
//		
		OuterClass.InnerClass inner2 = new OuterClass.InnerClass();
		OuterClass.InnerClass inner3 = new DetailInnerClass.InnerClass();
	}
}
