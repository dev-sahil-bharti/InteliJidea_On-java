public class chw_31_mehod {
     int addiction(int x, int y) {
        int z = x + y;
        System.out.println(z);
        return 0;
    }

    static int substrction(int x, int y) {
        int z = x - y;
        System.out.println(z);
        return z;
    }

    static int condition(int x, int y) {
        int z;
        if (x < y) {
            z = x * y - 10 * 10;
            z *= z;
            System.out.println(z);
        } else {
            z = x * x + y * y;
        }

        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        int c = a + b;
        int c;
        c = condition(a, b);
        System.out.println("conditional statement result is: " + c);

        int a1 = 504;
        int b1 = 332;
        int c1;

        // Method invocation using object  creation
        chw_31_mehod obj = new chw_31_mehod();
        c1 = obj.addiction(a1,b1);
//        = addiction(a1, b1);
        System.out.println("the sum is: " +c1);
    }
}