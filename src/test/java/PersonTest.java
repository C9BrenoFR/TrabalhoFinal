import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Teste gerado usando uma classe que possui Person na hierarquia
    @Test
    void deveRetornarIdade(){
        Branch branch = new Branch("Leitura");
        Manager person = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        assertEquals(25, person.getAge());
    }

}