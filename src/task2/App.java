package task2;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Product1", "Category1", 10);
        Product product2 = new Product("Product2", "Category2", 20);
        Product product3 = new Product("Product3", "Category1", 30);
        Product product4 = new Product("Product4", "Category2", 40);
        Product product5 = new Product("Product5", "Category1", 50);
        Product product6 = new Product("Product6", "Category3", 60);
        Product product7 = new Product("Product7", "Category3", 70);
        Product product8 = new Product("Egg", "Category", 70);
        Product product9 = new Product("Ice cream", "Milk", 70);
        Product product10 = new Product("Ice cream2", "Milk", 70);
        Shop shop = new Shop();
        shop.getProducts().add(product1);
        shop.getProducts().add(product2);
        shop.getProducts().add(product3);
        shop.getProducts().add(product4);
        shop.getProducts().add(product5);
        shop.getProducts().add(product6);
        shop.getProducts().add(product7);
        shop.getProducts().add(product8);
        shop.getProducts().add(product9);
        shop.getProducts().add(product10);

        shop.showAllProducts();
        System.out.println("========================================================================================");
        shop.showAllProductsNameLess5Char();
        System.out.println("========================================================================================");
        System.out.println(shop.manyTimesProduct("Age"));
        System.out.println("========================================================================================");
        shop.allProductsNameStartGivenLetter("A");
        System.out.println("========================================================================================");
        shop.showAllProductsFromCategory("Milk");
        System.out.println("========================================================================================");
    }
}
