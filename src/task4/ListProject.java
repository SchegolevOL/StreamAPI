package task4;

import java.util.ArrayList;
import java.util.Comparator;

public class ListProject {
    private ArrayList<Project> projects;

    public ListProject() {
        this.projects = new ArrayList<>();
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void showAllProjects() {
        this.projects.stream().forEach(p -> System.out.println(p));
    }

    public void showAllProjectsOfSameManufacturer(String manufacturer) {
        this.projects.stream().filter(p -> p.getManufacturer() == manufacturer).forEach(p -> System.out.println(p));
    }

    public void showAllProjectsOfCurrentYear(int year) {
        this.projects.stream().filter(p -> p.getYear() == year).forEach(p -> System.out.println(p));
    }

    public void showAllProjectsMoreExpensiveThanSpecifiedPrice(int price) {
        this.projects.stream().filter(p -> p.getPrice() >= price).forEach(p -> System.out.println(p));
    }

    public void showAllProjectsSortedByPriceInAscendingOrder() {
        this.projects.stream().sorted((p1, p2) -> p1.getPrice() == p2.getPrice() ? 0 : p1.getPrice() > p2.getPrice() ? 1 : -1).forEach(p -> System.out.println(p));
    }

    public void showAllProjectsSortedByPriceInDescendingOrder() {
        this.projects.stream().sorted((p1, p2) -> p1.getPrice() == p2.getPrice() ? 0 : p1.getPrice() < p2.getPrice() ? 1 : -1).forEach(p -> System.out.println(p));
    }

    public void showAllProjectsSortedByYearOfReleaseInAscendingOrder() {
        this.projects.stream().sorted((p1, p2) -> p1.getYear() == p2.getYear() ? 0 : p1.getYear() > p2.getYear() ? 1 : -1).forEach(p -> System.out.println(p));
    }

    public void showAllProjectsSortedByYearOfReleaseInDescendingOrder() {
        this.projects.stream().sorted((p1, p2) -> p1.getYear() == p2.getYear() ? 0 : p1.getYear() < p2.getYear() ? 1 : -1).forEach(p -> System.out.println(p));
    }


}

