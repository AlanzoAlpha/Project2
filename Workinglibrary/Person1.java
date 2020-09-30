package Workinglibrary;

public class Person1 extends Absclass {

	@Override
	public void iWant() {
		System.out.println("I want something to read that is entertaining, something short thats related to this era");

	}

	private String name;
	private int key;

	public Person1(String name, int key) {
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
