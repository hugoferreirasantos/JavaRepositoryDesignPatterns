/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.abstractfactoryteste;

/**
 *
 * @author hugo
 */
public class FordFactory extends Car implements CarFactory
{
     public Car createEconomyCar()
    {
        Car createEconomyCar = new Car();
        
        System.out.println("Create Economy Car Ford ");
        
        return createEconomyCar;
    }
    public Car createStandardCar()
    {
        Car createStanderCar = new Car();
        
        System.out.println("Create Standard Car Ford");
        
        return createStanderCar;
    }
    
    public Car createLuxuryCar()
    {
       Car createLuxuryCar = new Car();
       
       System.out.println("Create Luxury Car Ford");
       
       return createLuxuryCar;
    }
}
