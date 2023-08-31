/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.abstractfactoryteste;

/**
 *
 * @author hugo
 */


public class AbstractFactoryTeste {

    public static void main(String[] args) {
        
        Toyota toyotaModel = new Toyota();
        ToyotaFactory toyotaFactory = new ToyotaFactory();
        
        Ford fordModel = new Ford();
        FordFactory fordFactory = new FordFactory();
        
        BMW BMWModel = new BMW();
        BMWFactory BMWFactory = new BMWFactory();
        
        String typeModel = "Economy Toyota";
        
        switch(typeModel){
            
            case "Economy Toyota":
                System.out.println(toyotaModel.assemble() + " : " + toyotaFactory.createEconomyCar());
                break;
            case "Standard Toyota":
                System.out.println(toyotaModel.assemble() + " : " + toyotaFactory.createStandardCar());
                break;
            case "Luxury Toyota":
                System.out.println(toyotaModel.assemble() + " : " + toyotaFactory.createLuxuryCar());
                break;
            case "Economy Ford":
                System.out.println(fordModel.assemble() + " : " + fordFactory.createEconomyCar());
                break;
            case "Standard Ford":
                System.out.println(fordModel.assemble() + " : " + fordFactory.createStandardCar());
                break;
            case "Luxury Ford":
                System.out.println(fordModel.assemble() + " : " + fordFactory.createLuxuryCar());
                break;
            case "Economy BMW":
                System.out.println(BMWModel.assemble() + " : " + BMWFactory.createEconomyCar());
                break;
            case "Standard BMW":
                System.out.println(BMWModel.assemble() + " : " + BMWFactory.createStandardCar());
                break;
            case "Luxury BMW":
                System.out.println(BMWModel.assemble() + " : " + BMWFactory.createLuxuryCar());   
        }
    }
}
