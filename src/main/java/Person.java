import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getAge(){
        Period period = Period.between(birthDay, LocalDate.now());
        return period.getYears();
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
