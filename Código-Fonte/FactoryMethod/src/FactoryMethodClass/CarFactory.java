package FactoryMethodClass;

import InterfaceVehicle.Vehicle;
import InterfaceVehicle.VehicleFactory;
public class CarFactory implements  VehicleFactory
{
    public Vehicle createVehicle(){
        System.out.println("Criando o veiculo Carro na fabrica: ");

        return new Vehicle() {
            @Override
            public String start() {
                Car carro = new Car();

                return carro.start();
            }
        };
    }
}
