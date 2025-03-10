import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void deveAlugarLivro(){
        Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
        customer.rent(TestConstants.BOOK, TestConstants.DATE);
        assertFalse(customer.canRent());
    }

    @Test
    void naoDeveAlugarLivroSeJaAlugou(){
        try {
            Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
            customer.rent(TestConstants.BOOK, TestConstants.DATE);
            customer.rent(TestConstants.BOOK, TestConstants.DATE);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Esse cliente ja alugou: Dracula", e.getMessage());
        }
    }

    @Test
    void deveRetornarLivro(){
        Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
        customer.rent(TestConstants.BOOK, TestConstants.DATE);
        customer.returnRent();
        assertTrue(customer.canRent());
    }

    @Test
    void naoDeveRetornarLivroSeNaoAlugou(){
        try {
            Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
            customer.returnRent();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Esse cliente ainda não alugou nada", e.getMessage());
        }
    }

    @Test
    void deveRetornarOValorDoAlugel(){
        Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
        customer.rent(TestConstants.BOOK, TestConstants.DATE);
        assertEquals(15, customer.returnRentValue(TestConstants.DATE.plusDays(10)));
    }

    @Test
    void naoDeveRetornarOValorDoAlugel(){
        try{
            Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
            customer.returnRentValue(TestConstants.DATE);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Esse cliente ainda não alugou nada", e.getMessage());
        }
    }

    @Test
    void deveComprarLivro(){
        Customer customer = new Customer("Fulano", TestConstants.BIRTHDAY);
        customer.buy(TestConstants.BOOK, 200.99);
        assertTrue(customer.searchPurchase(TestConstants.BOOK));
    }
}