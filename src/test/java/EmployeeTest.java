import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {
    // Teste gerado usando uma classe que possui Employee na hierarquia
    @Test
    void deveRetornarIdade(){
        Branch branch = new Branch("Leitura");
        Manager employee = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        assertEquals("Leitura", employee.getBranchName());
    }
}