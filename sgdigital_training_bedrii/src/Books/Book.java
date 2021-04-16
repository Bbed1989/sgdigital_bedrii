package Books;

abstract class Book {
    private String name;
    private double price;
    private double rate;

    public Book(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRate() {
        return rate;
    }

    abstract void calulatePrice(double price);

    abstract void calculatePriceWithOnSave(double price);


}
