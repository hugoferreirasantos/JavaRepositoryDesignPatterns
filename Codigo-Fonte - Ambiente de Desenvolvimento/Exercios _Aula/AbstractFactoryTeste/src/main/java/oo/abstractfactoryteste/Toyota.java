/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.abstractfactoryteste;

/**
 *
 * @author hugo
 */
public class Toyota implements InterfaceCar
{
    public String assemble()
    {
        String assemble = "assembling Toyota Car";
        System.out.println(assemble);
        
        return assemble;
    }
}
