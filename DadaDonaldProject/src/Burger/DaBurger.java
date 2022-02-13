package Burger;

public class DaBurger extends Burger{

    public DaBurger(){
        avgPrepareTime=16;
        description="Beef Burger";
    }

    @Override
    public double cost() {
        return 30;
    }

}
