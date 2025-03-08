import java.util.ArrayList;

public class Publisher {
    private String name;
    private ArrayList<Book> books;

    public Publisher(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
