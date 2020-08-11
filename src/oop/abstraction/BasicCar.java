package oop.abstraction;

public interface BasicCar extends AutoFlyingCar,SuperCar {
    public void carBody();
    public void engine();
    public void battery();
    public int basicDemand=456;
    public String basicName="Volkswagen";
    public  boolean isBasicGood=false;
}
