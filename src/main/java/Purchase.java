public class Purchase {
    private Customer customer;
    private Book book;
    private double value;

    public Purchase(Customer customer, Book book, double value) {
        this.customer = customer;
        this.book = book;
        this.value = value;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
