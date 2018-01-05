import java.util.ArrayList;
import java.util.Scanner;

class GroceryList {
    // private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have "+groceryList.size()+" items in your list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1)+" has been modified.");
    }
    public void removeGroceryItem(int position) {
        //bString theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String item) {
        // boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if(position >= 0)
            return groceryList.get(position);
        return null;
    }
}


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    processArrayList();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print the choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the applicatoin.");
        System.out.println("\t Anything else - Surprise!");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Please enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter replacement item: ");
        String item = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo-1, item);  // java 0-; user 1-
    }

    public static void removeItem() {
        System.out.print("Please enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchItem() {
        System.out.print("Please enter the item name: ");
        String item = scanner.nextLine();
        if(groceryList.findItem(item) != null)
            System.out.println("Found "+item+" in your grocery list.");
        else
            System.out.println(item+" is not int the grocery list.");
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
