package creatingClass;

public class Main {

	public static void main(String[] args) {
		

        // Creating a book 
        Book book1 = new Book("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0");
        Book book2 = new Book("Lord of the Rings","John Ronald Reuel Tolkien");
        Book book3 = new Book("Throne of Glass", "Sarah J. Maas","978-1-59-990695-9");
        Book book4 = new Book("Game of Thrones", "George R. R. Martin", "978-0-00-723750-0");
        
        // printing a book with ISBN
        book1.printDetails(true, true);
        book3.printDetails(true,true);
        book4.printDetails(true,true);

        // printing a book only with author and title
        book2.printDetails();
  

        

	}

}
