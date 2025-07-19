class phone {
    public void nokia() {
        System.out.println("i am nokia cell phone");
    }
    public void samsung(){
        System.out.println("i am samsung phone");
    }

    public void name() {
        System.out.println("my name is java");
    }
}

class smartPhone extends phone {
    public void vivo() {
        System.out.println("i am Vivo smartPhone");
    }

    @Override
    public void nokia() {
        System.out.println("i am a Nokia Smart phone");
    }
}

public class chw_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        phone obj = new phone();
        smartPhone s1_ph = new smartPhone();
        obj.nokia();

        phone newObj = new smartPhone();
        newObj.nokia();
        



    }
}
