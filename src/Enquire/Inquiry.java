package Enquire;

public class Inquiry {
    int inquiryID;
    int cid;
    String inquiry;
    int pid;
    String inquiryDate;

    public Inquiry(int iID, String iDate, int id, String desc){
        inquiryID = iID;
        inquiryDate = iDate;
        cid = id;
        inquiry = desc;
    }

    public int getCid(){
        return cid;
    }

    public String toString(){
        return ("\nInquiry ID: " + inquiryID +
                "\nInquired date: " + inquiryDate +
                "\nCustomer ID: " + cid +
                "\nOrder.Products ID: " + pid +
                "\nInquiry: " + inquiry +
                "\n");
    }
}
