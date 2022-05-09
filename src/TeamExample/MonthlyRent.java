package TeamExample;

public class MonthlyRent extends RealEstate {
    private int monthlyRent;

    public MonthlyRent() {
        super();
    }
    public MonthlyRent(int monthlyRent) {
        super();
        this.monthlyRent = monthlyRent;
    }
    public MonthlyRent(String address, String housingType, int sqft, int monthlyRent) {
        super(address, housingType, sqft);
        this.monthlyRent = monthlyRent;
    }
    
    public int getMonthlyRent() {
        return monthlyRent;
    }
    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}
