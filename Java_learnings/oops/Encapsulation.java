package oops;


/*
   * Encapsulation:
        The process of wrapping data members(variables) and data functions(methods) inside a single entity(class).
        - Java by default supports encapsulation, but best example is Java Bean Class.
         Rules to develop java bean class:
            * public non-abstract class.
            * private data members
            * public getter and setter method.
            * public non-parameterized constructor.
            * class should implement serializable interface.
               (The process of converting object to byte stream is called serialization.)


 */

public class Encapsulation {
    public static void main(String[] args) {
        Data user1Data = new Data(321, "cat");
        user1Data.viewPin("kitty");
//        user1Data.changePin(421);
    }
}

class Data {
    private int pin;
    private String hintString;
    Data(int pin, String hintString) {
        this.pin = pin;
        this.hintString = hintString;
    }

    public void changePin(int newPin) {
        if(this.pin == newPin) {
            System.out.println("Cannot be same as old pin");
        }else {
            this.pin = newPin;
            System.out.println("Pin Changed");
        }
    }

    public void viewPin(String hintString) {
        if(hintString.equals(this.hintString)) {
            System.out.println(this.pin);
        }else{
            System.out.println("Wrong hint...");
        }
    }
}
