package Workinglibrary;

import java.util.ArrayList;
import java.util.List;

public class Librarysystem {

	private List<Books> book = new ArrayList<>();

	public Librarysystem() {
		super();

	}

	public boolean addBooks(Books books) {
		return this.book.add(books);

	}

	// Person one trolley
	private List<Person1> P1books = new ArrayList<>();
	// Person two trolley
	private List<Person2> P2books = new ArrayList<>();

	public List<Books> removebooks(String type) {
		List<Books> bookout = new ArrayList<>();
		for (Books v : this.book) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				bookout.add(v);
				System.out.println(v);
			}

		}
		this.book.removeAll(bookout);
		return bookout;
	}

	public List<Person1> getP1books() {
		return P1books;
	}

	public void setP1books(List<Person1> p1books) {
		P1books = p1books;
	}

	public List<Person2> getP2books() {
		return P2books;
	}

	public void setP2books(List<Person2> p2books) {
		P2books = p2books;
	}

}
