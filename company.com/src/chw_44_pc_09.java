class cylinder {
    private float radius;
    private float height;

    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public void set_radius(float n) {
        this.radius = n;
    }

    public float get_Radius() {
        return radius;
    }

    public void set_height(float m) {
        this.height = m;
    }

    public float get_height() {
        return height;
    }

    public double surFaceArea() {
        return 2 * 3.1416 * radius * height * 2 * 3.1416 * radius * radius;
    }

    public double volume() {
        return 3.1416 * radius * radius * height;
    }
}

public class chw_44_pc_09 {
    public static void main(String[] args) {
        //Problem 1
//        /*
//        cylinder c1 = new cylinder();
//        c1.set_height(3.15f);
//        c1.set_radius(1.3f);
//        System.out.println("height: " + c1.get_height());
//        System.out.println("height: " + c1.get_Radius());
//       */
        //Problem 2
       /* cylinder c1 = new cylinder();
        c.set_height(3.15f);
        c2.set_radius(1.3f);
        System.out.println("cylider surfacearea: "+ c1.surFaceArea());
        System.out.println("cylider volume: "+ c1.volume());
//        */
        //Problem 3
        cylinder c2 = new cylinder(9,12);


    }
}
