//custom class 1
class student {
    int rollNo;
    String name;
    String course;
    String collage;
    String fee = "1.20 Lakh";

    //    method 1
    public void studentInfo() {
        System.out.println("Student Roll number: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student Collage Name: " + collage);
    }

    //    method 2
    public String stdFee() {
        System.out.println("Student Collage fee: " + fee);
        return fee;
    }
}

//custom class 2
class cellPhone {


    //method 1
    public void ring() {
        System.out.println("Cell phone is ringing");
    }

    //method 2
    public void vibrate() {
        System.out.println("cell phone is vibrating condiction!");
    }

    //    method 3
    public void callFriend() {
        System.out.println("calling Rahul!!");
    }
}

// custom class 3
class square {
    int side;

    public int Area() {
        return side * side;
    }

    public float perimeter() {
        return 4.0f * side;
    }
}

//custom class 4
class tommyGame {

    public void hit() {
        System.out.println("hitting the enemy !");
    }

    public void run() {
        System.out.println("Running from the enemy !");
    }

    public void fire() {
        System.out.println("firing on the enemy !");
    }
}

//custom class 5
class rectangle {
    float length;
    float breadth;

    public float perimeter_of_Rectangle() {
        return 2 * (length + breadth);
    }

    public float area_of_rectangle() {
        return length * breadth;
    }

}
//custom class 6

class Circle {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double diameter() {
        return 2 * radius;
    }
}

public class chw_39_Custom_method_class_PC {
    public static void main(String[] args) {

//problem 1
//      creation the instating classes obj
        student sahil = new student();
//      student class
        sahil.rollNo = 011;
        sahil.name = "Sahil Bharti";
        sahil.course = "Master Of Computer Appliction";
        sahil.collage = "IIMT";
        sahil.fee = "1.20 Lakh";
        sahil.studentInfo();
        sahil.stdFee();

//Problem 2
//      cellPhone class
        cellPhone samsung = new cellPhone();
        samsung.callFriend();
        samsung.ring();
        samsung.vibrate();
//Problem 3
//      square class
        square sq = new square();
        sq.side = 3;
        System.out.println("side " + sq.side);
        System.out.println("area " + sq.Area());
        System.out.println("perimeter " + sq.perimeter());
//Problem 4
//      rectangle class
        rectangle func = new rectangle();

        func.length = 23.0f;
        func.breadth = 3.44f;
        System.out.println("Perimeter = " + func.perimeter_of_Rectangle());
        System.out.println("Area= " + func.area_of_rectangle());


//Problem 5
//      tommyGame class
        tommyGame player = new tommyGame();
        player.hit();
        player.fire();
        player.run();

//Problem 6
//      Circle class
        Circle c = new Circle();
        c.radius = 7;

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Diameter: " + c.diameter());

    }
}

