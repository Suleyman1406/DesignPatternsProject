import Beverage.Beverage;
import Burger.Burger;
import Food.Food;
import Sauce.Sauce;
import Snack.Snack;

public abstract class DaMenu extends Food {
    String name;
    Burger burger;
    Beverage beverage;
    Snack snack;
    Sauce sauce;
    double cost;
    int avgPrepareTime;

    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
