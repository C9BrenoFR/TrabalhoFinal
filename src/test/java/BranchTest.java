import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BranchTest {
    @Test
    void deveAdicionarFuncionario(){
        Branch branch = new Branch("Leitura");
        Manager employee = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        branch.addEmployee(employee);
        assertTrue(branch.searchEmployee(employee));
    }

    @Test
    void deveRemoverFuncionário(){
        Branch branch = new Branch("Leitura");
        Manager employee = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        branch.addEmployee(employee);
        branch.removeEmployee(employee);
        assertFalse(branch.searchEmployee(employee));
    }

    @Test
    void deveRetornarNomeDeFuncionarios(){
        Branch branch = new Branch("Leitura");
        Manager employee = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        branch.addEmployee(employee);
        assertEquals("Fulano,", branch.getEmployeesNames());
    }
}