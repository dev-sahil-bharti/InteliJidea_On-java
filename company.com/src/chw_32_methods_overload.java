
public class chw_32_methods_overload {
    static void tellJock() {
        System.out.println("I told my computer I needed a break... now it won’t stop sending me KitKat ads.");
    }

    static void change(int a) {
        a = 98;
    }

    static  void change2(int [] arr){
        arr[0] = 56;
    }
    static void foo(){
        System.out.println("Good Morning Broo! ");
    }
    static void foo(int a){
        System.out.println("Good Morning " +a+ " Bro!");
    }
//    int a and b this time is perameters
    static void foo(int a, int b){
        System.out.println("Good Morning " +a+ " Bro!");
        System.out.println("Good Morning " +b+ " Bro!");
    }

    public static void main(String[] args) {
//        tellJock();

//        Case 1 Changing the integer
/*      int x = 34;
        change(x);
        System.out.println("the value of x is after running change is: " + x);
*/

//        Case 2 Changing the Array
/*        int [] marks = {75, 67, 98, 78, 73};
        change2(marks);
        System.out.println("the value of index 0 after running is: "+marks[0]);
 */

//        Method OverLoading
        foo();
        foo(50);
        foo(500 ,4000);   // this value 500, 4000 is Arguments(Arguments is actual)

    }
}
