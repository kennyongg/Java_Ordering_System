package Enquire;

    public class Return {
        int returnID;
        String pickUp;
        String reasons;

        /*Item's name, price, quantity*/

        public Return(int ID, String date, String r){
            returnID = ID;
            pickUp = date;
            reasons = r;
        }

        public int getReturnID(){
            return returnID;
        }

        public String toString(){
            return ("\nReturn ID:"+returnID+
            "\nPick Up Date:"+pickUp+
            "\nReasons:"+reasons);
        }

    }
