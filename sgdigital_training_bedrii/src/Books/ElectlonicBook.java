package Books;

public class ElectlonicBook extends Book implements IsOnSale{
    String fileType;
    double sale;

    public ElectlonicBook(String name, double price, double rate, String fileType, double sale) {
        super(name, price, rate);
        this.fileType = fileType;
        this.sale = sale;
    }

    @Override
    void calulatePrice(double price) {
        double totalPrice;
        switch (fileType) {
            case "EPUB":
                totalPrice = price * 1.2;
                System.out.println("Price of the book is: " + totalPrice);
                break;
            case "PDF":
                totalPrice = price * 1.1;
                System.out.println("Price of the book is: " + totalPrice);
                break;
            case "DOC":
                totalPrice = price;
                System.out.println("Price of the book is: " + totalPrice);
                break;
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
