public class chw_33_varargs {
    //    this Function to add n numbers
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    static int sum1(int x, int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    static void some_number() {
        System.out.println("nothing: ");
    }
    static void some_number(int a){
        System.out.println("the number 'a' is: " +a);
    }

    static double findAvrege(int...number){
        if(number.length == 0){
            return 0;
        }
        int sum = 0;
        for (int num : number ){
        sum += num;
        }
        return (double) sum / number.length;
    }

    public static void main(String[] args) {
        System.out.println("this is a varags tutorial");
        System.out.println("The number is nothing " + sum1(1));
        System.out.println("the sum 23, and 56 is:  " + sum(23, 56));
        System.out.println("24, 45,23, 55,35,38 these Numbers sum  is: " + sum(24, 45, 23, 55, 35, 38));

//        call by the some_numbers function
        some_number();
        some_number(10);

        System.out.println("Average: "+findAvrege(10,20,30));
    }
}
