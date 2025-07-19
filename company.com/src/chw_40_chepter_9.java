class employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public void setId(int m) {
        id = m;
    }
    public int getId() {
        return id;
    }
}

public class chw_40_chepter_9 {
    public static void main(String[] args) {
        employee sahil = new employee();
        sahil.setName("Sahil Bharti");
        sahil.setId(102);
        System.out.println("id: "+ sahil.getId());
        System.out.println("Name: "+ sahil.getName());


    }
}

//class circle {
//    private double radius;
//
//    // Setter with input validation
//    public void setRadius(double r) {
//        if (r <= 0) {
//            System.out.println("❌ Invalid radius. Radius must be greater than 0.");
//        } else {
//            radius = r;
//        }
//    }
//
//    // Getter
//    public double getRadius() {
//        return radius;
//    }
//
//    // Calculate Area
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    // Calculate Perimeter (Circumference)
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
///*
//public class CircleTest {
//    public static void main(String[] args) {
//        Circle c = new Circle();
//
//        // Try with invalid value
//        c.setRadius(-5);  // ❌ Invalid
//
//        // Try with valid value
//        c.setRadius(7);   // ✅ Valid
//
//        System.out.println("Radius: " + c.getRadius());
//        System.out.println("Area: " + c.getArea());
//        System.out.println("Perimeter: " + c.getPerimeter());
//    }
//}
//
//*/