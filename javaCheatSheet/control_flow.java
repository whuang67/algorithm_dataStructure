public class Main {
    public static void main (String[] args){
        // Switch statement (IF vs SWITCH) -----------------------------
        int value = 3;
        if (value == 1)
            System.out.println("Value is 1.");
        else if (value == 2)
            System.out.println("Value is 2.");
        else
            System.out.println("Value is neither 1 nor 2.");

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Switch value is 1");
                break;
            case 2:
                System.out.println("Switch value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Switch value is 3 or 4 or 5. Actually it's "+switchValue);
                break;
            default:
                System.out.println("Switch value is not 1, 2, 3, 4 or 5.");
                break;
        }

        // Exercise 1 -- Switch Statement
        char switchChar = 'F';
        switch(switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar+" is found.");
                break;
            default:
                System.out.println("Could not find A, B, C, D or E.");
                break;
        }
        String month = "januarY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan.");
                break;
            case "february":
                System.out.println("Feb.");
                break;
            default:
                System.out.println("Not sure.");
                break;
        }


        // FOR statement (with Exercise 2) -----------------------------
        for(int i = 2; i<=8; i++){
            System.out.println("10,000 at "+i+"% interest = "+
                    String.format("%.2f", calcInterest(10_000d, i)));
        }
        System.out.println("******************************");
        for(int i = 8; i>=2; i--){
            System.out.println("10,000 at "+i+"% interest = "+
                    String.format("%.2f", calcInterest(10_000d, i)));
        }

        int count = 0;
        for(int i = 10; i<=50; i++){
            if(isPrime(i)) {
                System.out.println("Number "+i+" is a prime one.");
                count++;
                if(count == 3){
                    System.out.println("Exit the FOR loop.");
                    break;
                }
            }
        }


        // WHILE statement (with Exercise 3) -----------------------------
        count = 0;
        while(count != 5){
            System.out.println("Count value is "+count);
            count++;
        }
        count = 0;
        do {   // Execute at least once.
            System.out.println("Count value is "+count);
            count++;
        } while(count != 6);

        int number = 5; int finishNumber = 20; int evenCount = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number: "+number);
            number++;
            evenCount++;
            if(evenCount >= 5){
                System.out.println("Total number of even number is "+evenCount);
                break;
            }
        }
        number = 5; finishNumber = 20; evenCount = 0;
        do {
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number: "+number+" (DO WHILE)");
            number++;
            evenCount++;
            if(evenCount >= 5){
                System.out.println("Total number of even number is "+evenCount+" (DO WHILE)");
                break;
            }
        } while(number <= finishNumber);
    }

    public static double calcInterest(double amount, double interestRate) {
        return amount * interestRate / 100d;
    }

    public static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEvenNumber(int n){
        if(n%2==0)
            return true;
        return false;
    }
}
