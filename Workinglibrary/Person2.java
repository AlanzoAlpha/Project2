package Workinglibrary;

public class Person2 extends Absclass {

	@Override
	public void iWant() {
		System.out.println("I love to read and I want lok and exiting book to read plus a jounal for my assignment");

	}

	private String name;
	private int key;

	public Person2(String name, int key) {
		this.setKey(key);

	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

}
