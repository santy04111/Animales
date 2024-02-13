import Interface.Volar;

import java.util.logging.Logger;

public class Canario extends Ave {

    public static final Logger logger = Logger.getLogger(Canario.class.getName());

    public Canario(){
        logger.info("Instanciando un canario");
        this.setTipoVuelo(new SinVuelo());
        this.setTipoSonido(new SinCanto());

    }
}
