public class Main {
    public static void main(String[] args) {
        double[] list = {2,3,1,4,8,7,0};
        System.out.println(sequentialSearch(list, 1));
        System.out.println(sequentialSearch(list, 10));

        double[] list2 = {1,2,3,6,100,200,300};
        System.out.println(orderedSequentialSearch(list2, 1));
        System.out.println(orderedSequentialSearch(list2, 199));
        System.out.println(orderedSequentialSearch(list2, 301));
    }
    
    // Unordered list ----------------------------------
    public static boolean sequentialSearch(double[] array, double target) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(i);
            if(target == array[i])
                return true;
        }
        return false;
    }
    
    // Ordered list ----------------------------------
    public static boolean orderedSequentialSearch(double[] array, double target) {
        int i = 0;
        while(i < array.length) {
            System.out.println(i);
            if(target == array[i])
                return true;
            else if(target < array[i])
                return false;
            i++;
        }
        return false;
    }
}
