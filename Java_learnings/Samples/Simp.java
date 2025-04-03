package Samples;

public class Simp {

    private int num, ver; //only same class can access

    void initialize(int num, int ver) {
        this.num = num;
        this.ver = ver;
    }

    public int getNum() {
        return this.num;
    }

    void drive() {
        System.out.println(num);
    }

    void run() {
        System.out.println(ver);
    }

    void operate() {
        drive();
        run();
    }
}

class Get {
    public static void main(String[] args) {
        Simp s = new Simp();
        s.initialize(5,6);
        System.out.println(s.getNum());
    }
}

