/**
 * Created by makerofapps on 12/18/17.
 */
public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private  boolean isOn = false;

    public MobilePhone(int myNumber) {

        this.myNumber = myNumber;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered on");

    }

    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now dialling " + phoneNumber);
        }else {
            System.out.println("Phone is switched off");
        }


    }

    public void answer() {
        if(isRinging){
            System.out.println("Answering the Mobile phone");
        }
    }

    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ringtone playing");
        }else {
            isRinging = false;
            System.out.println("Mobile phone not on or incorrect number");
        }
        return isRinging;
    }

    public boolean isRinging() {
        return isRinging;
    }
}
