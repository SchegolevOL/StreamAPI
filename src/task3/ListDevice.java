package task3;

import java.util.ArrayList;

public class ListDevice {
    ArrayList<Device>devices;

    public ListDevice() {
        this.devices = new ArrayList<>();
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }
    public void showAllDevices(){
        this.getDevices().stream().forEach(d-> System.out.println(d.toString()));
    }
    public void showAllDevicesChoiceOfGivenColor(String color){
        this.getDevices().stream().filter(p->p.getColor()==color).forEach(d-> System.out.println(d.toString()));
    }
public void showAllDevicesChoiceOfSpecifiedYear(int year){
        this.getDevices().stream().filter(p->p.getYear()==year).forEach(d-> System.out.println(d.toString()));
    }

public void showAllDevicesChoiceMoreExpensiveThanSpecifiedPrice(int price){
        this.getDevices().stream().filter(p->p.getPrice()>=price).forEach(d-> System.out.println(d.toString()));
    }
public void showAllDevicesChoiceOfGivenType(String type){
        this.getDevices().stream().filter(p->p.getType()==type).forEach(d-> System.out.println(d.toString()));
    }
    public void showAllDevicesChoiceWhoseYearOfManufactureIsSpecifiedRange(int yearBegin, int yearEnd){
        this.getDevices().stream().filter(p->p.getYear()>=yearBegin&&p.getYear()<=yearEnd).forEach(d-> System.out.println(d.toString()));
    }



}
