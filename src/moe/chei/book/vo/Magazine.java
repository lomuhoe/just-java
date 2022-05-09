package moe.chei.book.vo;

public class Magazine extends Book {
    private int year;
    private int month;
    private String type;

    public Magazine(){}
    public Magazine(int year, int month, String type){
        this.year = year;
        this.month = month;
        this.type = type;
    }

    //setter
    public void setMonth(int month) {
        this.month = month;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //getter
    public int getMonth() {
        return month;
    }
    public String getType() {
        return type;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Magazine.toString()";
    }
}
