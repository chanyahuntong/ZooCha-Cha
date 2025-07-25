package Lib;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Squawk!";
    }

     @Override
     public String swimble() {
       return "The penguin dives gracefully in the water.";
     }
}
