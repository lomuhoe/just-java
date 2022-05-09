package Day_0422;

public class EqualsTest {
    public static void main(String[] args) {
        AClass a = new AClass();
        BClass b = new BClass();

        System.out.println("AClass : " + a.toString());
        System.out.println("BClass : " + b.toString());

        System.out.println(a.equals(b));
    }
}

class AClass {
    @Override
    public String toString() {
        return "AClass.toString()";
    }

    @Override
    public boolean equals(Object obj) {
        if(this.toString()==obj.toString()){
            return true;
        } else {
            return false;
        }
    }
}

class BClass {
    @Override
    public String toString() {
        return "BClass.toString()";
    }

    @Override
    public boolean equals(Object obj) {
        if(this.toString()==obj.toString()){
            return true;
        } else {
            return false;
        }
    }
}
