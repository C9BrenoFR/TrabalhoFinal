import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {

    @Test
    void naoDeveCriarCompraNegativa(){
        try{
            Purchase purchase = new Purchase(TestConstants.CUSTOMER, TestConstants.BOOK, 0);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O valor precisa ser positivo", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDoCliente() {
        Purchase purchase = new Purchase(TestConstants.CUSTOMER, TestConstants.BOOK, 200);
        assertEquals("Fulano", purchase.getCustomerName());
    }

    @Test
    void deveRetornarNomeDoLivro() {
        Purchase purchase = new Purchase(TestConstants.CUSTOMER, TestConstants.BOOK, 200);
        assertEquals("Dracula", purchase.getBookName());
    }
}