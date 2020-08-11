package oop.abstraction;

public abstract class ModerateCar {
    public abstract void ModerateHeadLight();
    public abstract void ModerateWindShield();
    public abstract void ModerateTransmission();
    public int moderateDemand=500;
    public String moderateName="Pajero";
    public String moderateEngine;
    public void moderateEngine(){
        System.out.println("Engine condition is not Good");
    }
    public void  moderateDrive(){
        System.out.println("Driving of moderate car is not smooth");
    }

    public int getModerateDemand() {
        return moderateDemand;
    }

    public void setModerateDemand(int moderateDemand) {
        this.moderateDemand = moderateDemand;
    }

    public String getModerateName() {
        return moderateName;
    }

    public void setModerateName(String moderateName) {
        this.moderateName = moderateName;
    }

    public String getModerateEngine() {
        return moderateEngine;
    }

    public void setModerateEngine(String moderateEngine) {
        this.moderateEngine = moderateEngine;
    }

    public boolean isModerateAvailable() {
        return isModerateAvailable;
    }

    public void setModerateAvailable(boolean moderateAvailable) {
        isModerateAvailable = moderateAvailable;
    }

    public double getModeratePrice() {
        return moderatePrice;
    }

    public void setModeratePrice(double moderatePrice) {
        this.moderatePrice = moderatePrice;
    }

    public boolean isModerateAvailable;
    public double moderatePrice=23500.50;

}
