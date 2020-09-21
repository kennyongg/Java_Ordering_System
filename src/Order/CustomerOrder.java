package Order;

import java.text.DecimalFormat;

public class CustomerOrder{
    private int orderID, itemID, itemQ, userID;
    private String remark, status, orderDate, deliDate, operator;
    private double pricePerItem;
    private double totalPrice;
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public CustomerOrder(int ID, String s, String oDate, String dDate, int user, int item, int quant, String r, String o, double total){
        orderID = ID;
        orderDate = oDate;
        itemID = item;
        itemQ = quant;
        remark = r;
        userID = user;
        status = s;
        deliDate = dDate;
        operator = o;
        totalPrice = total;
    }

    public int getOrderID(){
        return orderID;
    }

    public int getItemQ(){
        return itemQ;
    }

    public void setItemQ(int q){
        itemQ = q;
    }
    public int getUser(){
        return userID;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String s){
        status = s;
    }
    public void setDeliDate(String d){
        deliDate = d;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public void setTotalPrice(double tp){totalPrice = tp;}
    public double getTotalPrice(){return totalPrice;}


    public String toString() {
        return ("\nOrder ID: " + orderID +
                "\nOrder status: " + status +
                "\nOrder date: " + orderDate +
                "\nDelivery date: " + deliDate +
                "\nCustomer ID: " + userID +
                "\nItem ID: " + itemID +
                "\nQuantity: " + itemQ +
                "\nRemarks: " + remark +
                "\nTotal Price: " + df2.format(getTotalPrice()) +
                "\nOperator: " + operator +
                "\n"
        );
    }
}
