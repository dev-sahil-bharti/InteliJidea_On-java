public class chw_15String_pc {
    public static void main(String[] args) {
        String str = "Sahil";
//        String str = new String("Sahil");
//
//        problem 1:
        System.out.println(str.toLowerCase());
//
//        problem 2:
        String new_str = "Sahil is a good Boy";
        System.out.println(new_str.replace(" ", "_"));
//
//        problem 3:
        String letter = "Dear <|Name|>, Thanks a lot!";
        System.out.println(letter.replace("<|Name|>", "Sahil"));

//        problem 4:
        String str1 = "You   have a  nice day";
        System.out.println(str1.indexOf("  "));
        System.out.println(str1.indexOf("   "));

//        problem 5:
        String myLetter = "Daer Sahil\n\tThis course is nice\n\t\t Thanks";
        System.out.println(myLetter);

    }
}
