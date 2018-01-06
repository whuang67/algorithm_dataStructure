import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] list = {1,2,3,6,100,200,300};
        System.out.println(binarySearch(list, 6));
        System.out.println(binarySearch(list, 200));
        System.out.println(binarySearch(list, 301));

        System.out.println(binarySearch2(list, 6));
        System.out.println(binarySearch2(list, 200));
        System.out.println(binarySearch2(list, 301));

    }

    // Binary Search ---------------------------- with LOOP
    public static boolean binarySearch(double[] array, double target) {
        int start = 0;
        int end = array.length;
        while(start < end) {
            int midpoint = (start+end)/2;
            if(target == array[midpoint])
                return true;
            else if(target < array[midpoint])
                end = midpoint;
            else
                start = midpoint+1;
        }
        return false;
    }

    // Binary Search ---------------------------- with Recursion
    public static boolean binarySearch2(double[] array, double target) {
        if(array.length == 0)
            return false;
        int midpoint = array.length/2;
        if(target == array[midpoint])
            return true;
        else if(target < array[midpoint])
            return binarySearch2(Arrays.copyOfRange(array, 0, midpoint), target);
        else
            return binarySearch2(Arrays.copyOfRange(array, midpoint+1, array.length), target);
    }
}
