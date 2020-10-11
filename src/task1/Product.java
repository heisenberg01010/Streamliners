package task1;

public class Product{
    String name;
    int price;

// default constructor
    public Product() {
    }

// parameterized constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

// overriding to String method
    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d");
    }

// Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

