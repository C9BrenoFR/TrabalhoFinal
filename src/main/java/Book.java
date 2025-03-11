public class Book {
    private String name;
    private int pages;
    private String author;
    private String series = "";
    private Publisher publisher;

    //Contrutor para livros que não fazem parte de uma serie
    public Book(String name, int pages, String author, Publisher publisher) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    //Contrutor para livros que fazem parte de uma serie
    public Book(String name, int pages, String author, String series, Publisher publisher) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.series = series;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public String getPublisherName(){
        return publisher.getName();
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
