import java.time.LocalDate;

public final class TestConstants {
    public static final Publisher PUBLISHER = new Publisher("Galera");
    public static final Book BOOK = new Book("Dracula", 400,"Bram Stoker", PUBLISHER);
    public static final LocalDate DATE = LocalDate.of(2025,1,1);
    public static final LocalDate BIRTHDAY = LocalDate.of(2000,1,1);
    public static final Customer CUSTOMER = new Customer("Fulano", TestConstants.BIRTHDAY);
}
