public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // Constructors
    public VipCustomer() {
        this("Default Name", 1d, "default@email.com");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@gmail.com");
    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}
