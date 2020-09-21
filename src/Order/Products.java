package Order;
public class Products{

    int productID, quantity;
    String description, productName;
    double pricePerItem;
    static double totalPrice;

    public Products(){}
    public Products(int ID, String name, String desc, double pPItem, int quant) {
        productID = ID;
        quantity = quant;
        description = desc;
        productName = name;
        pricePerItem = pPItem;
    }
    public int getProductID(){
        return productID;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quant){ quantity = quant;}
    public String getDescription(){
        return description;
    }

    public String getProductName(){
        return productName;
    }
    public static void setTotalPrice(int q, double p){
        totalPrice = q * p;
    }

    public static double getTotalPrice(){
        return totalPrice;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }

    public String toString(){
        return ("\n---------------------------------\n" +
                "\tProduct ID: " + getProductID() +
                "\n\tProduct name: " + getProductName() +
                "\n\tDescription: " + getDescription() +
                "\n\tPrice: " + pricePerItem +
                "\n\tQuantity: " + getQuantity()) +
                "\n---------------------------------\n";
    }

}