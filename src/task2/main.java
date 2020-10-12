package task2;

import java.util.ArrayList;

class main {
    public static void main(String[] args) {
        GroceryItem Rice = new GroceryItem("Rice", 40);
        GroceryItem Sugar = new GroceryItem("Sugar", 50);
        GroceryItem Flour = new GroceryItem("Flour", 100);
        GroceryItem Tea = new GroceryItem("Tea", 60);
        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(Rice, "2kg 0g"))
                .add(GroceryCartItem.createNew(Sugar, "2kg 500g"))
                .add(GroceryCartItem.createNew(Flour, "5kg 0g"))
                .add(GroceryCartItem.createNew(Tea, "250g"));
        System.out.println(cart);
    }
}
