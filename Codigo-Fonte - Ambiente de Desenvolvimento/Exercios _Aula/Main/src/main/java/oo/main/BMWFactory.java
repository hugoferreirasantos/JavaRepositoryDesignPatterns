/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.main;

/**
 *
 * @author hugo
 */
public class BMWFactory implements CarFactory
{
    public String CreateEconomyCar()
    {
        BMW riding = new BMW();
        
        return riding.assemble() + ": Economy Car";
    }
    
    public String CreateStandardCar()
    {
        BMW riding = new BMW();
        
        return riding.assemble() + ": Standard Car ";
    }
    
    public String CreateLuxuryCar()
    {
        BMW riding =  new BMW();
        
        return riding.assemble() + ": Lurury Car ";
    }
    
}
