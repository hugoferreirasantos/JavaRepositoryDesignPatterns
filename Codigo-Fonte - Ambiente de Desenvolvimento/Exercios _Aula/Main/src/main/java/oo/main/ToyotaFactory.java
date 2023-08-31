/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.main;

/**
 *
 * @author hugo
 */
public class ToyotaFactory implements CarFactory
{
    public String CreateEconomyCar()
    {
        Toyota riding = new Toyota();
        
        return riding.assemble() + ": Category Economy";
    }
    
    public String CreateStandardCar()
    {
        Toyota riding = new Toyota();
        
        return riding.assemble() + ": Category Standard";
    }
    
    public String CreateLuxuryCar()
    {
        Toyota riding = new Toyota();
        
        return riding.assemble() + ": Category Luxury";
    }
    
}
