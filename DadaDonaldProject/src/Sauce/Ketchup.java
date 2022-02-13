package Sauce;

public class Ketchup extends Sauce{

    public Ketchup(){
        description="Ketchup";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
