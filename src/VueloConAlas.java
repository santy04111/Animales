import Interface.TipoVuelo;

import java.util.logging.Logger;

public class VueloConAlas implements TipoVuelo {

    public static final Logger logger = Logger.getLogger(VueloConAlas.class.getName());

    public void vuelo() {
        logger.info("esta volando, aleteando");
        System.out.println("esta volando, aleteando");
    }
}
