package turing.lesson08;

public class StoreApp {
    public static void main(String[] args) {

        Product p1 = new Product("Book",23,"Education",100);
        Product p2 = new Product("Laptop",500,"Tech",53);
        Product p3 = new Product("Fish",10,"Food",500);
        Product p4 = new Product("Bread",5,"Food",400);

        Product[] products = {p1, p2, p3, p4};

        Store store = new Store("Bravo", "Koroglu", products);

        store.printAllProducts();
        System.out.println("-----------------");
        store.printExpensiveProducts(50);
        System.out.println("-----------------");
        store.applyDiscountToAll(10);
    }
}
