import java.util.Scanner;

public class Operator {
    private static Scanner input = new Scanner(System.in);
    private static String name;
    public Operator(){ }
    public void loginUser(){
        System.out.print("\n============== Login ==============\n" +
                "Please provide your credentials\n" +
                "Username: "
        );
        String user = input.nextLine();
        name = user;
        System.out.print("\nWelcome " + user + "\n");
    }
    public String getName(){
        return name;
    }
}

