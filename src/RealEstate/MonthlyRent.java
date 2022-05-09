package RealEstate;

public class MonthlyRent extends RealEstate {
    private int monthlyRent;

    public MonthlyRent(){}
    public MonthlyRent(int monthlyRent){
        this.monthlyRent = monthlyRent;
    }
    public MonthlyRent(String address, String houseType, int size, int monthlyRent){
        super(address,houseType,size);
        this.monthlyRent = monthlyRent;
    }

    //setter
    public void setMonthlyRent(int monthlyRent) {this.monthlyRent = monthlyRent;}
    //getter
    public int getMonthlyRent() {return monthlyRent;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "MonthlyRent.toString()";
    }
}
