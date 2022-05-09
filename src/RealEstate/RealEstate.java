package RealEstate;

public class RealEstate {
    private String address;
    private String houseType;
    private int size;

    public RealEstate(){}
    public RealEstate(String address, String houseType, int size){
        this.address = address;
        this.houseType = houseType;
        this.size = size;
    }

    //getter
    public String getAddress() {return address;}
    public String getHouseType() {return houseType;}
    public int getSize() {return size;}
    //setter
    public void setAddress(String address) {this.address = address;}
    public void setHouseType(String houseType) {this.houseType = houseType;}
    public void setSize(int size) {this.size = size;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "RealEstate.toString()";
    }

    public String getInfo() {return null;}
}
