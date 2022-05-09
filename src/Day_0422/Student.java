package Day_0422;

import java.util.Objects;

public class Student {
    int year;
    String name;

    Student(){};
    Student(int year, String name){
        this.year = year;
        this.name = name;
    };

    
    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student temp = (Student)obj;
        return this.name.equals(temp.name) && this.year == temp.year;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + year;
    }
}
