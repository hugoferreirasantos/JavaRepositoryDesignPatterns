package FactoryMethod;

import FactoryMethodClass.CarFactory;
import FactoryMethodClass.MotorcycleFactory;
import FactoryMethodClass.TruckFactory;




public class Main {
    public static void main(String[] args) {

        //CarFactory:
        CarFactory carro = new CarFactory();

        //MotocycleFactory:
        MotorcycleFactory moto = new MotorcycleFactory();

        //TruckFactory:
        TruckFactory caminhao = new TruckFactory();

        System.out.println(carro.createVehicle().start());
        System.out.println();
        System.out.println(moto.createVehicle().start());
        System.out.println();
        System.out.print(caminhao.createVehicle().start());


    }
}