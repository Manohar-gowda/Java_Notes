package Samples;

public class Claci {

    public static void main(String[] args) {
        Demo de = new Demo();
        de.setValue(20);
    }
}

class Demo {
    int val;
    void setValue(int val) {
        this.val = val;
        this.print();
    }

    public void print() {
        System.out.println(val);
    }
}
