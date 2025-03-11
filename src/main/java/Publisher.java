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

    public String getBooksName(){
        if(books.isEmpty())
            return "Editora sem livros";
        StringBuilder names = new StringBuilder();
        for(Book book : books){
            names.append(book.getName()).append(",");
        }
        return names.toString();
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public boolean searchBook(Book book){
        return books.contains(book);
    }
}
