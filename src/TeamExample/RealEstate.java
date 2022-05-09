package TeamExample;

public class RealEstate {
    private String address;
    private String housingType;
    private int sqft;

    public RealEstate() {
        super();
    }
    public RealEstate(String address, String housingType, int sqft) {
        this.address = address;
        this.housingType = housingType;
        this.sqft = sqft;
    }

    public String getAddress() {
        return address;
    }
    public String getHousingType() {
        return housingType;
    }
    public int getSqft() {
        return sqft;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }
    public void setSqft(int sqft) {
        this.sqft = sqft;
    }
}
