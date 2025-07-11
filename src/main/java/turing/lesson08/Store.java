package turing.lesson08;

public class Store {

    public String name;
    public String address;
    public Product[] products;

    public Store(String name, String address, Product[] products){
        this.name = name;
        this.address = address;
        this.products = copy(products);
    }

    public void printAllProducts(){
        for(Product product: products){
            System.out.println(product);
        }
    }

    public void printExpensiveProducts(double limit){
        for(Product product: products){
            if(product.price>limit)
                System.out.println(product);
        }
    }

    public void applyDiscountToAll(double percent){
        for(int i = 0; i < products.length; i++){
            double discountedPrice = products[i].discountPrice(percent);
            if(discountedPrice!=-1)products[i].price = discountedPrice;
        }
        printAllProducts();
    }

    private Product[] copy(Product[] products){
        Product[] newProducts = new Product[products.length];
        for(int i = 0; i < products.length; i++){
            newProducts[i] = new Product(products[i].name, products[i].price, products[i].category, products[i].stock);
        }
        return newProducts;
    }
}
