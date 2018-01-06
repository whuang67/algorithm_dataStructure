import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            System.out.println(fibonacci(i));
        }

        String string = "This is awesome!";
        System.out.println(reverse(string));

        int[] coins = {1, 5, 10, 25};
        System.out.println(recCoin(coins, 10));
        System.out.println(recCoin(coins, 45));
        System.out.println(recCoin(coins, 23));
        System.out.println(recCoin(coins, 52));
    }

    // Fibonacci ------------------------------------
    public static int fibonacci(int n) {
        if(n == 1 || n == 2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    // Reverse a string ------------------------------------
    public static String reverse(String string) {
        if(string.length() == 1)
                return string;
        return reverse(string.substring(1, string.length())) + string.substring(0, 1);
    }

    // Given a target amount n and a list (array) of distinct coin values, what's the
    // fewest coins needed to make the change amount.
    public static int recCoin(int[] coins, int target) {
        if(IntStream.of(coins).anyMatch(x -> x == target))    // ------------------------------ Important --
            return 1;

        int minimumCoins = target;
        for(int i = 0; i < coins.length; i++) {
            if(coins[i] < target) {
                int possibleCoins = recCoin(coins, target-coins[i]) + 1;
                if(possibleCoins < minimumCoins)
                    minimumCoins = possibleCoins;
            }
        }
        return minimumCoins;
    }
}
