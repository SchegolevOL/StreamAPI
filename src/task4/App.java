package task4;

public class App {
    public static void main(String[] args) {
        Project project1 = new Project("Project1", 2020, 20_000, "manufacturer1");
        Project project2 = new Project("Project2", 2021, 200_000, "manufacturer2");
        Project project3 = new Project("Project3", 2021, 10_000, "manufacturer2");
        Project project4 = new Project("Project4", 2022, 30_000, "manufacturer3");
        Project project5 = new Project("Project5", 2022, 25_000, "manufacturer5");
        Project project6 = new Project("Project6", 2021, 100_000, "manufacturer4");
        Project project7 = new Project("Project7", 2020, 150_000, "manufacturer4");
        Project project8 = new Project("Project8", 2022, 10_000, "manufacturer3");
        Project project9 = new Project("Project9", 2023, 15_000, "manufacturer2");
        Project project10 = new Project("Project10", 2023, 400_000, "manufacturer3");
        ListProject listProject = new ListProject();
        listProject.getProjects().add(project1);
        listProject.getProjects().add(project2);
        listProject.getProjects().add(project3);
        listProject.getProjects().add(project4);
        listProject.getProjects().add(project5);
        listProject.getProjects().add(project6);
        listProject.getProjects().add(project7);
        listProject.getProjects().add(project8);
        listProject.getProjects().add(project9);
        listProject.getProjects().add(project10);
        System.out.println("=========================================================================================");
        System.out.println("show all projects");
        listProject.showAllProjects();
        System.out.println("=========================================================================================");
        System.out.println("show all projects of the same manufacturer");
        listProject.showAllProjectsOfSameManufacturer("manufacturer2");
        System.out.println("=========================================================================================");
        System.out.println("show all projects of the current year");
        listProject.showAllProjectsOfCurrentYear(2022);
        System.out.println("=========================================================================================");
        System.out.println("show all projects more expensive than the specified price");
        listProject.showAllProjectsMoreExpensiveThanSpecifiedPrice(30000);
        System.out.println("=========================================================================================");
        System.out.println("show all projects sorted by price in ascending order");
        listProject.showAllProjectsSortedByPriceInAscendingOrder();
        System.out.println("=========================================================================================");
        System.out.println(" show all projects sorted by price in descending order");
        listProject.showAllProjectsSortedByPriceInDescendingOrder();
        System.out.println("=========================================================================================");
        System.out.println("show all projects sorted by year of release in ascending order");
        listProject.showAllProjectsSortedByYearOfReleaseInAscendingOrder();
        System.out.println("=========================================================================================");
        System.out.println("show all projects sorted by year of release in descending order");
        listProject.showAllProjectsSortedByYearOfReleaseInDescendingOrder();
        System.out.println("=========================================================================================");


    }

}
