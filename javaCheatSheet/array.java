import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in); // Go to LINE 15 ---

    public static void main(String[] args){
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = {1,2,3,4,5,6,7,8,9,10};
        int[] myIntArray2 = new int[10];
        printArray(myIntArray2);
        System.out.println("---------------------------");

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element "+i+", typed value was "+myIntegers[i]);
        }
        System.out.println("The average is "+getAverage(myIntegers));
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = i*10;
            System.out.println("Element "+i+", value is "+array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" integer values here:\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return (double) (total)/(double) (array.length);
    }
}
