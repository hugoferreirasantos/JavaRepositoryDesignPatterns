package CarroPrototype;

import java.util.Date;

public class CarroPrototype {
    //Atributos:
    private String Marca;
    private String Ano;
    private float Valor_Compra;


    //*Métodos*:

    public  CarroPrototype(){

    }


    private CarroPrototype(CarroPrototype carro)
    {
        this.Marca = carro.getMarca();
        this.Ano = carro.getAno();
        this.Valor_Compra = carro.getValor_Compra();
    }

    //Método clone:
    public CarroPrototype clone(){return new CarroPrototype(this);}

    public String getMarca() {return this.Marca;}

    public String getAno() {return  this.Ano;}

    public float getValor_Compra() {return this.Valor_Compra;}

    public void setMarca(String value) {this.Marca = value;}

    public void setAno(String Ano) {this.Ano = Ano;}

    public void setValor_Compra(float valor_compra) {this.Valor_Compra = valor_compra;}


    public String toString()
    {
        return "Carro{" +
                "Marca: " + Marca +'\''+
                ", Ano: " + Ano + '\'' +
                ", Valor Compra: " + Valor_Compra
                + '}';
    }




}
