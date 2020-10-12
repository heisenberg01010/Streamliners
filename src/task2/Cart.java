package task2;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

public Cart() {
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }
public Cart add(GroceryCartItem item){
        cartItems.add(item);
        totalAmount += item.price;
        return this;
    }

    @Override
    public String toString() {
    StringBuilder builder = new StringBuilder();
        return "Cart{" + "\n" + "groceryCartItems= [" + builder.toString() + " ]" +
                ",\n" + "totalAmount=" + totalAmount + "\n" +
                '}';
    }
}
