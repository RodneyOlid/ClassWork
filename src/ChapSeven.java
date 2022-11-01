public class ChapSeven {
    public static void main(String[] student){
        student = new String[5];
        student[0] = "A";
        student[1] = "B";
        student[2] = "C";
        student[3] = "D";
        student[4] = "E";
        int[] test = new int[5];
        double[] sList = {1.3, 3.2, 6.3, 7.6, 9.9};

        for(int i = 0;i < sList.length; i++){
            System.out.println(sList[i]);
        }
        System.out.println(test[0]);
        double[] myList = {1.4, 2.3, 3.5, 4.6, 5.2, 6.0, 7.9, 88.2, 9.4};
        //Find max in array
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        //Another way to print out array
        System.out.println(max);
        for(String s: student){
            System.out.println(s);
        }
        //Assign random numbers
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        for(double r: myList){
            System.out.println(r);
        }
        //Find total from array
        double total = 0;
        for(int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("The total is: " + total);
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = reverse(list1);
        for(int i = 0; i < list1.length; i++){
            System.out.println("List 1: " + list1[i] + " List 2: " + list2[i]);
        }
        //Binary search example
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Index is " + java.util.Arrays.binarySearch(list, 11));

    }

    //Reverse an array
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i = 0, j = list.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }
        return result;
    }

}
