public class Hello {
    public static void main(String[] args) {
        // Beginning ------------------------------
        System.out.println("Hello World!");

        // Variable Type
        int myFirstNumber = 10+5+2*10;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber*2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        System.out.println("mySecondNumber");
        int myLastNumber = 1000-myTotal;
        System.out.println(myLastNumber);

        // Int, Byte, Short and Long ------------------------------
        // Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myNewInt = myMinValue/2;
        System.out.println(myNewInt);

        // byte has a width of 8
        byte myByteValue = 10;  /* -128 to 127 */
        byte myNewByte = (byte) (myByteValue/2);
        System.out.println(myNewByte);
        
        // short has a width of 16
        short myShortValue = 30000; /*  -32768 to 32767 */
        short myNewShort = (short) (myShortValue/2);
        System.out.println(myNewShort);
        
        // long has a width of 64
        long myLongValue = 100L;   /* -2^63 to 2^63-1*/
        long myNewLong = myLongValue/2;
        System.out.println(myNewLong);

        // Exercise 1
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 50;
        long longVar = 50000 + 10 * (byteVar + shortVar + intVar);
        System.out.println(longVar);

        // Float and Double ------------------------------
        int myIntValue = 5/3;  // Width 32
        float myFloatValue = 5f/3f;   // Width 32
        double myDoubleValue = 5d/3d;   // Width 64
        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        // Exercise 2
        double pounds = 200d;
        double kilogram = pounds*0.45359237;
        System.out.println("Kilogram: "+kilogram);

        // Char and Boolean ------------------------------
        char myChar = 'D'; // Single quote '
        char myChar2 = '\u00A9';
        System.out.println("Unicode output is " + myChar2);
        boolean myBoolean = true; // or false

        // Exercise 3
        char myChar3 = '\u00AE';
        System.out.println("Registered symbol is "+myChar3);

        // String ------------------------------  
        String myString = "This is a string!";
        myString += " And there are more!";
        System.out.println(myString);

        String numberString = "250.55";
        numberString += "49.55";
        System.out.println(numberString);

        String lastString = "10";
        lastString += 50;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        System.out.println(lastString+doubleNumber);

        // Operators ------------------------------
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result -= 1;
        System.out.println(previousResult+" - 1 = "+result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult+" * 10 = "+result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult+" / 5 = "+result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult+" % 3 = "+result);

        result++;
        System.out.println("Result is now "+result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("This is not an alien!");
        else
            System.out.println("This is an alien.");

        int topScore = 99;
        int secondScore = 80;
        if (topScore > secondScore && topScore < 100)
            System.out.println("Greater than top 2nd score, less than 100");
        if ((topScore>90) || (secondScore<70))
            System.out.println("At least one is true.");
        boolean isCar = false;
        if (isCar)
            System.out.println("This is no supposed to happen!");
        boolean wasCar = isCar ? true: false; // if isCar == true, then wasCar = true -- if isCar == false, then wasCar = false
        if (!wasCar)
            System.out.println("wasCar is false");

        // Exercise 4
        double doubleVar1 = 20d;
        double doubleVar2 = 80d;
        double newVar = (doubleVar1 + doubleVar2)*25;
        System.out.println(newVar);
        double remainder = newVar%40;
        System.out.println("The remainder is "+remainder);
        if (remainder<=20)
            System.out.println("Total was over the limits.");


    }
}
