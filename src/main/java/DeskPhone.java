/**
 * Created by makerofapps on 12/18/17.
 */
public class DeskPhone implements ITelephone {
    //Instance Variables | Fields
    private int myNumber;
    private boolean isRinging;

//Constructor
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public void powerOn() {
        System.out.println("This phone does not have a power button");

    }

    public void dial(int phoneNumber) {
        System.out.println("Now dialling " + phoneNumber);

    }

    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
        }
    }

    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("ring ring");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    public boolean isRinging() {
        return isRinging;
    }

}
