package Burger;

public class DadaRoyal extends Burger{

    public DadaRoyal(){
        avgPrepareTime=15;
        description="Royal Burger.Burger";
    }

    @Override
    public double cost() {
        return 30;
    }


}
