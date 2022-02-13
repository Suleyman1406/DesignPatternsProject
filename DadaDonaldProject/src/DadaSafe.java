import java.util.HashMap;

public class DadaSafe {
    private HashMap<Long,Order> orders;
    private double earn;
    private static DadaSafe instance = null;

    private DadaSafe(){
        orders=new HashMap<>();
        earn=0;
    }
    public  void addOrder(Order order){
        orders.put(System.currentTimeMillis(),order);
        earn+=order.getCost();
    }

    public HashMap<Long, Order> getOrders() {
        return orders;
    }

    public double getEarn() {
        return earn;
    }

    public static DadaSafe getInstance(){
        if (instance ==null)
            instance =new DadaSafe();

        return instance;

    }
}
