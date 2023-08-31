package Main;

import classes.CaixaBoletoBuilder;
import classes.ItauBoletoBuilder;
import generator.GeneratorBoleto;
import interfaces.Boleto;
import interfaces.BoletoBuilder;

public class GeradorBoletoMain {
    public static void main(String[] args) {

        BoletoBuilder boletoBuilder = new ItauBoletoBuilder();
        GeneratorBoleto generatorBoleto = new GeneratorBoleto(boletoBuilder); //itau
        Boleto boleto = generatorBoleto.geraBoleto("Marcia","Estacio", 3000.00,5555);//retorna o boleto pronto
        System.out.println(boleto);

        BoletoBuilder boletoBuilder1 = new CaixaBoletoBuilder();
        GeneratorBoleto generatorBoleto2 = new GeneratorBoleto(boletoBuilder1);
        Boleto boleto1 = generatorBoleto2.geraBoleto("Hugo","Estacio",10000.00,3899);
        System.out.println(boleto1);


         }

}