import Interface.Volar;

import java.util.logging.Logger;

public class Gallina extends Ave {
    public static final Logger logger = Logger.getLogger(Gallina.class.getName());

    public Gallina(){
        logger.info("Instanciando un Gallina");
        this.setTipoVuelo(new VueloConAlas());
        this.setTipoSonido(new Grasnido());
    }
}
