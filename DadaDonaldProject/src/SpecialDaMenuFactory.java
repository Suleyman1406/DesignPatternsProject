import Beverage.Beverage;
import Burger.Burger;
import Sauce.Sauce;
import Snack.Snack;
import Burger.SpecialDada;
import Snack.HomeMadeFries;
import Beverage.DaCola;
import Sauce.DaSauce;

public class SpecialDaMenuFactory implements IDaMenuFactory {

    @Override
    public Burger createBurger() {
        return new SpecialDada();
    }

    @Override
    public Snack createSnack() {
        return new HomeMadeFries();
    }

    @Override
    public Beverage createBeverage() {
        return new DaCola();
    }

    @Override
    public Sauce createSauce() {
        return new DaSauce();
    }
}
