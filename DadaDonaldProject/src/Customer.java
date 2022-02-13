import Food.Food;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Food> cartList;
    private double cartCost;
    private CustomerScreenDisplay screenDisplay;
    private int avgPrepareTime;
    public Customer(String name){
        cartCost=0;
        this.name=name;
        cartList =new ArrayList<>();
        avgPrepareTime=0;
        screenDisplay=new CustomerScreenDisplay(DadaDonald.orderData,name);
    }
    public double getCartCost(){
        for (Food food : cartList) {
            cartCost+=food.cost();
        }
        return cartCost;
    }
    public int getCartAvgPrepareTime(){
        for (Food food : cartList) {
            avgPrepareTime= Math.max(avgPrepareTime, food.avgPrepareTime);
        }
        return avgPrepareTime;
    }

    public void addToCart(Food food){
        cartList.add(food);
    }
    public void removeFromCart(Food food){
        cartList.remove(food);
    }
    public void clearCart(){
        cartList.clear();
    }

    public String getName() {
        return name;
    }
}
