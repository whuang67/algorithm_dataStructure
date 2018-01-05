class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    private String additionName1;
    private double additionPrice1;
    private String additionName2;
    private double additionPrice2;
    private String additionName3;
    private double additionPrice3;
    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name+" hamburger on a "+this.breadRoll+" roll. Price is "+this.price+".");
        if(this.additionName1 != null) {
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added "+this.additionName1+" for an extra "+this.additionPrice1);
        }
        if(this.additionName2 != null) {
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added "+this.additionName2+" for an extra "+this.additionPrice2);
        }
        if(this.additionName3 != null) {
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added "+this.additionName3+" for an extra "+this.additionPrice3);
        }
        if(this.additionName4 != null) {
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added "+this.additionName4+" for an extra "+this.additionPrice4);
        }
        System.out.println("Total price is "+hamburgerPrice);
        return hamburgerPrice;
    }
}

class HealthyBurger extends Hamburger{
    private String healthyExtraName1;
    private double healthyExtraPrice1;
    private String healthyExtraName2;
    private double healthyExtraPrice2;
    public HealthyBurger(String meat, double price) {
        super("Health", "Brown Rye", meat, price);
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;
    }
    public void addHealthAddition2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtraName1 != null) {
            hamburgerPrice += this.healthyExtraPrice1;
            System.out.println("Added "+this.healthyExtraName1+" for an extra "+this.healthyExtraPrice1);
        }
        if(this.healthyExtraName2 != null) {
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println("Added "+this.healthyExtraName2+" for an extra "+this.healthyExtraPrice2);
        }
        System.out.println("Total price is "+hamburgerPrice);
        return hamburgerPrice;
    }
}

class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 14.99);
        super.addHamburgerAddition1("Chips", 2.99);
        super.addHamburgerAddition2("Coke", 1.89);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}

public class Main {
    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.99);
        hamburger.addHamburgerAddition1("Tomato", 1);
        hamburger.addHamburgerAddition2("Lettuce", 1);
        hamburger.addHamburgerAddition3("Cheese", 0.9);
        hamburger.itemizeHamburger();
        System.out.println("-------------------------------");

        HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.99);
        healthyburger.addHamburgerAddition1("Chicken", 10);
        healthyburger.addHealthAddition1("Egg", 0.1);
        healthyburger.itemizeHamburger();

        System.out.println("-------------------------------");
        DeluxeBurger deluxeburger = new DeluxeBurger();
        deluxeburger.addHamburgerAddition1("Beef", 10);
        deluxeburger.itemizeHamburger();
    }
}
