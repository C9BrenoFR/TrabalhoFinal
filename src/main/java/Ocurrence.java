import java.time.LocalDate;

public class Ocurrence {
    private double value;
    private LocalDate date;

    public Ocurrence(double value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
