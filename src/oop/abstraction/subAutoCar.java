package oop.abstraction;

public  abstract class subAutoCar  {

    public abstract void operate();
    public  abstract void radiator();
    public  abstract  void track();
    //**************************************************************
   public int subAuto;
    public double subAutoPrice=56500.5;
   public String subAutoName;
   public String  subAutoType="Panther";
    public boolean isAffordable;
    //*******************************************************************
    public void setSubAutoType(){
        System.out.println("Set up system of sub auto");
    }
    public void subAutoEngine(){
        System.out.println(" Engine cooling and warming system of sub Auto");
    }
    public  void gearSystem(){
        System.out.println("Gear system of sub auto");
    }
}
