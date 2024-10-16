package week1.assignments;

public class library {
	
	public String addBook(String bookTitle)
	{
		System.out.println(bookTitle+ "Book added successfully");
		return bookTitle;
	}
   public void issueBook()
   {
	   System.out.println("Book issued successfully");
	
   }
	public static void main(String[] args) {
   library b = new library();
   b.addBook("Bible");
   b.issueBook();
	}

}
