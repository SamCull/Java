package week9.lab1;

public class Book extends LibraryItem{
	
	//Variables
	String author;
	String title;
	int numPages;

	
	//Constructors
		public Book(String author, String title, int numPages) {
		super();
		setAuthor(author);
		setTitle(title);
		setNumPages(numPages);
	}
		

	//Getters & Setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	public Book() {
		super();
	}
	
	//Overridden Getters & Setters
	@Override
	public double calculatePrice() {
		return 1.50; //Return price of book €1.50
	}
		
	//toString
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + ", calculatePrice()="
				+ calculatePrice() + "]";
	}
	
	
	
	
}
