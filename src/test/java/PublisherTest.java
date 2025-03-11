import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublisherTest {

    @Test
    void deveRetornarNomeDosLivros(){
        Publisher publisher = new Publisher("Darkside");
        publisher.addBook(TestConstants.BOOK);
        assertEquals("Dracula,", publisher.getBooksName());
    }

    @Test
    void naoDeveRetornarNomeDosLivros(){
        Publisher publisher = new Publisher("Darkside");
        assertEquals("Editora sem livros", publisher.getBooksName());
    }
}