package task2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Shop {
    private ArrayList<Product> products;
    public Shop() {
        this.products=new ArrayList<>();
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void showAllProducts(){
        this.getProducts().stream().forEach(p-> System.out.println(p));
    }
    public void showAllProductsNameLess5Char(){
        this.getProducts().stream().filter(p->p.getName().length()<5).forEach(p-> System.out.println(p));
    }
    public long manyTimesProduct(String name){
        return this.products.stream().filter(p->p.getName()==name).count();
    }
    public void allProductsNameStartGivenLetter(String letter){
        this.products.stream().filter(p->p.getName().startsWith(letter)).forEach(p-> System.out.println(p));
    }
    public void showAllProductsFromCategory(String category){
        this.products.stream().filter(p->p.getCategory()==category).forEach(p-> System.out.println(p));
    }

}
