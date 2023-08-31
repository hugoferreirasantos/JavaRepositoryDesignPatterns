package generator;

import java.util.Calendar;

import interfaces.Boleto;
import interfaces.BoletoBuilder;

public class GeneratorBoleto {
    //c�digo orientado a interfaces
    private BoletoBuilder boletoBuilder;
    //espero um objeto que implemente o criador de boleto
    public GeneratorBoleto(BoletoBuilder boletoBuilder) {
        super();
        this.boletoBuilder = boletoBuilder;
    }
    public Boleto geraBoleto(String nome,String cedente,double valor, int nossoNro){
    //informa��es sobre o boleto a ser gerado
        boletoBuilder.buildSacado(nome);
        boletoBuilder.buildCedente(cedente);
        boletoBuilder.buildValor(valor);
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 20);
        boletoBuilder.buildVencimento(vencimento);
        boletoBuilder.buildNossoNro(nossoNro);
    //olha isso aqui que m�gico
        Boleto boleto = boletoBuilder.getBoleto();
        return boleto;
    }
}