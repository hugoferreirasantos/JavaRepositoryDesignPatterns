package classes;
import  java.util.Calendar;
import interfaces.Boleto;
import interfaces.BoletoBuilder;

public class CaixaBoletoBuilder implements BoletoBuilder {

    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNro;



    @Override
    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    @Override
    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }
    @Override
    public void buildValor(double valor) {
        this.valor = valor;
    }
    @Override
    public void buildVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }
    @Override
    public void buildNossoNro(int nossoNro) {
        this.nossoNro = nossoNro;
    }
    @Override
    public Boleto getBoleto() {
        return new CaixaBoleto(sacado,cedente,valor,vencimento,nossoNro);
    }

}
