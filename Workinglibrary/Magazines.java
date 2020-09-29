package Workinglibrary;

public class Magazines extends Books {

	public float fontsize;

	public Magazines(String booktype, int rating, boolean available, int price) {
		super(booktype, price, available, price);
		this.booktype = booktype;
		this.rating = rating;
		this.available = available;
		this.price = price;

	}

	public float getFontsize() {
		return fontsize;
	}

	public void setFontsize(float fontsize) {
		this.fontsize = fontsize;
	}

	@Override
	public void description() {
		System.out.println(
				"This is an interesting magaxine, it has 20 pages and it tells you all you need to know about out Queen");
	}

}
