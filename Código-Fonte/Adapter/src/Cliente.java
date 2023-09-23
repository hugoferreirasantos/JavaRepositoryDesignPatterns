
//Interfaces:
import Interfaces.TomadaDoissPinos;

//Classes:
import Class.AdaptadorTomada;


public class Cliente {
    public static void main(String[] args) {

        TomadaDoissPinos tomada = new TomadaDoissPinos() {
            @Override
            public String ligarTomadaDoisPinos() {
                return "Tomada de Dois Pinos conectada";
            }
        };


        AdaptadorTomada adaptorTomada = new AdaptadorTomada(tomada);
        System.out.println(adaptorTomada.ligarTomadaTresPinos());

    }
}