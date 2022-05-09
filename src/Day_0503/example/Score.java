package Day_0503.example;

import java.io.Serializable;

public class Score implements Serializable, Comparable<Score> {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private int total;

    public Score() {
        super();
    }
    public Score(String id, String name, int total) {
        super();
        this.id = id;
        this.name = name;
        this.total = total;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    //getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return String.format("* ID : %-13s, Name : %-10s, Total : %-5d", id, name, total);
    }
    @Override
    public int compareTo(Score o) {
        return this.getId().compareTo(o.getId());
    }

    
}
