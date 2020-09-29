package Workinglibrary;

public class Books {
	protected String booktype;
	protected int rating;
	protected boolean available;
	protected int price;

	public Books(String booktype, int rating, boolean available, int price) {
		this.booktype = booktype;
		this.rating = rating;
		this.available = available;
		this.price = price;

	}

	public String getBookType() {
		return booktype;
	}

	public void setFoodName(String booktype) {
		this.booktype = booktype;
	}

	public int getBookPrice() {
		return price;
	}

	public void setBookPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void description() {
		System.out.println("This is a simple book");
	}

}
