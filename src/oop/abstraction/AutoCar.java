package oop.abstraction;

public abstract  class AutoCar extends subAutoCar {
    // Method declare only
    public  abstract void headlight();
    public  abstract  void wheel();
    public  abstract void seat();

    // method declare and initialize:
    public void carDisplay(){
        System.out.println("Car Display center");
    }
    public void carShowroom(){
        System.out.println("place of the show room");
    }
    int number;
    int numberCount=21;
    String carName="Civic";
    String buyerName;
    double regularPrice=23500.5;



}
