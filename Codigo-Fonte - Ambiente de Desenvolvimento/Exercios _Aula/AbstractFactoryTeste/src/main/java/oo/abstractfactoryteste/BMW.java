/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.abstractfactoryteste;

/**
 *
 * @author hugo
 */
public class BMW implements InterfaceCar
{
    public String assemble()
    {
        String assemble = "assembling BMW Car";
        System.out.println(assemble);
        
        return assemble;
    }
}
