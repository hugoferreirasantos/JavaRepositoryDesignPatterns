package Class;
import Interfaces.TomadaDoissPinos;
import Interfaces.TomadaTresPinos;

public class AdaptadorTomada implements TomadaTresPinos{
    private final TomadaDoissPinos adaptee ;

    public AdaptadorTomada(TomadaDoissPinos tomada){
        adaptee = tomada;
    }

    @Override
    public String ligarTomadaTresPinos(){
        return adaptee.ligarTomadaDoisPinos();
    }

}
