package Lib;

public class Eagle extends Bird implements Flyable{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Screech!";
    }

    @Override
    public String flyable() {
        return "The eagle soars through the sky.";
    }
    
}
