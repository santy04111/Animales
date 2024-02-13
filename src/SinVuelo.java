import Interface.TipoVuelo;

import java.util.logging.Logger;

public class SinVuelo implements TipoVuelo {
    public static final Logger logger = Logger.getLogger(SinVuelo.class.getName());

    public void vuelo() {
        logger.info("no puedo volar");
        System.out.println("no puedo volar");
    }
}
