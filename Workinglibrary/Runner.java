package Workinglibrary;

public class Runner {

	public static void main(String[] args) {

		Books book1 = new Readingbooks("Tresure Island", 4, true, 1);
		Books book2 = new Journals("Nasa Curiousity", 5, true, 5);
		Books book3 = new Magazines("London Eye", 3, true, 2);
		Person1 Tom = new Person1("Tom", 1);
		Person2 Tim = new Person2("Tim", 2);

		Librarysystem system = new Librarysystem();

		system.addBooks(book1);
		system.addBooks(book2);
		system.addBooks(book3);

	}
}
