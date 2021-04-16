package Books;

public class RealBook extends Book implements IsOnSale {

    String coverType;
    double sale;


    public RealBook(String name, double price, double rate, String coverType, double sale) {
        super(name, price, rate);
        this.coverType = coverType;
        this.sale = sale;
    }

    @Override
    void calulatePrice(double price) {
        if (coverType.equals("Hardcover")) {
            double totalPrice = price * 1.5;
            System.out.println("Price of the book is: " + totalPrice);

        } else {
            double totalPrice = price;
            System.out.println("Price of the book is: " + totalPrice);
        }
    }

    @Override
    void calculatePriceWithOnSave(double price) {
        double totalPrice = price * sale;

    }

    @Override
    public boolean checkSale() {
        if (sale != 1){
            return true;
        } else {
            return false;
        }
    }
}
