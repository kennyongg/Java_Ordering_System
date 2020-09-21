package Account;
import java.util.*;
public class CustomerAccount {

    String name;
    String phoneNo;
    String email;
    String address;
    String dateOfBirth;
    char gender;
    int customerID;

    Scanner input = new Scanner(System.in);

    public CustomerAccount(int id,String n, String pNo, String e, String a, String dob, char g){
        customerID = id;
        name = n;
        phoneNo = pNo;
        email = e;
        address = a;
        dateOfBirth = dob;
        if (g=='M' || g=='F') {
            gender = g;
        } else if(g=='m' || g=='f') {
            gender = g;
        } else {
            System.out.print("Please only enter M or F\nEnter customer's gender: ");
            gender = input.next().charAt(0);
        }
    }

    public int getID(){
        return customerID;
    }
    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNo(String pNo){
        phoneNo = pNo;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public void setEmail(String e){
        email = e;
    }

    public void setAddress(String a){
        address = a;
    }

    public String getAddress(){
        return address;
    }

    public void setDateOfBirth(String dob){
        dateOfBirth = dob;
    }
    public void setGender(char g){
        if (g=='M' || g=='F') {
            gender = g;
        } else {
            System.out.println("Please only enter M or F");
        }
    }
    public String toString(){
        return ("\nCustomer ID: " + customerID +
                "\nName: " + name +
                "\nPhone number: " + phoneNo +
                "\nEmail: " + email +
                "\nAddress: " + address +
                "\nDate of birth: " + dateOfBirth +
                "\nGender: " + gender + "\n");
    }
}
