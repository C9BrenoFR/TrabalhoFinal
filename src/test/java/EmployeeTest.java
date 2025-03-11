import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {
    // Testes gerado usando uma classe que possui Employee na hierarquia
    @Test
    void deveRetornarNomeDaFilial(){
        Branch branch = new Branch("Leitura");
        Manager employee = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        assertEquals("Leitura", employee.getBranchName());
    }

    @Test
    void naoDeveCriarFuncionario(){
        try{
            Branch branch = new Branch("Leitura");
            Manager employee = new Manager(
                    "Fulano",
                    LocalDate.of(2000, 1, 1),
                    branch,
                    0
            );
        }catch (IllegalArgumentException e){
            assertEquals("O salario precisa ser maior que 0", e.getMessage());
        }
    }
}