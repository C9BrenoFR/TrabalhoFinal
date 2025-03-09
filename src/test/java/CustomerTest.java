import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private static final Publisher PUBLISHER = new Publisher("Galera");
    private static final Book BOOK = new Book("Dracula", 400,"Bram Stoker", PUBLISHER);
    private static final LocalDate DATE = LocalDate.of(2025,1,1);
    private static final LocalDate BIRTHDAY = LocalDate.of(2000,1,1);

    @Test
    void deveAlugarLivro(){
        Customer customer = new Customer("Fulano", BIRTHDAY);
        customer.rent(BOOK, DATE);
        assertFalse(customer.canRent());
    }

    @Test
    void naoDeveAlugarLivroSeJaAlugou(){
        try {
            Customer customer = new Customer("Fulano", BIRTHDAY);
            customer.rent(BOOK, DATE);
            customer.rent(BOOK, DATE);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Esse cliente ja alugou: Dracula", e.getMessage());
        }
    }

    @Test
    void deveRetornarLivro(){
        Customer customer = new Customer("Fulano", BIRTHDAY);
        customer.rent(BOOK, DATE);
        customer.returnRent();
        assertTrue(customer.canRent());
    }

    @Test
    void naoDeveRetornarLivroSeNaoAlugou(){
        try {
            Customer customer = new Customer("Fulano", BIRTHDAY);
            customer.returnRent();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Esse cliente ainda não alugou nada", e.getMessage());
        }
    }

    @Test
    void deveRetornarOValorDoAlugel(){
        Customer customer = new Customer("Fulano", BIRTHDAY);
        customer.rent(BOOK, DATE);
        assertEquals(15, customer.returnRentValue(DATE.plusDays(10)));
    }

    @Test
    void naoDeveRetornarOValorDoAlugel(){
        try{
            Customer customer = new Customer("Fulano", BIRTHDAY);
            customer.returnRentValue(DATE);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Esse cliente ainda não alugou nada", e.getMessage());
        }
    }

    @Test
    void deveComprarLivro(){
        Customer customer = new Customer("Fulano", BIRTHDAY);
        customer.buy(BOOK, 200.99);
        assertTrue(customer.searchPurchase(BOOK));
    }
}