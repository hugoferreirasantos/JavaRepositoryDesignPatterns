package FactoryMethodClass;

import InterfaceVehicle.Vehicle;
import InterfaceVehicle.VehicleFactory;
public class TruckFactory implements  VehicleFactory
{
    public Vehicle createVehicle()
    {
        System.out.println("Criando o veiculo Caminhão na fabrica");

        return new Vehicle() {
            @Override
            public String start()
            {
                Truck caminhao = new Truck();
                return caminhao.start();
            }
        };
    }
}
