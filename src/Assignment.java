import Account.CustomerAccount;
import java.util.*;
import java.text.SimpleDateFormat;

import Enquire.*;
import Order.CustomerOrder;
import Order.Products;

public class Assignment {

    static int orderID = 0;
    static int customerID = 0;
    static int inquiryID = 0;
    static int returnID = 0;
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    static Date date = new Date();
    static Scanner input = new Scanner(System.in);
    static ArrayList<CustomerAccount> accounts = new ArrayList<>();
    static ArrayList<CustomerOrder> orders = new ArrayList<>();
    static ArrayList<Inquiry> inquiries = new ArrayList<>();
    static ArrayList<Return> Return = new ArrayList<>();
    static ArrayList<Products> products = new ArrayList<>();

    public static void main(String args[]) {
        insertProducts();
        Operator user = new Operator();
        user.loginUser();
        mainMenu();
    }
    public static void insertProducts(){
        Products UltraBoost = new Products (1, "Adidas UltraBoost", "These running shoes combine comfort and high performance technology", 840.99, 24);
        products.add(UltraBoost);
        Products NMD = new Products (2, "Adidas NMD", "A pioneer of contemporary street style, NMD is the future", 540.60, 24);
        products.add(NMD);
        Products Adizero = new Products (3,"Adidas Adizero Boston 7","Light, Fast and connected to the road in them shoes", 470.30, 32);
        products.add(Adizero);
        Products RealMadrid = new Products (4,"Adidas Real Madrid Training Pants","The track pants are designed to carry", 207.00, 26);
        products.add(RealMadrid);
        Products IDPants = new Products (5,"Adidas ID Pants","Reset after your workout, best men's pants for cosy and softness", 179.20, 27);
        products.add(IDPants);
        Products PrintedPants = new Products (6,"Adidas Printed Pants","Make a statement on the links in these men's golf pants", 310.90, 13);
        products.add(PrintedPants);
        Products Trefoil = new Products (7,"Adidas Trefoil Tee","The adidas Trefoil first appeared on the scene", 140.90, 33);
        products.add(Trefoil);
        Products IronMan = new Products (8,"Adidas Marvel Iron Man","Iron man tee pays tribute to the Iron Man", 142.90, 10);
        products.add(IronMan);
        Products SuperNova = new Products (9,"Adidas Supernova Tee","Power through your run in long-lasting goodness", 230.90, 25);
        products.add(SuperNova);
    }

    public static void mainMenu() {
        try {
            System.out.println("\n================= MENU =================\n" +
                    "Please Select An Option\n");
            System.out.print("1. Customer Account Management\n" +
                    "2. Customer Order\n" +
                    "3. Inquiries/Complaints\n\n" +
                    "Enter your choice or -1 to exit: ");
            int mainSelection = input.nextInt();
            input.nextLine();

            while (mainSelection != -1) {
                switch (mainSelection) {
                    case 1:
                        System.out.println("You have selected Customer Account Management");
                        subMenu(1);
                        break;
                    case 2:
                        System.out.println("You have selected Customer Order");
                        subMenu(2);
                        break;
                    case 3:
                        System.out.println("You have selected Inquiries/Complaints");
                        subMenu(3);
                        break;
                    default:
                        System.out.println("\nInvalid option! Please enter 1-3 or -1 to exit");
                        break;
                }
                System.out.println("\n================= MENU =================\n" +
                        "Please Select An Option\n");
                System.out.print("1. Customer Account Management\n" +
                        "2. Customer Order\n" +
                        "3. Inquiries/Complaints\n\n" +
                        "Enter your choice or -1 to exit: ");
                mainSelection = input.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input! Please try again");
        }
    }

    public static void subMenu(int choice) {
        try {
            int subSelection = choice;
            switch (subSelection) {
                case 1:
                    System.out.print("\n============ Sub Menu Account ============\n" +
                            "Select your option:\n\n" +
                            "1.Create account for new customer\n" +
                            "2.Search for existing customer\n" +
                            "3.Update existing customer's record\n" +
                            "4.Generate customer contacts\n\n" +
                            "Enter your choice(1-4) or -1 to go back: ");
                    int subSelection1 = input.nextInt();

                    while (subSelection1 != -1) {
                        switch (subSelection1) {
                            case 1:
                                System.out.println("\n============ Create Account ============\n" +
                                        "You have selected to create account");
                                createAccount();
                                break;
                            case 2:
                                System.out.println("\n============ Search Account ============\n" +
                                        "You have selected to search for existing customer");
                                searchAccount();
                                break;
                            case 3:
                                System.out.println("\n============ Update Account ============\n" +
                                        "You have selected to update account");
                                updateAccount();
                                break;
                            case 4:
                                System.out.println("\nYou have selected to generate customer contacts");
                                System.out.println(accounts.toString());
                                break;
                            default:
                                System.out.print("\nInvalid Option! Please enter range 1-4 or -1 to go back");
                                break;

                        }
                        System.out.print("\n\n============ Sub Menu Account ============\n" +
                                "Select your option:\n\n" +
                                "1.Create account for new customer\n" +
                                "2.Search for existing customer\n" +
                                "3.Update existing customer's record\n" +
                                "4.Generate customer contacts\n\n" +
                                "Enter your choice(1-4) or -1 to go back: ");
                        subSelection1 = input.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("\n============ Sub Menu Order ============\n" +
                            "Select the option to proceed:\n\n" +
                            "1. Display all products\n" +
                            "2. Create New Order\n" +
                            "3. Search Existing Order\n" +
                            "4. Update/Change Existing Order\n" +
                            "5. Deliver Order\n" +
                            "6. Display all Orders\n" +
                            "7. Cancel Order\n" +
                            "\nEnter your choice(1-6) or -1 to go back: ");
                    int subSelection2 = input.nextInt();

                    while (subSelection2 != -1) {
                        switch (subSelection2) {
                            case 1:
                                System.out.println("\n============ Display Items ============" +
                                        "\nYou have chosen to display the list of items\n");
                                System.out.println(products.toString());//get Method
                                break;
                            case 2:
                                System.out.println("\n============ Create Order ============" +
                                        "\nYou have chosen to create a new order\n");
                                createOrder();
                                break;
                            case 3:
                                System.out.println("\n============ Search Order ==============" +
                                        "\nYou have chosen search for existing order\n");

                                searchOrder();
                                break;
                            case 4:
                                System.out.println("\n============ Update/Modify Order ============\n" +
                                        "\nYou have chosen to update \"Pending\" orders\n");
                                updateOrder();
                                break;
                            case 5:
                                System.out.println("\n============ Deliver Order ============\n" +
                                        "\nYou have chosen to update \"Pending\" orders\n");
                                orderDelivered();
                                break;
                            case 6:
                                System.out.println("\n============ Display Order =============" +
                                        "\nYou have chosen to display all order\n");
                                System.out.print(orders.toString());
                                break;
                            case 7:
                                System.out.println("\n============ Cancel Order =============" +
                                        "\nYou have chosen to cancel an order\n");
                                cancelOrder();
                                break;
                            default:
                                System.out.print("\nInvalid option, please try again(1-7): ");
                                break;
                        }
                        System.out.print("\n============ Sub Menu Order ============\n" +
                                "Select the option to proceed:\n\n" +
                                "1. Display all products\n" +
                                "2. Create New Order\n" +
                                "3. Search Existing Order\n" +
                                "4. Update/Change Existing Order\n" +
                                "5. Deliver Order\n" +
                                "6. Display All Orders\n" +
                                "7. Cancel Order\n" +
                                "\nEnter your choice(1-6) or -1 to go back: ");
                        subSelection2 = input.nextInt();
                    }

                    break;
                case 3:
                    System.out.print("\n============ Sub Menu Inquiry ============\n" +
                            "Select your option:\n\n" +
                            "1.Create an Enquiry\n" +
                            "2.Display Enquiry logs\n" +
                            "3.Search for an Enquiry\n" +
                            "4.Return/Defects\n" +
                            "5.Search Returns\n\n" +
                            "Enter your selection(1-5) or -1 to go back: ");
                    int subSelection3 = input.nextInt();

                    while (subSelection3 != -1) {
                        switch (subSelection3) {
                            case 1:
                                System.out.println("You have selected to create an Enquiry");
                                createInquiry();
                                break;
                            case 2:
                                System.out.println("\nYou have selected to display all Enquiry log");
                                System.out.println(inquiries.toString());
                                break;
                            case 3:
                                System.out.println("\nYou have selected to search for an Enquiry");
                                searchInquiry();
                                break;
                            case 4:
                                System.out.println("\nYou have selected Return/defects");
                                defects();
                                break;
                            case 5:
                                System.out.println("\nYou have selected to search Returned order");
                                defectSearch();
                                break;
                            default:
                                System.out.print("\nInvalid selection made, please try again(1-5)");
                                break;
                        }
                        System.out.print("\n============ Sub Menu Inquiry ============\n" +
                                "Select your option:\n\n" +
                                "1.Create an Enquiry\n" +
                                "2.Display Enquiry logs\n" +
                                "3.Search for an Enquiry\n" +
                                "4.Return/Defects\n" +
                                "5.Search Returns\n\n" +
                                "Enter your selection(1-5) or -1 to go back: ");
                        subSelection3 = input.nextInt();

                    }
                    break;
                default:
                    System.out.print("\nInvalid Option! Please enter range 1-3 or -1 to exit");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("\nYou have entered an invalid value. Please try again");
        }
    }

    public static void createAccount() {
        increment();
        System.out.println("\nCustomer ID: " + customerID);
        input.nextLine();
        try {
            System.out.print("Enter customer's name: ");
            String name = input.nextLine();

            System.out.print("Enter customer's phone number: ");
            String phoneNo = input.nextLine();

            System.out.print("Enter customer's email: ");
            String email = input.nextLine();

            System.out.print("Enter customer's address: ");
            String address = input.nextLine();

            System.out.print("Enter customer's date of birth: ");
            String dateOfBirth = input.nextLine();

            System.out.print("Enter customer's gender: ");
            char gender = input.next().charAt(0);

            CustomerAccount account = new CustomerAccount(customerID, name, phoneNo, email, address, dateOfBirth, gender);
            accounts.add(account);
        }catch (InputMismatchException e){
            System.out.println("\nInput invalid! Please try again");
        }
    }

    public static void searchAccount() {
        try {
            input.nextLine();
            System.out.print("Enter customer's phone number: ");
            String searchNo = input.nextLine();
            System.out.print("\n");
            int value = 0;
            int searchListLength = accounts.size();
            for (int i = 0; i < searchListLength; i++) {
                if (accounts.get(i).getPhoneNo().equals(searchNo)) {
                    value = i;
                    break;
                }
            }
            System.out.print(accounts.get(value));
        }catch(IndexOutOfBoundsException e){
            System.out.println("\nUser Account not found!");
        }catch (InputMismatchException e){
            System.out.println("\nInvalid Customer ID");
        }
    }

    public static void updateAccount() {
        try {
            input.nextLine();
            System.out.print("Enter customer's phone number: ");
            String searchNo = input.nextLine();
            System.out.print("\n");
            int value = 0;
            int searchListLength = accounts.size();
            for (int i = 0; i < searchListLength; i++) {
                if (accounts.get(i).getPhoneNo().equals(searchNo)) {
                    value = i;
                    break;
                }
            }
            System.out.print(accounts.get(value)+ "\n");
            System.out.print("\n============ Update Account ============\n\n" +
                    "1. Update name\n" +
                    "2. Update date of birth \n" +
                    "3. Update email\n" +
                    "4. Update phone number\n" +
                    "5. Update address\n" +
                    "6. Update gender\n" +
                    "\nSelect your option or -1 to exit: ");
            int selection = input.nextInt();
            input.nextLine();

            while (selection != -1) {
                switch (selection) {
                    case 1:
                        System.out.print("\nYou have selected to update customer's name\n" +
                                "Enter new name: ");
                        String newName = input.nextLine();
                        accounts.get(value).setName(newName);
                        break;
                    case 2:
                        System.out.print("\nYou have selected to update customer's date of birth\n" +
                                "Enter new date: ");
                        String newDoB = input.nextLine();
                        accounts.get(value).setDateOfBirth(newDoB);
                        break;
                    case 3:
                        System.out.print("\nYou have selected to update customer's email\n" +
                                "Enter new email: ");
                        String newEmail = input.nextLine();
                        accounts.get(value).setEmail(newEmail);
                        break;
                    case 4:
                        System.out.print("\nYou have selected to update customer's phone number\n" +
                                "Enter new phone number: ");
                        String newPhone = input.nextLine();
                        accounts.get(value).setPhoneNo(newPhone);
                        break;
                    case 5:
                        System.out.print("\nYou have selected to update customer's address\n" +
                                "Enter new address: ");
                        String newAddress = input.nextLine();
                        accounts.get(value).setAddress(newAddress);
                        break;
                    case 6:
                        System.out.print("\nYou have selected to update customer's gender\n" +
                                "Enter new gender: ");
                        char newGender = input.next().charAt(0);
                        accounts.get(value).setGender(newGender);
                        break;
                    default:
                        System.out.print("\nInvalid Option! Please enter range 1-6 or -1 to go back");
                        break;
                }
                System.out.print("\n============ Update Account ============\n\n" +
                        "1. Update name\n" +
                        "2. Update date of birth \n" +
                        "3. Update email\n" +
                        "4. Update phone number\n" +
                        "5. Update address\n" +
                        "6. Update gender\n" +
                        "\nSelect your option or -1 to exit: ");
                selection = input.nextInt();
                input.nextLine();
            }
        }catch(InputMismatchException e){
            System.out.println("\nYou have entered an invalid value. Please try again");
        }catch (IndexOutOfBoundsException e){
            System.out.println("\nNo accounts were found!");
        }
    }

    public static void increment(){
        customerID++;
    }

    public static void increment1(){
        inquiryID++;
    }

    public static void increment2(){
        orderID++;
    }
    public static void increment3(){
        returnID++;
    }

    public static void createOrder() {

        String status = "Pending";

        String oDate = dateFormat.format(date);
        input.nextLine();

        System.out.println("Order status:\t " + status);
        System.out.println("Order date:\t " + oDate);

        try {
            System.out.print("Delivery date: ");
            String deliDate = input.nextLine();

            System.out.print("Enter customer's ID: ");
            int userID = input.nextInt();

            System.out.print("Enter item ID: ");
            int itemID = input.nextInt();
            input.nextLine();

            int searchItem = 0;
            int searchListLength = products.size();
            for (int i = 0; i < searchListLength; i++) {
                if (products.get(i).getProductID() == itemID) {
                    searchItem = i;
                    break;
                }
            }

            System.out.print("Enter quantity: ");
            int itemQ = input.nextInt();
            input.nextLine();


            if (products.get(searchItem).getQuantity()<itemQ){
                System.out.println("Insufficient stock. Please check the amount of stock left.");
                return;
            } else if (products.get(searchItem).getQuantity() > 0) {
                int newStock = products.get(searchItem).getQuantity() - itemQ;
                products.get(searchItem).setQuantity(newStock);
            } else {
                System.out.println("Insufficient stock. Please check the amount of stock left.");
                return;
            }


            double pricePerItem = products.get(searchItem).getPricePerItem();
            products.get(searchItem).setTotalPrice(itemQ, pricePerItem);

            double totalPrice = products.get(searchItem).getTotalPrice();
            System.out.printf("Total Price: %.2f",totalPrice);

            System.out.print("\nEnter remarks: ");
            String remarks = input.nextLine();

            Operator user = new Operator();
            String operator = user.getName();
            increment2();

            CustomerOrder order = new CustomerOrder(orderID, status, oDate, deliDate, userID, itemID, itemQ, remarks, operator, totalPrice);
            orders.add(order);
            System.out.printf("\nSummary\n" +
                    "Order ID: " + orderID +
                    "\nOrder status: " + status +
                    "\nOrder date: " + oDate +
                    "\nDelivery date: " + deliDate +
                    "\nCustomer ID: " + customerID +
                    "\nItem ID: " + itemID +
                    "\nQuantity: " + itemQ +
                    "\nTotal price: %.2f" +
                    "\nRemarks: " + remarks, totalPrice);
        }catch(InputMismatchException e){
            System.out.println("\nInput invalid! Please review and try again");
        }catch(IndexOutOfBoundsException e){
            System.out.println("\nNo such product ID found! Please review and try again");
        }
    }


    public static void searchOrder() {
        try {
            System.out.print("Enter order ID: ");
            int searchID = input.nextInt();
            int search = 0;
            int searchListLength = orders.size();
            for (int i = 0; i < searchListLength + 1; i++) {
                if (orders.get(i).getOrderID() == searchID) {
                    search = i;
                    break;
                }
            }
            System.out.println(orders.get(search)+ "\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nOrder not found.");
        } catch (InputMismatchException e){
            System.out.println("\nInvalid Order ID! Please try again");
        }
    }

    public static void updateOrder(){
        try{
            System.out.print("Enter order ID: ");
            int searchID = input.nextInt();
            int search = 0;
            int searchListLength = orders.size();
            for (int i = 0; i < searchListLength + 1; i++) {
                if (orders.get(i).getOrderID()==searchID) {
                    search = i;
                    break;
                }
            }
            System.out.println(orders.get(search) + "\n");

            if (orders.get(search).getStatus().equals("Pending")){
                System.out.print("\nWhat would you like to update?\n\n" +
                        "1. Update quantity\n" +
                        "2. Update delivery date\n" +
                        "\nSelect your option(1-2) or -1 to exit: ");
                int updateSelection = input.nextInt();
                input.nextLine();

                while (updateSelection != -1) {
                     switch (updateSelection) {
                            case 1:
                                try {
                                    System.out.print("You have selected to update quantity\n" +
                                            "\nEnter new quantity: ");
                                    int newQuant = input.nextInt();
                                    int x = Math.abs(orders.get(search).getItemQ()-newQuant);
                                    int y = Math.abs(newQuant-orders.get(search).getItemQ());
                                    int size = x * y;

                                    if (orders.get(search).getItemQ()<newQuant){
                                        products.get(search).setQuantity(products.get(search).getQuantity()-size);
                                    } else if (orders.get(search).getItemQ()<newQuant){
                                        products.get(search).setQuantity(size-products.get(search).getQuantity());
                                    }

                                    orders.get(search).setItemQ(newQuant);
                                    double newPricePerItem = products.get(search).getPricePerItem();
                                    Products.setTotalPrice(newQuant,newPricePerItem);
                                    double newTotalPrice = Products.getTotalPrice();
                                    orders.get(search).setTotalPrice(newTotalPrice);
                                    System.out.printf("Total price: %.2f", newTotalPrice);
                                    break;
                                }catch (InputMismatchException e){
                                    System.out.println("\nInvalid Quantity! Please try again" + e);
                                }

                                break;
                            case 2:
                                try {
                                    System.out.print("\nYou have selected to update delivery date" +
                                            "\nEnter new date: ");
                                    String newDate = input.nextLine();
                                    orders.get(search).setDeliDate(newDate);
                                    break;
                                }catch (InputMismatchException e){
                                    System.out.print("Invalid Date! Please try again" + e);
                                }

                            default:
                                System.out.print("\nInvalid Option! Please enter the range 1-2 or -1 to go back");
                                break;
                    }

                    System.out.print("\nWhat would like to update next?\n\n" +
                            "1. Update quantity\n"  +
                            "2. Update delivery date\n" +
                            "Select your option(1-2) or -1 to exit: ");
                    updateSelection = input.nextInt();
                    input.nextLine();
                }
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("\nNo available \"pending\" orders to be updated");
        }
        catch (InputMismatchException e){
            System.out.print("\nInvalid Input! Please try again");
        }

    }
    public static void orderDelivered(){
        try{
            System.out.print("Enter order ID: ");
            int searchID = input.nextInt();
            int search = 0;
            int searchListLength = orders.size();
            for (int i = 0; i < searchListLength + 1; i++) {
                if (orders.get(i).getOrderID()==searchID) {
                    search = i;
                    break;
                }
            }
            orders.get(search).setStatus("Shipped");
            System.out.println(orders.get(search) + "\n");
        }catch (InputMismatchException e){
            System.out.println("\nInvalid Order ID! Try again");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nNo orders found!");
        }

    }

    public static void cancelOrder(){
        try{
            System.out.print("Enter order ID: ");
            int searchID = input.nextInt();
            int search = 0;
            int searchListLength = orders.size();
            for (int i = 0; i < searchListLength + 1; i++) {
                if (orders.get(i).getOrderID()==searchID) {
                    search = i;
                    break;
                }
            }
            orders.get(search).setStatus("Cancelled");
            System.out.println(orders.get(search) + "\n");
        }catch (InputMismatchException e){
            System.out.println("\nInvalid Order ID! Try again");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nNo orders found!");
        }

    }

    public static void createInquiry(){
        String inquiryDate = dateFormat.format(date);
        input.nextLine();

        increment1();

        try{
            System.out.println("Inquiry ID: " + inquiryID);

            System.out.print("Enter Customer's ID: ");
            int cid = input.nextInt();
            input.nextLine();

            System.out.print("Enter the Enquiry Made: ");
            String inquiry = input.nextLine();

            Inquiry inquire = new Inquiry(inquiryID, inquiryDate, cid, inquiry);
            inquiries.add(inquire);
        }catch(InputMismatchException e){
            System.out.print("Input invalid! Try again");
        }
    }

    public static void searchInquiry(){
        try {
            System.out.print("Enter customer ID for inquiries: ");
            int searchID = input.nextInt();
            int search = 0;
            int searchListLength = accounts.size();
            for (int i = 0; i < searchListLength; i++) {
                if (accounts.get(i).getID() == searchID) {
                    search = i;
                    break;
                }
            }
            System.out.println(accounts.get(search)+ "\n");

            try {
               searchListLength = inquiries.size();
                for (int i = 0; i < searchListLength; i++) {
                    if (inquiries.get(i).getCid() == searchID) {
                        search = i;
                    }
                    System.out.println(inquiries.get(search));
                }

            } catch (Exception e) {
                System.out.println("\nInquiries not found." +e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nCustomer not found");
        } catch (InputMismatchException e){
            System.out.print("\nInvalid Customer ID! Please try again");
        }

    }
    public static void defects() {
        try {
            increment3();
            System.out.print("\nEnter order's ID: ");
            int searchInquiry = input.nextInt();
            input.nextLine();
            int search = 0;
            int searchListLength = orders.size();
            for (int i = 0; i < searchListLength; i++) {
                if (orders.get(i).getOrderID() == searchInquiry) {
                    search = i;
                    break;
                }
            }
            int user = orders.get(search).getUser();
            search = 0;
            searchListLength = accounts.size();
            for (int i = 0; i < searchListLength + 1; i++) {
                if (accounts.get(i).getID() == user) {
                    search = i;
                    break;
                }
            }

            orders.get(search).setStatus("Returned");

            System.out.print("Please enter the estimated pick-up date: ");
            String pickUpDate = input.nextLine();

            System.out.print("Please enter the reasons for the return:\n");
            String reasons = input.nextLine();

            Return newR = new Return(returnID, pickUpDate, reasons);
            Return.add(newR);

            System.out.println("\n============== Return ==============\n" +
                    "Return ID: " + returnID +
                    "\nReturn reason: " + reasons +
                    "\nEstimated Pickup Date: " + pickUpDate +
                    "\nCustomer: " + accounts.get(search).getName() + " ID: " + accounts.get(search).getID() +
                    "\nAddress: " + accounts.get(search).getAddress() +
                    "\nContact: " + accounts.get(search).getPhoneNo() +
                    "\n\n===== Order Details =====\n" + orders.get(search) + "\n"
            );

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Order or Account Not Found");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Order ID");
        }
    }
    public static void defectSearch(){
        try{
            System.out.print("Enter return ID: ");
            int returnID = input.nextInt();
            int search = 0;
            int searchListLength = Return.size();
            for (int i = 0; i < searchListLength + 1; i++) {
                if (Return.get(i).getReturnID()==returnID) {
                    search = i;
                    break;
                }
            }
            System.out.println("============== Return ==============\n"+Return.get(search)+ "\n");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("No returns yet!\n");
        }
    }
}