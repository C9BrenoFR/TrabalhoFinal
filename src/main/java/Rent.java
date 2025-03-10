import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import org.jetbrains.annotations.NotNull;
import java.time.temporal.ChronoUnit;

public class Rent {
    private Customer customer;
    private Book book;
    private LocalDate rentDate;
    private LocalDate returnDate;

    public Rent(Customer customer, Book book,@NotNull LocalDate rentDate) {
        this.customer = customer;
        this.book = book;
        this.rentDate = rentDate;
        this.returnDate = rentDate.plusDays(10);
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public String getBookName(){
        return book.getName();
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isLate(@NotNull LocalDate day) {
        return day.isAfter(returnDate);
    }

    public double getValue(@NotNull LocalDate day){
        if(day.isBefore(rentDate))
            throw new IllegalArgumentException("Data inválida");

        int days = (int) ChronoUnit.DAYS.between(rentDate, day);
        double value = 1.5*days;

        if(isLate(day)){
            days = (int) ChronoUnit.DAYS.between(returnDate, day);
            value += 5*days;
        }

        return value;
    }
}
