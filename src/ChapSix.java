
public class ChapSix {
    public static void main(String[] args){
        System.out.println("Test");
        System.out.println("Sum from 25 to 50 is " + sum(25,50));
        ChapFive.greatDC();
        print name1 = new print();
        name1.printName("John");
        print.printName("Matt");
    }
    static int sum(int i1, int i2){
        int sum = 0;
        for(int i = i1;i <= i2; i++){
            sum += i;
        }
        return sum;
    }

}
