package TeamExample;

public class Charter extends RealEstate {
    private int depositMoney;

    public Charter() {
        super();
    }
    public Charter(int depositMoney) {
        super();
        this.depositMoney = depositMoney;
    }
    public Charter(String address, String housingType, int sqft, int depositMoney) {
        super(address, housingType, sqft);
        this.depositMoney = depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }
    public int getDepositMoney() {
        return depositMoney;
    }
}
