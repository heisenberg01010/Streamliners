package task1;

public class SpecialProduct extends Product {
    static int regularPrice;
    int percentageOff;

//Parameterized constructor using super
    public SpecialProduct(String name, int price) {
        super(name, price);
}

//overriding to string method
    @Override
    public String toString() {
        return String.format("Regular Price : %d, Percentage Off : %d", regularPrice, percentageOff);
    }

    static SpecialProduct applyOffOnProduct(Product product, int percentageOff) {
        int discountedPrice = product.price - (percentageOff * product.price) / 100;
        SpecialProduct specialProduct = new SpecialProduct(product.name, discountedPrice); // called the constructor
        regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;
        return specialProduct;
    }
}
