package TeamExample;

public class BuyingAndSelling extends RealEstate {
    private int price;

    public BuyingAndSelling() {
        super();
    }
    public BuyingAndSelling(int price) {
        super();
        this.price = price;
    }
    public BuyingAndSelling(String address, String housingType, int sqft, int price) {
        super(address, housingType, sqft);
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
