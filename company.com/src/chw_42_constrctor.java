class students{
    private int rollNo;
    private String name;

    public students(){
        rollNo = 0;
        name = "Your-name here";
    }
    public students(int myrollno, String myname ){
        rollNo = myrollno;
        name = myname;
    }
    public void setRollNo(int n){ rollNo = n;}
    public int getRolNo(){return rollNo;}
    public void setName(String m){ name = m;}
    public String getName(){return name;}

}
public class chw_42_constrctor {
    public static void main(String[] args){
    students s1 = new students();
//    students s1 = new students(67,"Sahil Bharti");
    s1.setRollNo(47);
    s1.setName("Sahil Bharti");

        System.out.println("Roll Number: " +s1.getRolNo());
        System.out.println("Student Name: " +s1.getName());

    }

}
