package oop.abstraction;

public class RegularCar extends AutoUpgradeCar{
    int regularDemand =5400;
    String regularCarName="Honda";
    double regularCarPrice=12800.50;
    public void regularBody(){
        System.out.println("Regular body of the car is satisfactory");
    }
    public void regularWheel(){
        System.out.println("Regular car wheel is not smooth");
    }

}
