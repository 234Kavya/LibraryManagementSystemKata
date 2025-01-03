import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTest {
    @Test
    public void testBookCreation() {
        // Create a book with ISBN, title, author, and publication year
        Book book = new Book("1234567890", "Test Book", "Author Name", 2024);

        // Assert that the book properties are correctly assigned
        assertEquals("1234567890", book.getIsbn());
        assertEquals("Test Book", book.getTitle());
        assertEquals("Author Name", book.getAuthor());
        assertEquals(2024, book.getPublicationYear());
        assertTrue(book.isAvailable()); // New books should be available by default
    }
}
