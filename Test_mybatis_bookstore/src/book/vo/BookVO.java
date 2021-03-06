package book.vo;

/**
 * 도서 정보를 저장하는 VO 클래스
 */
public class BookVO {
	private int bnum;				//상품 번호
	private String title;			//제목
	private String author;			//저자
	private String publisher;		//출판사
	private int price;				//가격
	private String inputdate;		//정보 등록일
	
	public BookVO() {
	}
	
	public BookVO(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public BookVO(int bnum, String title, String author, String publisher, int price) {
		this.bnum = bnum;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public BookVO(int bnum, String title, String author, String publisher, int price, String inputdate) {
		this.bnum = bnum;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.inputdate = inputdate;
	}
	
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	@Override
	public String toString() {
		return "BookVO [bnum=" + bnum + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", inputdate=" + inputdate + "]";
	}

}
