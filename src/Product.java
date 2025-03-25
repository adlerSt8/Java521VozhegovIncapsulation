public class Product {
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    private final String name;
    private String barCode;
    private int price;


    public Product(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;
    }


}
