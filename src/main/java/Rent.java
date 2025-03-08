import java.time.LocalDate;

public class Rent {
    private Customer customer;
    private Book book;
    private LocalDate rentDate;
    private LocalDate returnDate;

    public Rent(Customer customer, Book book, LocalDate rentDate, LocalDate returnDate) {
        this.customer = customer;
        this.book = book;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
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
}
