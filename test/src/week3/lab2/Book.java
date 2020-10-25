package week3.lab2;

public class Book {
	
	
	//Variables
	private String name;
	private String author;
	private int ISBN;
	private String genre;
	private char status;
	private static int noOfBooks =0;
	private static int nextISBN =1;

	
	//Constructors
		public Book(String name, String author, String genre) {
		setName(name);
		setAuthor(author);
		setGenre(genre);
		setStatus('A');
		setISBN(nextISBN);
		nextISBN++;
		noOfBooks++;
	}
	
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	

	
	
	//toString
	
	
	
	//Misc Methods
	public void Borrow() {
		setStatus('B');
	}
	

}