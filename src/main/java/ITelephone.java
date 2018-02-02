/**
 * Created by makerofapps on 12/18/17.
 */
/*
An interface is a contract
The classes that IMPLEMENTS the interface have to implement the methods in the interface
//All methods must be implemented

We will use an interface for phone because a mobile phone can implement phoning features despite it doing other things
While a desk phone can only do phone things so its best we implement the phone interface / feature

A class can only inherit/extend from one superclass but with classes you can implement multiple interfaces

Another way to distinguish between them is like an animal class

Not al Animals can walk so we could define a walk and fly interface
Then a dog would implement walk and a bird will implement both walk and fly

 */
public interface ITelephone {

    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
