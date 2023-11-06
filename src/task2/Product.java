package task2;

public class Product {
    private String name;
    private String Category;
    private int weight;

    public Product(String name, String category, int weight) {
        this.name = name;
        Category = category;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight>0){
            this.weight = weight;
        } else{
            this.weight=0;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Category='" + Category + '\'' +
                ", weight=" + weight +
                '}';
    }
}
