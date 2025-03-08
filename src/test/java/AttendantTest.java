import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AttendantTest {

    @Test
    void deveRetornarNomeDoGerente(){
        Branch branch = new Branch("Leitura");
        Manager manager = new Manager(
                "Fulano",
                LocalDate.of(2000, 1, 1),
                branch,
                1200
        );
        Attendant attendant = new Attendant("Fulano", LocalDate.of(2000, 1, 1), branch, 1000, manager);
        assertEquals("Fulano", attendant.getManagerName());
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
        /*
        Sequencia de 3 ocorencias todas de R$300
        1 na data em que o teste rodar
        2 no mesmo mês em que o teste rodar mas em outro ano
        3 no mesmo ano em que o teste rodar mas em outro mês
        */

        Ocurrence ocurrenceSameDate = new Ocurrence(300, LocalDate.now());
        Ocurrence ocurrenceSameMonth = new Ocurrence(300, LocalDate.of(1900, LocalDate.now().getMonthValue(), 1));
        Ocurrence ocurrenceSameYear = new Ocurrence(300, LocalDate.of(LocalDate.now().getYear(), 1, 1));

        attendant.addOcurence(ocurrenceSameDate);
        attendant.addOcurence(ocurrenceSameMonth);
        attendant.addOcurence(ocurrenceSameYear);

        assertEquals(1300, attendant.getNetSalary());
    }
}