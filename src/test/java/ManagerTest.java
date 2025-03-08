import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void deveAdicionarAtendente(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        Attendant attendant = new Attendant("Fulano", LocalDate.of(2000, 1, 1), branch, 1000, manager);
        manager.addAttendant(attendant);
        assertTrue(manager.searchAttendant(attendant));
    }

    @Test
    void deveRemoverAtendente(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        Attendant attendant = new Attendant("Fulano", LocalDate.of(2000, 1, 1), branch, 1000, manager);
        manager.addAttendant(attendant);
        manager.removeAttendant(attendant);
        assertFalse(manager.searchAttendant(attendant));
    }

    @Test
    void deveRetornarNomeDeAtendentes(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        Attendant attendant = new Attendant("Fulano", LocalDate.of(2000, 1, 1), branch, 1000, manager);
        manager.addAttendant(attendant);
        assertEquals("Fulano,", manager.getAttendantsNames());
    }

    @Test
    void naoDeveretornarNomeDeAtendentes(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        assertEquals("Não possui Atendentes", manager.getAttendantsNames());
    }

    @Test
    void deveCalcularSalarioSemAtendentes(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        assertEquals(1200, manager.getNetSalary());
    }

    @Test
    void deveCalcularSalario(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        Attendant attendant = new Attendant("Fulano", LocalDate.of(2000, 1, 1), branch, 1000, manager);
        manager.addAttendant(attendant);
        assertEquals(1500, manager.getNetSalary());
    }
}