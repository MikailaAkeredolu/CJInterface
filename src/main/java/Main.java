/**
 * Created by makerofapps on 12/18/17.
 */
public class Main {
    public static void main(String[] args) {
        ITelephone myOffice = new DeskPhone(302000111);
        myOffice.powerOn();
        myOffice.callPhone(302000111);
        myOffice.answer();











        System.out.println("=======================================================");

        ITelephone myIPhone = new MobilePhone(302111231);
        myIPhone.powerOn();
        myIPhone.callPhone(302111231);
        myIPhone.answer();



    }
}
