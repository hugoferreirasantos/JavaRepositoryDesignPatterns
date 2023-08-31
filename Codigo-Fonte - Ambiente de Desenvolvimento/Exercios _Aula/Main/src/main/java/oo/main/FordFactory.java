/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.main;

/**
 *
 * @author hugo
 */
public class FordFactory implements CarFactory 
{
    public String CreateEconomyCar()
    {
        Ford riding = new Ford();
        
        return riding.assemble() +  ": Category Economy";
    }
    
    public String CreateStandardCar()
    {
        Ford riding = new Ford();
        
        return riding.assemble() +  ": Category Standard ";
    }
    
    public String CreateLuxuryCar()
    {
        Ford riding = new Ford();
        
        return riding.assemble() + ": Category Luxury ";
    }
}
