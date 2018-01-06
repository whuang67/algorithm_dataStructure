public class Main {
    public static void main(String[] args) {
        System.out.println(factorial_LOOP(4));
        System.out.println(factorial_Recursion(4));

        System.out.println(recSum(100));

        System.out.println(sumFunc(4321));

    }

    public static int factorial_LOOP(int n) {
        int result = 1;
        while(n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    public static int factorial_Recursion(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n*factorial_Recursion(n-1);
    }

    // Write a recursive function which takes a non-negative integer and computes the
    // cumulative sum of 0 to that integers.
    public static int recSum(int n) {
        if(n == 0 || n == 1)
            return n;
        return n+recSum(n-1);
    }

    // Given an integer, create a function that returns the sum of all individual digits
    // in that integer. For example: if n = 4321, return 4+3+2+1=10
    public static int sumFunc(int n) {
        if(n >= 0 && n < 10)
            return n;
        return sumFunc(n/10)+n%10;
    }

    // Create a function called word_split() which takes in a string phrase and a set
    // list_of_words. The function will then determine if it is possible to split the
    // string in a way words can be made from the list of words.
    // You can assume the phrase will only contain words found in the dictionary if it
    // is splittable.
}
