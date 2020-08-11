package oop.abstraction;

public class AutoUpgradeCar extends SimpleCar {
   public int autoCustomer=60000;
    public String autoName="Nissan";
    public String AutoFactory="japan";
    public double autoPrice=50000.50;

    public int getAutoCustomer() {
        return autoCustomer;
    }

    public void setAutoCustomer(int autoCustomer) {
        this.autoCustomer = autoCustomer;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public String getAutoFactory() {
        return AutoFactory;
    }

    public void setAutoFactory(String autoFactory) {
        AutoFactory = autoFactory;
    }

    public double getAutoPrice() {
        return autoPrice;
    }

    public void setAutoPrice(double autoPrice) {
        this.autoPrice = autoPrice;
    }

    public void autoBattery(){
        System.out.println("The auto battery is not available");
    }
    public void autoGear(){
        System.out.println("Gear of auto car is not smooth");
    }
}
