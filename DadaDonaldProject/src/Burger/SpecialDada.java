package Burger;

public class SpecialDada extends Burger{

    public SpecialDada(){
        avgPrepareTime=22;
        description="This is a special burger of DadaDonald";
    }

    @Override
    public double cost() {
        return 35;
    }


}
