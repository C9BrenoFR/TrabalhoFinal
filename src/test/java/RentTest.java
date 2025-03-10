import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentTest {

    @Test
    void deveRetornarNomeDoLivro(){
        Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
        assertEquals("Dracula", rent.getBookName());
    }

    @Test
    void deveRetornarNomeDoClient(){
        Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
        assertEquals("Fulano", rent.getCustomerName());
    }

    @Test
    void deveRetornarAtrasoDoAluguel(){
        Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
        assertTrue(rent.isLate(TestConstants.DATE.plusDays(11)));
    }

    @Test
    void naoDeveRetornarAtrasoDoAluguel(){
        Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
        assertFalse(rent.isLate(TestConstants.DATE));
    }

    @Test
    void naoDeveCalcularValorDoAluguel(){
        try {
            Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
            rent.getValue(TestConstants.DATE.minusDays(1));
        }catch (IllegalArgumentException e){
            assertEquals("Data inválida",e.getMessage());
        }
    }

    @Test
    void deveCalcularValorDoAluguelSemAtraso(){
        Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
        assertEquals(1.5, rent.getValue(TestConstants.DATE.plusDays(1)));
    }

    @Test
    void deveCalcularValorDoAluguelComAtraso(){
        Rent rent = new Rent(TestConstants.CUSTOMER, TestConstants.BOOK, TestConstants.DATE);
        assertEquals(21.5, rent.getValue(TestConstants.DATE.plusDays(11)));
    }
}