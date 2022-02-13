package Burger;

public class DaChicken extends Burger{

    public DaChicken(){
        avgPrepareTime=13;
        description="Chicken Burger.Burger";
    }

    @Override
    public double cost() {
        return 20;
    }


}
