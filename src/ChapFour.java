import java.util.Random;

public class ChapFour {
    public static void main(String[] args) {
        int numtype = 100;
        System.out.println(Math.E);
        System.out.println(Math.sin(45));
        System.out.println(Math.abs(-97));
        System.out.println(2 + (int)(Math.random() * 10));
        // Calls and creates a class
        Random rm = new Random();
        print myclass = new print();
        // .repeat is a function from print class
        myclass.repeat();
        int num = rm.nextInt(57-20) + 20;

        System.out.println(num);
        System.out.println("is digit " + Character.isDigit(num));
        System.out.println("Is uppercase " + Character.isUpperCase('B'));
        String message = "Test String ";
        String message2 = "My message ";
        String message3 = "Goodbye ";
        String s3 = new String("Goodbye ");
        String s4 = new String("Goodbye ");
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.concat(message2));
        System.out.println(s3.concat(message).concat(message2).toLowerCase());
        // use .equals() to compare strings
        // == compares memory locations while equals() compares the content stored
        if(s3.equals(s4)){
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
        String s = "IS";
        // redefine in order to refresh the string
        s = s.concat(" 147");
        System.out.println(s);
        String s5 = message3.intern();
        String s6 = s3.intern();
        if(s5.equals(s6)){
            System.out.println("It is equal.");
        } else {
            System.out.println("It is not equal");
        }
        myclass.trash(10, 7);
        print.basic();
        String name = "Rodney";
        System.out.println(name.substring(0,5));
        int number = 25;
        double count = 34.21;
        System.out.printf("The int is %d and the count is %f", number, count);
    }

}
