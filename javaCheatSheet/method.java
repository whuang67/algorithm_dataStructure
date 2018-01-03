public class ExpressionStatement {
    public static void main(String[] args) {
        // Keywords and Expression --------------------------
        int int2 = 5; // cannot use reserved keywords
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression.");
        }

        // Statement (doesn't have to be in one line only. multiple statements in one line.) --------------------------
        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable++;
        System.out.println("This is " +
                "a test! " + myVariable);
        int myVar2 = 1;
        myVar2--;
        System.out.println(myVar2);

        // Code block --------------------------
        boolean gameOver = true;
        int score = 5000; int levelCompleted = 5; int bonus = 100;
        if (score < 5000 && score >= 1000) {
            System.out.println("Your score was less than 5000 but greater than or equal to 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000. ");
        } else {
            System.out.println("Your score was greater than or equal to 5000.");
        }
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;  // finalScore will be deleted once this IF is done.
            System.out.println("Your final score was " + finalScore);
        }
        System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

        // Exercise 1
        int secondScore=10000; int secondLevel=8; int secondBonus=200;
        if (secondScore < 5000 && secondScore >= 1000) {
            System.out.println("Your score was less than 5000 but greater than or equal to 1000");
        } else if (secondScore < 1000){
            System.out.println("Your score was less than 1000. ");
        } else {
            System.out.println("Your score was greater than or equal to 5000.");
        }
        if (gameOver) {
            int finalScore = secondScore + secondLevel*secondBonus;
            System.out.println("Your final score was "+finalScore);
        }
        System.out.println(calculateScore(gameOver, secondScore, secondLevel, secondBonus));
        highScore = calculateScore(false, 1, 1, 1);
        System.out.println(highScore);

        // Exercise 2 (Plus the below methods)
        displayHighScorePosition("Charles Bass", 1);
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));

        // Method Overloading -------------------------- two methods share same name
        int newScore = calculateScore2("Serena van der Woodsen", 500);
        System.out.println("The new score is "+newScore);
        newScore = calculateScore2(499);
        System.out.println("The new score is "+newScore);
        newScore = calculateScore2();
        System.out.println("The new score is "+newScore);

        // Exercise 3 (Plus the below methods)
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(7, 13);
        calcFeetAndInchesToCentimeters(72);
        calcFeetAndInchesToCentimeters(-1);
    }

    // Method --------------------------
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {
        // void means that the method doesn't send anything back.
        if (gameOver) {
            int finalScore = score + levelCompleted*bonus + 1000;
            // System.out.println("Your final score "+finalScore+" from the METHOD!!!");
            return finalScore;
        }
        return -1;
    }

    // Exercise 2
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName+" managed to get into position "+position+" on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
        if (score>=1000)
            return 1;
        else if (score>=500)
            return 2;
        else if (score>=100)
            return 3;
        else
            return 4;
    }

    // Method Overloading -------------------------- two methods share same name
    public static int calculateScore2(String playerName, int score) {
        System.out.println("Player "+playerName+" scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore2(int score) {
        System.out.println("Unnamed player scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore2() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // Exercise 3
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet<0d) || (inches<0d) || (inches>= 12d)) {
            System.out.println("Invalid feet or inches parameters.");
            return -1d;
        }
        double cm = 2.54*(feet*12+inches);
        System.out.println(feet+" feet, "+inches+" inches = "+cm+" cm.");
        return cm;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches<0d){
            System.out.println("Invalid feet or inches parameters.");
            return -1d;
        }
        double feet = (int) (inches/12);
        double inchesActual = inches - feet*12;
        return calcFeetAndInchesToCentimeters(feet, inchesActual);
    }
}
