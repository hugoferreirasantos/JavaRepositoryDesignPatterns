package FactoryMethodClass;

import  InterfaceVehicle.Vehicle;
import  InterfaceVehicle.VehicleFactory;
public class MotorcycleFactory implements  VehicleFactory
{
    public Vehicle createVehicle()
    {
        System.out.println("Criando o veiculo Moto na fabrica: ");

        return  new Vehicle() {
            @Override
            public String start() {
                Motorcycle moto = new Motorcycle();
                return moto.start();
            }
        };
    }
}
