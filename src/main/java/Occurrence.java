import java.time.LocalDate;

public class Occurrence {
    private double value;
    private LocalDate date;

    public Occurrence(double value, LocalDate date) {
        if(value <= 0)
            throw new IllegalArgumentException("O valor precisa ser maior que 0");
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
