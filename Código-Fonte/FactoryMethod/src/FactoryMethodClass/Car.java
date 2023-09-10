package FactoryMethodClass;

import InterfaceVehicle.Vehicle;

public class Car implements Vehicle
{
    public String start()
    {
        return "Iniciado a criação do carro. ";
    }
}
