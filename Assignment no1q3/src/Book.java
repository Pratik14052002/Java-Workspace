
public class Book {

	private String bookTiltle;
	private int bookPrice;
	
	public Book(String bookTiltle, int bookPrice) {
		this.bookTiltle = bookTiltle;
		this.bookPrice = bookPrice;
	}
	public String getBookTiltle() {
		return bookTiltle;
	}
	public void setBookTiltle(String bookTiltle) {
		this.bookTiltle = bookTiltle;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}
