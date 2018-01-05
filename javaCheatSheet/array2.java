import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myArray = getIntegers(5);
        int[] sortedArray = sortIntegers(myArray);
        System.out.println("Printing the original array -----");
        printArray(myArray);
        System.out.println("Printing the (bubble) sorted array -----");
        printArray(sortedArray);
    }

    public static int[] getIntegers(int num) {
        System.out.println("Enter "+num+" integer values here:\r");
        int[] values = new int[num];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element "+i+", value is "+array[i]);
        }
    }

    // Bubble Sort --
    public static int[] sortIntegers(int[] array) {
//        int[] outputArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            outputArray[i] = array[i];
//        }
        int[] outputArray = Arrays.copyOf(array, array.length);
        int temp;
        for(int i = outputArray.length-1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(outputArray[i] < outputArray[j]) {
                    temp = outputArray[i];
                    outputArray[i] = outputArray[j];
                    outputArray[j] = temp;
                }
            }
        }
        return outputArray;
    }
}