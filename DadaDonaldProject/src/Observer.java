import java.util.ArrayList;

public interface Observer {
    void update(ArrayList<Order> preparingOrders, ArrayList<Order> preparedOrders);
}
