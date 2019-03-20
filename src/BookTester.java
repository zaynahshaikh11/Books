
public class BookTester 
{
		public static void main (String[] args)
		{
			Book book1 = new Book("Harry Potter", "", "Bloomsbury", 1997);
			Book book2 = new Book("Starting Out With Java", "Tony Gaddis", "Addison-Wesley", 2010);
			System.out.println(book1.getTitle());
			System.out.println(book1.getPublisher());
			book2.setAuthor("Stephanie Sellinger");
			System.out.println(book2.getcopyrightYear());
			System.out.println(book1.toString());
			System.out.println(book2.toString());
		}
}
