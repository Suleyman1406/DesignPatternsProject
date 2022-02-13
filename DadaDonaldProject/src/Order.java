public class Order {
    private double cost;
    private static int orderCount=0;
    private  int id;
    private String customerName;
    private int avgPrepareTime;
    public Order(Customer customer) {
        orderCount++;
        id=orderCount;
        this.cost = customer.getCartCost();
        this.customerName=customer.getName();
        this.avgPrepareTime=customer.getCartAvgPrepareTime();
    }

    public double getCost() {
        return cost;
    }



    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAvgPrepareTime() {
        return avgPrepareTime;
    }
}
