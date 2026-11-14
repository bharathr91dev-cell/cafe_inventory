public class Product {

    static int totalProducts = 0;

    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        totalProducts++;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    Product(Product other) {
        // TODO: Complete this later
        this.name = other.name;
        this.price = other.price;
        this.quantity = other.quantity;

        totalProducts++;
    }

    double stockValue() {
        // TODO: Complete this later
//        return 0;
        return price * quantity;
    }

    void display() {
        // TODO: Complete this later
        System.out.println(name + " | Rs " + price + " | qty " + quantity);
    }
}