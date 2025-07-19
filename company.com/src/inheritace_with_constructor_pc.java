// parent class
class base{
    base(){
        System.out.println("this is a base constructor ");
    }
    base(int x){
        System.out.println("This is a overload constructor for base class: X " +x);
    }
}
//child class
class Derived extends base{
    Derived(){
        System.out.println("this is a derived constructor ");
    }
    Derived (int x, int y){
        super(x); // access the base overload constructor
        System.out.println("this is a Derived class overload constructor: Y "+y);
    }
}
// derived class ki child class
class Derived_child extends Derived{
    Derived_child(){
        System.out.println("This is a derived child class constructor");
    }
    Derived_child(int x, int y, int z){
        super(x, y); // access the base class, Derived class overload constructor
        System.out.println("this is a Derived child class overload constructor: Z " +z);
    }
}
public class inheritace_with_constructor_pc {
    public static void main(String[] args){
//    base b = new base();
//    base b1 = new base(2);

//    Derived d = new Derived();
//    Derived d1 = new Derived(12);

    Derived_child dc = new Derived_child(1,2,3);
    }
}
