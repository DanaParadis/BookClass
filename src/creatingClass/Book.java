package creatingClass;

public class Book {
	
//Inicialization
	private String title;
	private String author;
	private String ISBN;
	private boolean available;
	
	//Constructors
	 
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.available = true;
	}
	
	//Another constructor for a book only with title and author
	
	public Book(String title, String author) {
		this(title,author,"Without ISBN");
		this.available = true;
	}
	// Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setDisponible(boolean available) {
        this.available = available;
    }
    
    // for printing the book without ISBN
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
// printing the ISBN for yes or no 
    public void printDetails(boolean showISBN, boolean showAvailability) {
    	printDetails();
        if (showISBN) {
            System.out.println("ISBN: " + ISBN);
        }
        if (showAvailability) {
            System.out.println("Disponible: " + (available ? "Yes" : "No"));
        }
    }
}