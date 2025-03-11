import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OccurrenceTest {
    @Test
    void naoDeveCriarOcorencia(){
        try {
            Occurrence occurrence = new Occurrence(0, TestConstants.DATE);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O valor precisa ser maior que 0", e.getMessage());
        }
    }
}