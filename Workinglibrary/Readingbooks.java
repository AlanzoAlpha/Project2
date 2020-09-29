package Workinglibrary;

public class Readingbooks extends Books {

	public String genre;

	public Readingbooks(String booktype, int rating, boolean available, int price) {
		super(booktype, price, available, price);
		this.booktype = booktype;
		this.rating = rating;
		this.available = available;
		this.price = price;

	}

	// Getting genre
	public String getGenre() {
		return genre;
	}

	// Setting genre
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void description() {
		System.out.println("This book is very interesting is tells you about a remote island in the Pacific");
	}

}
