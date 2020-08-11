package oop.abstraction;

import java.sql.SQLOutput;

public class SimpleCar extends ModerateCar implements BasicCar {

    public int simpleDemand=4000;
    public String simpleName="Civic";
    public double simplePrice=15000.50;
    public boolean isSimpleGood=false;
    public void simpleBody(){
        System.out.println("Simple car body is not so good");
    }

    public int getSimpleDemand() {
        return simpleDemand;
    }

    public void setSimpleDemand(int simpleDemand) {
        this.simpleDemand = simpleDemand;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        simpleName = simpleName;
    }

    public double getSimplePrice() {
        return simplePrice;
    }

    public void setSimplePrice(double simplePrice) {
        this.simplePrice = simplePrice;
    }

    public void simpleEngine(){
        System.out.println("Simple engine is excellent");
    }

    public void carBody() {
        System.out.println("Body of the car is good");
    }

    public void body() {
        System.out.println("Body of the car not strong ");
    }

    public void engine() {
        System.out.println("Engine is the heart of the car ");
    }

    public void brake() {
        System.out.println("Brake is controlling system of the car ");
    }

    public void gear() {
        System.out.println("Gear is so far is controlling system");
    }

    public void mirror() {
        System.out.println("mirror of the car is very important ");
    }

    public void battery() {
        System.out.println("Battery is the power to start ");
    }

    public void ModerateHeadLight() {
        System.out.println("the headlight is not working properly");
    }

    public void ModerateWindShield() {
        System.out.println("Windshield is located in the front ");
    }

    public void ModerateTransmission() {
        System.out.println("Transmission  of the car is not satisfactory");
    }

    public void headlight() {
        System.out.println("Headlight is mirror of the night path");
    }

    public void wheel() {
        System.out.println("Four wheel of the car is needed ");
    }

    public void seat() {
        System.out.println("Seat is mainly located inside the car ");
    }

    public void antique() {
        System.out.println("Some of the car is very much antique ");
    }

    public void manualGear() {
        System.out.println("Manual gear system is very complex");
    }

    public void manualPushCar() {
        System.out.println("Push car in the current situation is impossible");
    }

    public void operate() {
        System.out.println("How the car is operate machnism of the car ");
    }

    public void radiator() {
        System.out.println("Radiator is the emergency parts of the car");
    }

    public void track() {
        System.out.println("Navigation is system to show the path");
    }
}
