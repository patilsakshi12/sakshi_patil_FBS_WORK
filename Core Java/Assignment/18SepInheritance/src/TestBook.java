class Book
{
	String Title;
	String Author;
	int pages;
	double price;
	String Publisher;
	Book() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Book constructor");
		this.Title="none";
		this.Author="yz";
		this.pages=0;
		this.price=0;
		this.Publisher="not given";
	}
	Book(String title, String author, int pages, double price, String publisher) {
		System.out.println("Para Book constructor");
		Title = title;
		Author = author;
		this.pages = pages;
		this.price = price;
		Publisher = publisher;
	}
	String getTitle() {
		return Title;
	}
	void setTitle(String title) {
		Title = title;
	}
	String getAuthor() {
		return Author;
	}
	void setAuthor(String author) {
		Author = author;
	}
	int getPages() {
		return pages;
	}
	void setPages(int pages) {
		this.pages = pages;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	String getPublisher() {
		return Publisher;
	}
	void setPublisher(String publisher) {
		Publisher = publisher;
	}
	
	void display()
	{
		System.out.println("Title: "+this.Title);
		System.out.println("Author: "+this.Author);
		System.out.println("Pages: "+this.pages);
		System.out.println("Price: "+this.price);
		System.out.println("Publisher: "+this.Publisher);
		
	}
	
}// class Book end here

class TextBook extends Book{
	String Subject;
	
	TextBook() {
		// TODO Auto-generated constructor stub
		System.out.println("Default TextBook constructor");
		this.Subject="no";
	}

	
	TextBook(String title, String author, int pages, double price, String publisher,String subject) {
		super(title,  author, pages, price, publisher);
		System.out.println("Para TextBook constructor");
		this.Subject = subject;
	}


	String getSubject() {
		return Subject;
	}

	void setSubject(String subject) {
		Subject = subject;
	}
	void display()
	{
		super.display();
		System.out.println("Subject: "+this.Subject);
	}
	
}// class TextBOok End here
class TestBook {

	public static void main(String[] args) {
		 TextBook tb1 = new TextBook();
	        tb1.display();

	        System.out.println("");
	        TextBook tb2 = new TextBook("Java Programming", "James Gosling", 500, 799.99, "Sun Microsystems", "Computer Science");
	        tb2.display();

	}

}
