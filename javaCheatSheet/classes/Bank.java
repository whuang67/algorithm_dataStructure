public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructors ---
    public Bank() {
        this("0987654321", 100, "Serena van der Woodsen", "serena@vanderwoodsen.com", "800-999-9999");
        System.out.println("Empty constructor called!!!");
    }
    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called!!!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Bank(String customerName, String email, String phoneNumber) {
        this("0000000000", 0.01, customerName, email, phoneNumber);
    }
    // Setters ---
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters ---
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Deposit and Withdraw
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of "+String.format("%.2f", amount)+
                " processed. Remaining balance = "+ String.format("%.2f", this.balance));
    }
    public void withdraw(double amount){
        if(this.balance < amount)
            System.out.println("Only "+String.format("%.2f", this.balance)+" available. Withdrawal not processed.");
        else {
            this.balance -= amount;
            System.out.println("Withdrawal of "+String.format("%.2f", amount)+
                    " processed. Remaining balance = "+String.format("%.2f", this.balance));
        }
    }
}
