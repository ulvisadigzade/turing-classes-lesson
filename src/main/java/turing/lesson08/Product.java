package turing.lesson08;

public class Product {

    public String name;
    public double price;
    public String category;
    public int stock;

    public Product(String name, double price, String category, int stock){
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    double discountPrice(double percent){
        if(percent<0 || percent>100)return -1;
        return price * (100-percent) / 100;
    }

    boolean isInStock(){
        return stock>0;
    }

    @Override
    public String toString(){
        return "Name: %s | Price: %.2f | Category: %s | Stock: %d".formatted(name, price, category, stock);
    }
}
