import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Purchase> purchases;
    private Rent rent;

    public Customer(String name, LocalDate birthDay) {
        super(name, birthDay);
        purchases = new ArrayList<>();
    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<Purchase> purchases) {
        this.purchases = purchases;
    }

    public void addPurchase(Purchase purchase){
        purchases.add(purchase);
    }

    public void removePurchase(Purchase purchase){
        purchases.remove(purchase);
    }

    public boolean searchPurchase(Purchase purchase){
        return purchases.contains(purchase);
    }

    public boolean searchPurchase(Book book){
        for(Purchase purchase : purchases)
            if(purchase.getBook() == book)
                return true;

        return false;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public boolean canRent(){
        return (rent == null);
    }

    public void rent(Book book, LocalDate day){
        if(!canRent())
            throw new IllegalArgumentException("Esse cliente ja alugou: " + rent.getBookName());
        rent = new Rent(this, book, day);
    }

    public void returnRent(){
        if(canRent())
            throw new IllegalArgumentException("Esse cliente ainda não alugou nada");
        rent = null;
    }

    public double returnRentValue(LocalDate day){
        if(canRent())
            throw new IllegalArgumentException("Esse cliente ainda não alugou nada");
        return rent.getValue(day);
    }

    public void buy(Book book, double value){
        purchases.add(new Purchase(this, book, value));
    }
}
