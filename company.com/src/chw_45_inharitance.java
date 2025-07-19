//class Animal {
//    void sound() {
//        System.out.println("Animal make a sound");
//    }
//}
//class dog extends Animal{
//    void bark(){
//        System.out.println("dogsh bark !!");
//    }
//}
//class cat extends Animal{
//    void miau(){
//        System.out.println("cat miau !!");
//    }
//}
//
//public class chw_45_inharitance {
//    public static void main(String[] args) {
//    dog d1 = new dog();
//    cat c1 = new cat();
//    d1.sound();
//    d1.bark();
//    c1.miau();
//
//    }
//}
// Parent class
//class base {
//    int x;
//
//    public void setX(int a) {
//        System.out.println("x location is base class: ");
//        this.x = a;
//    }
//
//    public int getX() {
//        return x;
//    }
//}
//
//// Child class
//class derived extends base {
//    int y;
//
//    public int getY() {
//        System.out.println("Y location is derived class");
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//}
//
//public class chw_45_inharitance {
//    public static void main(String[] args) {
//    derived b1 = new derived();
//    b1.setX(10);
//    b1.setY(34);
//        System.out.println(+b1.getX());
//        System.out.println(+b1.getY());
//
//    }
//}
// Parent class
class Shape {
    public void area() {
        System.out.println("Area of shape is not defined.");
    }
}

// Child class: Circle
class Circles extends Shape {
    double radius;

    Circles(double r) {
        radius = r;
    }

    @Override
    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

// Child class: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

// Main class to run the program
public class chw_45_inharitance {
    public static void main(String[] args) {
        Shape s1 = new Circles(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area(); // Calls Circle's area()
        s2.area(); // Calls Rectangle's area()
    }
}
