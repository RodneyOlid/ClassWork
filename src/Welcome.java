import java.util.Scanner;

public class Welcome {
    public static void main(String [] arg){
        System.out.print("Enter an integer for seconds: ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        System.out.print(minutes + " minutes and ");
        int remainSeconds = seconds % 60;
        System.out.print(remainSeconds + " seconds");

        System.out.println(Math.pow(2, 3));
        int x = 5;
        int y = (int)3.9;
        int z = 10;
        System.out.println(y);
    }
}
