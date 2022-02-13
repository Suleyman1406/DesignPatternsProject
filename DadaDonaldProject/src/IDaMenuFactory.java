import Beverage.Beverage;
import Burger.Burger;
import Sauce.Sauce;
import Snack.Snack;

public interface IDaMenuFactory {
     Burger createBurger();
     Snack createSnack();
     Beverage createBeverage();
     Sauce createSauce();
}
