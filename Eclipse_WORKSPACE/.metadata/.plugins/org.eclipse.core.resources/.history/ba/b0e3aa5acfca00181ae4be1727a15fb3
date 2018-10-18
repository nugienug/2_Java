package com.java.anonymous;

public class MainClass {
	static void printNum(Anonymous anony) {
		anony.add(5);
	}
	public static void main(String[] args) {
		Anonymous anony3 =new Anonymous() {
			
			@Override
			public void add(int num) {
				// TODO Auto-generated method stub
				System.out.println(num+startNum);
			}
		};
		printNum(anony3);
		Anonymous anony4 = new DetailAnonymous();
		printNum(anony4);
		
		printNum(new Anonymous() {
			
			@Override
			public void add(int num) {
				// TODO Auto-generated method stub
				System.out.println(num+startNum);
			}
		});
		
		
		
		
		
		
		
		
		Anonymous anony2 = new Anonymous() {
			
			@Override
			public void add(int num) {
				// TODO Auto-generated method stub
				System.out.println(num+startNum);
			}
		};

		
		
		
		new Anonymous() {
			
			@Override
			public void add(int num) {
				System.out.println(num+startNum);
				
			}
		}.add(5);
	
	}
	
	

}
