

public class Selections {
    public static void main(String[] args){
        int radius = 7;
        double area;
        if(radius > 0) {
            area = radius * radius * Math.PI;
            System.out.println("The area is " + area);
        } else{
            System.out.println("Radius is less than 0");
        }
        int time = 20;
        if (time < 18){
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

    }

}
