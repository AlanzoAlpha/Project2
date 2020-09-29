package Workinglibrary;

public class Journals extends Books {

	public int pageNum;

	public Journals(String booktype, int rating, boolean available, int price) {
		super(booktype, price, available, price);
		this.booktype = booktype;
		this.rating = rating;
		this.available = available;
		this.price = price;

	}

	public float getpageNum() {
		return pageNum;
	}

	public void setFontsize(int pageNum) {
		this.pageNum = pageNum;
	}

	@Override
	public void description() {
		System.out.println("This jurnal will tell you about all the food plants in the amazon rain forest.");
	}

}
