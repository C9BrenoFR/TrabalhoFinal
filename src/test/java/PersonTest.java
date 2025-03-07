import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Teste gerado retirando o abstract da classe
    @Test
    void deveRetornarIdade(){
        Person person = new Person();
        person.setBirthDay(LocalDate.of(2000, 1, 1));
        assertEquals(25, person.getAge());
    }

}