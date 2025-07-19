class Base {
    Base() {
        System.out.println("I am a base class constructor");
    }
      Base(int x) {
        System.out.println("i am a base class overload constructor with integer value of x as: " + x);
    }
}

class derived extends Base {
    derived() {
//    super(0);
        System.out.println("i am a derived class constructor");
    }
    derived(int x, int y){
        super(x);
        System.out.println("i am a derived class overload constructor with integer value of y as: " + y);
    }
}
class child_of_derived extends derived{
    child_of_derived(){
        System.out.println("i am a child of derived constructor");
    }child_of_derived(int x, int y , int z){
        super(x,y);
        System.out.println("i am a child of derived class overload constructor with integer value of z as: " +z);
    }
}
public class chw_46_inheritanceWithConsturctor {
    public static void main(String[] args) {
//    Base b1 = new Base();
//    derived d1 = new derived();
//        derived d1 = new derived(15,2);
        child_of_derived cd =  new child_of_derived(10,20,30);

    }
}
