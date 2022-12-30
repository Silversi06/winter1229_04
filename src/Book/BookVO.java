package Book;

public class BookVO {
	private int isbn;
	private String booknName;
	private String publish_authore;
	private  int price;
	private String category;
	
	public BookVO() {
		
	}
	//������: �ʵ� �� �ʱ�ȭ
	public BookVO(int isbn, String booknName, String publish_authore, int price, String category) {
		super();
		this.isbn = isbn;
		this.booknName = booknName;
		this.publish_authore = publish_authore;
		this.price = price;
		this.category = category;
	}
	
	//setter: �ʵ� �� ����
	//getter: �ʵ� �� ��ȯ
	

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBooknName() {
		return booknName;
	}

	public void setBooknName(String booknName) {
		this.booknName = booknName;
	}

	public String getPublish_authore() {
		return publish_authore;
	}

	public void setPublish_authore(String publish_authore) {
		this.publish_authore = publish_authore;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", booknName=" + booknName + ", publish_authore=" + publish_authore + ", price="
				+ price + ", category=" + category + "]";
	}
	
	

}
