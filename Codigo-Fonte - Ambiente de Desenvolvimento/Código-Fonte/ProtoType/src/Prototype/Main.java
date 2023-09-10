package Prototype;

import CarroPrototype.CarroPrototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        CarroPrototype carro1 = new CarroPrototype();
        carro1.setMarca("Toyta");
        carro1.setAno("2023");
        carro1.setValor_Compra(3500000);

        CarroPrototype carro2 = carro1.clone();
        carro2.setMarca("Ford");

        CarroPrototype carro3 =  carro2.clone();
        carro3.setValor_Compra(50000);
        carro3.setAno("2025");


        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

    }
}
