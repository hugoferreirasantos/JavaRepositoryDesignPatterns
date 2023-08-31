/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.abstractfactoryteste;

/**
 *
 * @author hugo
 */
public class Car 
{
    public Car createEconomyCar()
    {
        return new Car();
    }
    public Car createStandardCar()
    {
        return new Car();
    }
    public Car createLuxuryCar()
    {
        return new Car();
    }
}
