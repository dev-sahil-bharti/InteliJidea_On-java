class A{
    public int method_1(){
        return 4;
    }
    public void method_2(){
        System.out.println("i am class A method number of 2.");
    }
}
class B extends A{
    public void method_3(){
        System.out.println("i am child class method number of 3.");
    }
    @Override
    public void method_2(){
        System.out.println("i am class B method number of 2 ");
    }

}
public class chw_48_MethodOverriding {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        
        a.method_2();
        b.method_2();
;
//        int ret = a.method_1();
//        System.out.println(ret);
    }
}
