package FactoryMethodClass;

import InterfaceVehicle.Vehicle;

public class Truck implements  Vehicle
{
    public String start()
    {
        return "Iniciado a criação do caminhão. ";
    }
}
