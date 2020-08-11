package oop.abstraction;

import java.util.Scanner;

public class TestCar {

    public static void main(String[] args) {
        RegularCar call=new RegularCar();
        call.setSimpleName("Tesla");
        Scanner type=new Scanner(System.in);
        System.out.println("Name of the simple car is :");
       String name=type.nextLine();
        System.out.println("Name of the simple car is :" +name);
        System.out.println("Price of the tesla car is :");
        double simplePrice=type.nextDouble();
        System.out.println("Price of the tesla car is :"+simplePrice);
        call.setAutoPrice(5500.5);
        System.out.println("Price of the auto is :"+call.getAutoPrice());
        double price=5000+call.getAutoPrice();
        System.out.println("Additive price of the auto is :"+price);
        int simpleDemand=type.nextInt();
        System.out.println("Price of the brand new Tesla is :");
        System.out.println("Price of the brand new Tesla is :"+simpleDemand);
        call.setModerateDemand(9000);
        System.out.println("Demand of the moderate car is :"+call.getModerateDemand());
        int totalDemand=19000+call.getModerateDemand();
        int monthlyDemand=30*call.getModerateDemand();
        System.out.println("Total demand is :"+totalDemand);
        System.out.println("Monthly demand is :"+monthlyDemand);
        int additiveValue=call.getModerateDemand()+2500;
        System.out.println("Additive  value is :"+additiveValue);
        int subtructiveValue=call.getModerateDemand()-6790;
        System.out.println("Subtructive value is :"+subtructiveValue);
        int divisionValue=subtructiveValue/3;
        System.out.println("The division value is :"+divisionValue);
        ModerateCar invoke=new RegularCar();
        invoke.setModerateEngine("Super");
        Scanner style=new Scanner(System.in);
        System.out.println("The Lexus car engine is very good and the quality is :");
       String quality= style.nextLine();
        System.out.println("The Lexus car engine is very good and the quality is :"+quality);
        call.headlight();
        call.gear();

    }



}
