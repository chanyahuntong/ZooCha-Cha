package Lib;

public class Dolphin extends Mammal implements Swimable {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Clicking sounds!";
    }    

    @Override
    public String swimble() {
        return "The dolphin playfully swims in the sea.";
    }
    
}
