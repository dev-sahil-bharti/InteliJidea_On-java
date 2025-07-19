class Employee {
    int id;
    String name;
    int salary = 43;

    public void printInfo() {
        System.out.println("EMP id is " + id);
        System.out.println("EMP name is " + name);
    }

    public int getSalary() {
        System.out.println("Salary = " + salary);
        return salary;
    }
}

public class Chw_38_custom_class {
    public static void main(String[] args) {
        System.out.println("Custom class creation: ");
        Employee sahil = new Employee(); //instanting a new Employee class
        Employee mayank = new Employee();

        sahil.id = 101;
        sahil.name = "Sahil Bharti";
        sahil.salary = 13000;

        mayank.id = 38;
        mayank.name = "Mayank Bisth";
        mayank.salary = 10000;

//        System.out.println(sahil.id);
//        System.out.println(sahil.name);

        sahil.printInfo();
        System.out.println(sahil.getSalary());
        mayank.printInfo();
        System.out.println(mayank.getSalary());


    }
}
