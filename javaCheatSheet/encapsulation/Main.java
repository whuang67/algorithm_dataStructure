public class Main {
    public static void main(String[] args){
        Player player = new Player();
        player.name = "Chuck Bass";
        player.health = 100;
        player.weapon = "ImChuckBass.";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());

        player.health = 92;
        player.loseHealth(91);
        System.out.println("Remaining health = "+player.healthRemaining());
        System.out.println("------------------------------------------");

        EnhancedPlayer player2 = new EnhancedPlayer("Serena VDW", -1, "Cry");
        System.out.println("Initial health is "+player2.getHealth());
        System.out.println("------------------------------------------");

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = "+printer.getNumberOfPages());
        printer.printPages(3);
        System.out.println("Updated page count = "+printer.getNumberOfPages());
        printer = new Printer(50, true);
        printer.printPages(6);
        System.out.println("Updated page count = "+printer.getNumberOfPages());
    }

}
