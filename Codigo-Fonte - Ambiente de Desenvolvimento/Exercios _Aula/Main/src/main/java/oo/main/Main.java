/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.main;

/**
 *
 * @author hugo
 */
public class Main {

    public static void main(String[] args) {
        
        ToyotaFactory ToyotaCar = new ToyotaFactory();
        FordFactory FordCar = new FordFactory();
        BMWFactory BMWCar = new BMWFactory();
        
        System.out.println("Factory Toyota Car: ");
        System.out.println(ToyotaCar.CreateEconomyCar());
        System.out.println(ToyotaCar.CreateStandardCar());
        System.out.println(ToyotaCar.CreateLuxuryCar());
        
        System.out.println("");
        
        System.out.println("Factory Ford Car: ");
        System.out.println(FordCar.CreateEconomyCar());
        System.out.println(FordCar.CreateStandardCar());
        System.out.println(FordCar.CreateLuxuryCar());
        
        System.out.println("");
        
        System.out.println("Factory BMW Car: ");
        System.out.println(BMWCar.CreateEconomyCar());
        System.out.println(BMWCar.CreateStandardCar());
        System.out.println(BMWCar.CreateLuxuryCar());
        
        
        
        
        
        
        
    }
}
