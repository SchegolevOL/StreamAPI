package task4;

public class Project {
    private String name;
    private int year;
    private int price;
private String manufacturer;

    public Project(String name, int year, int price, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.manufacturer = manufacturer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

}
