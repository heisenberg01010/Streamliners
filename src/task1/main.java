package task1;

public class main {
    public static void main(String[] args) {

        Product car = new Product("car", 30);
        Product car1 = new Product("car", 30);
        Product bike = new Product("bike", 50);

        System.out.println(car);
        System.out.println(car1);
        System.out.println(bike);

        System.out.println(car.equals(car1));

        SpecialProduct product = SpecialProduct.applyOffOnProduct(bike, 20);
        System.out.println(product);
    }
}
