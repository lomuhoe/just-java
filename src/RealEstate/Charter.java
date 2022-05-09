package RealEstate;

public class Charter extends RealEstate {
    private int depositMoney;

    public Charter(){}
    public Charter(int depositMoney){
        this.depositMoney = depositMoney;
    }
    public Charter(String address, String houseType, int size, int depositMoney){
        super(address,houseType,size);
        this.depositMoney = depositMoney;
    }

    //setter
    public void setDepositMoney(int depositMoney) {this.depositMoney = depositMoney;}
    //getter
    public int getDepositMoney() {return depositMoney;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Charter.toString()";
    }
}
