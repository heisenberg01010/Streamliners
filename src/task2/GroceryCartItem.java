package task2;

public class GroceryCartItem extends GroceryItem {
    float price;
    float quantity;

    public GroceryCartItem(String name, int pricePerKg) {
        super(name, pricePerKg);
    }

    @Override
    public String toString() {
        return String.format(name + "(₹" + pricePerKg + "x" + quantity + "kg) = ₹" + price);
    }

    static float extractQuantity(String quantityStr) {
        String str[] = quantityStr.split(" ");
        quantityStr.replace("kg", "");
        quantityStr.replace("g", "");
        for (int i = 0; str.size() > i; i++)
            str[i] = quantityStr;

        int kgs = Integer.parseInt(str[0]);
        int gs = Integer.parseInt(str[1]);

        float parsedQuantity = kgs + ((float) (gs) / 1000);
        return parsedQuantity;
    }

    static GroceryCartItem createNew(GroceryItem item, String quantityStr) {
        GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
        cartItem.quantity = GroceryCartItem.extractQuantity(quantityStr);
        cartItem.price = item.pricePerKg * cartItem.quantity;
        return cartItem;
    }
}
