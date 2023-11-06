package task3;

public class App {
    public static void main(String[] args) {
        Device device1 = new Device("Nokia 3110", 2000, 1000, "red", "Phone");
        Device device2 = new Device("Apple iPhone 14 Pro Max", 2023, 1500, "silver", "Phone");
        Device device3 = new Device("Samsung Galaxy S22 Ultra", 2022, 2000, "grey", "Phone");
        Device device4 = new Device("Huawei Mate 50 Pro", 2021, 3000, "blue", "Phone");
        Device device5 = new Device("Xiaomi 12S Ultra", 2023, 1600, "blue", "Phone");
        Device device6 = new Device("LG OLED48C1RLA", 2023, 1700, "blue", "TV");
        Device device7 = new Device("Hisense 32A4BG", 2023, 1200, "grey", "TV");
        Device device8 = new Device("TCL 43P728 2021 LED", 2023, 1100, "silver", "TV");
        Device device9 = new Device("Samsung UE-24N4500", 2023, 1000, "silver", "TV");
        Device device10 = new Device("Philips 43PUS7956/60", 2023, 900, "red", "TV");
        ListDevice listDevice= new ListDevice();
        listDevice.getDevices().add(device1);
        listDevice.getDevices().add(device2);
        listDevice.getDevices().add(device3);
        listDevice.getDevices().add(device4);
        listDevice.getDevices().add(device5);
        listDevice.getDevices().add(device6);
        listDevice.getDevices().add(device7);
        listDevice.getDevices().add(device8);
        listDevice.getDevices().add(device9);
        listDevice.getDevices().add(device10);

        System.out.println("====================================================================");
        System.out.println("show all devices");
        listDevice.showAllDevices();
        System.out.println("====================================================================");
        System.out.println("show all devices of a given color- red");
        listDevice.showAllDevicesChoiceOfGivenColor("red");
        System.out.println("====================================================================");
        System.out.println("show all devices of the specified year of manufacture- 2023");
        listDevice.showAllDevicesChoiceOfSpecifiedYear(2023);
        System.out.println("====================================================================");
        System.out.println("show all devices more expensive than the specified price- 2000");
        listDevice.showAllDevicesChoiceMoreExpensiveThanSpecifiedPrice(2000);
        System.out.println("====================================================================");
        System.out.println("show all devices of a given type- TV");
        listDevice.showAllDevicesChoiceOfGivenType("TV");
        System.out.println("====================================================================");
        System.out.println("show all devices whose year of manufacture is in the specified range 2022 2023");
        listDevice.showAllDevicesChoiceWhoseYearOfManufactureIsSpecifiedRange(2022,2023);
        System.out.println("====================================================================");

    }
}
