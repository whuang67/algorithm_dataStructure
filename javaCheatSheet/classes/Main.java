public class Main {
    public static void main (String[] args){
        // CLASS Bank ----------------------------------
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


        Bank myAccount3 = new Bank("Nate Archibald", "nate@archibald.com", "123-456-7890");
        System.out.println(myAccount3.getAccountNumber());
        System.out.println(myAccount3.getBalance());
        System.out.println(myAccount3.getCustomerName());
        System.out.println(myAccount3.getEmail());
        System.out.println(myAccount3.getPhoneNumber());


        // CLASS VipCustomer ----------------------------------
        VipCustomer vipCustomer = new VipCustomer();
        printOutVipCustomer(vipCustomer);
        vipCustomer = new VipCustomer("Blair Waldolf", 100);
        printOutVipCustomer(vipCustomer);
        vipCustomer = new VipCustomer("Lily van der Woodsen", 0.01, "lily@vanderwoodsen.com");
        printOutVipCustomer(vipCustomer);


        // CLASS Animal ----------------------------------
        Animal animal = new Animal("Kate", 1,1, 5, 5);
        Dog dog = new Dog("Lucy", 8, 20, 2, 4, 1,20,"long silky");
        // animal.eat();dog.eat();
        // animal.move(1);
        dog.walk(); dog.run();
    }

    public static void printOutVipCustomer(VipCustomer vip){
        System.out.println("Name: "+vip.getName()+
                ", Credit: "+String.format("%.2f", vip.getCreditLimit())+
                ", Email: "+vip.getEmail());
    }
}
