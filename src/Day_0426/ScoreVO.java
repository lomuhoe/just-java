package Day_0426;

public class ScoreVO {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int total;
    private double avg;
    private int rank;
    public ScoreVO() {
        super();
    }
    public ScoreVO(String name, int kor, int eng, int mat) {
        super();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        calcScore();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
        calcScore();
    }
    public void setEng(int eng) {
        this.eng = eng;
        calcScore();
    }
    public void setMat(int mat) {
        this.mat = mat;
        calcScore();
    }
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
    
    private void calcScore(){
        this.total = this.kor + this.eng + this.mat;
        this.avg = total/(double)3;
    }
    public int getTotal() {
        return total;
    }
    public double getAvg() {
        return avg;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name : " + name + ", kor : " + kor + ", eng : " + eng + ", mat : " + mat + ", total : " + total + ", avg : " + avg + ", rank : " + rank;
    }
}
