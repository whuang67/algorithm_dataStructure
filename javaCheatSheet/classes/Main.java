public class Main {
    public static void main (String[] args){
        Bank myAccount = new Bank("1234567890", 0.11, "Charles Bass", "charles@bass.com", "110-119-1200");
//        myAccount.setAccountNumber("1234567890");
//        myAccount.setBalance(0.11);
//        myAccount.setCustomerName("Charles Bass");
//        myAccount.setEmail("charles@bass.com");
//        myAccount.setPhoneNumber("110-119-1200");

        myAccount.deposit(101);
        myAccount.withdraw(100);

        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());


        Bank myAccount2 = new Bank();
        System.out.println(myAccount2.getAccountNumber());
        System.out.println(myAccount2.getBalance());
        System.out.println(myAccount2.getCustomerName());
        System.out.println(myAccount2.getEmail());
        System.out.println(myAccount2.getPhoneNumber());
    }
}
