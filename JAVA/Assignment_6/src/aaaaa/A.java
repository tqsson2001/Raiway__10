package aaaaa;

public class A {
	static int count = 0;
	int tuoi = 0;
	String name;
	
	public A(String name) {
		count++;
		tuoi++;
		this.name = name;
	}
	
	public String toString() {
		return "count = " + count + ", name = " + name + ", tuoi = " + tuoi;
	}
	
}
