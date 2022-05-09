package RealEstate;

public class BuyingAndSelling extends RealEstate {
    private int price;

    public BuyingAndSelling(){}
    public BuyingAndSelling(int price){
        this.price = price;
    }
    public BuyingAndSelling(String address, String houseType, int size, int price){
        super(address,houseType,size);
        this.price = price;
    }

    //setter
    public void setPrice(int price) {this.price = price;}
    //getter
    public int getPrice() {return price;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "BuyingAndSelling.toString()";
    }
}
