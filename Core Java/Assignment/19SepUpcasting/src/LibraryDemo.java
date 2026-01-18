class Library{
	String libraryName;
	String location;
	
      Library() {
		// TODO Auto-generated constructor stub
    	  this.libraryName="none";
    	  this.location="Not given";
	}

	Library(String libraryName, String location) {
		
		this.libraryName = libraryName;
		this.location = location;
	}

	String getLibraryName() {
		return libraryName;
	}

	void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}
    
	void info()
	{
		System.out.println("Welcome to the Library! ");
	}
	
	void display() {
		System.out.println("Library: "+this.libraryName);
		System.out.println("Locations: "+this.location);
	}
}// class Library end here

class Book extends Library{
   String title;
   String author;
   
    Book() {
	this.title="Not given";
	this.author="none";
}

	Book(String libraryName, String location,String title, String author) {
		super( libraryName,  location);
		this.title = title;
		this.author = author;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}
    
	void info()
	{
		System.out.println("This is a book in the library");
	}
	
	void display()
	{
		super.display();
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
	}
}// class Book end here

class EBook extends Book{
	double fileSize;
	String format;
	
	EBook()
	{
		this.fileSize=0;
		this.format="not given";
	}

	EBook(String libraryName, String location,String title, String author,double fileSize, String format) {
		super( libraryName, location, title,  author);
		this.fileSize = fileSize;
		this.format = format;
	}

	double getFileSize() {
		return fileSize;
	}

	void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	String getFormat() {
		return format;
	}

	void setFormat(String format) {
		this.format = format;
	}
	
	void info()
	{
		System.out.println("This is a EBook in the Library");
	}
	
	void display()
	{
		super.display();
		System.out.println("File Size: "+this.fileSize);
		System.out.println("Format: "+this.format);
		
	}
}// class EBook end here
class LibraryDemo {

	public static void main(String[] args) {
		Library l1=new Library("city Library","New York");
		l1.display();
		l1.info();
		System.out.println();
		
		l1=new Book("Mumbai Public library","Mumbai","Gitanjali","Rabindranath tagore");
		l1.display();
		l1.info();
		System.out.println();
		
		l1=new EBook("Pune Liraray","Pune","Learn Java","Amit verma",4.5,"Pdf");
		l1.display();
		l1.info();
		

	}

}
