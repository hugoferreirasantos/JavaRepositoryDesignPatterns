/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oo.abstractfactoryteste;

/**
 *
 * @author hugo
 */
public interface CarFactory 
{
    public Car createEconomyCar();
    public Car createStandardCar();
    public Car createLuxuryCar();
}
