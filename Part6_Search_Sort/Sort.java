public class Main {
    public static void main(String[] args) {
        double[] list1 = {2,3,1,4,8,7,0};
        System.out.print("\n ------- List before being sorted.\n"); printArray(list1);
        bubbleSort(list1);
        System.out.print(" ------- List After being BUBBLE sorted.\n"); printArray(list1);

        double[] list2 = {2,3,1,4,8,7,0};
        System.out.print("\n ------- List before being sorted.\n"); printArray(list2);
        selectionSort(list2);
        System.out.print(" ------- List After being SELECTION sorted.\n"); printArray(list2);

        double[] list3 = {2,3,1,4,8,7,0};
        System.out.print("\n ------- List before being sorted.\n"); printArray(list3);
        insertionSort(list3);
        System.out.print(" ------- List After being INSERTION sorted.\n"); printArray(list3);

        double[] list4 = {2,3,1,4,8,7,0};
        System.out.print("\n ------- List before being sorted.\n"); printArray(list4);
        shellSort(list4);
        System.out.print(" ------- List After being SHELL sorted.\n"); printArray(list4);
    }

    // Bubble Sort -------------------------------------------------
    public static void bubbleSort(double[] array) {
        for(int i = array.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[i] < array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Selection Sort -------------------------------------------------
    public static void selectionSort(double[] array) {
        for(int i = array.length-1; i > 0; i--) {
            int indexOfMax = 0;
            for(int j = 1; j <= i; j++) {
                if(array[indexOfMax] < array[j])
                    indexOfMax = j;
            }
            double temp = array[indexOfMax];
            array[indexOfMax] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort -------------------------------------------------
    public static void insertionSort(double[] array) {
        for(int i = 1; i < array.length; i++) {
            double currentValue = array[i];
            int j = i;
            while(j > 0 && array[j-1] > currentValue) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = currentValue;
        }
    }

    // Shell Sort -------------------------------------------------
    public static void shellSort(double[] array) {
        int gap = array.length/2;
        while(gap > 0) {
            for(int start = 0; start < gap; start++) {
                insertionSort(array, start, gap);
            }
            gap /= 2;
        }
    }
    public static void insertionSort(double[] array, int start, int gap) {
        for(int i = start+gap; i < array.length; i=i+gap) {
            double currentValue = array[i];
            int j = i;
            while(j >= gap && array[j-gap] > currentValue) {
                array[j] = array[j-gap];
                j = j-gap;
            }
            array[j] = currentValue;
        }
    }

    public static void printArray(double[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
}
