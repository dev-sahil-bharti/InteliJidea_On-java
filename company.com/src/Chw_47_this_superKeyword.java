class Sahil {
    int a;

    public int getA() {
        return a;
    }

    Sahil(int a) {
       this.a = a;
    }

    public int returnthis() {
        return 1;
    }
}
class Bharti extends Sahil{

    Bharti(int c) {
        super(c);
        System.out.println("i am child class constructor");
    }
}

public class Chw_47_this_superKeyword {
    public static void main(String[] args) {
//        Sahil s = new Sahil(12);
        Bharti b = new Bharti(2);
//        System.out.println(s.getA());
    }
}
