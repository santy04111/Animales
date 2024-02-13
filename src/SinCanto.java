import Interface.TipoSonido;

import java.util.logging.Logger;

public class SinCanto implements TipoSonido {
    public static final Logger logger = Logger.getLogger(SinCanto.class.getName());

    public void makeSound() {
        logger.info("<<Silencio>>");
        System.out.println("<<Silencio>>");
    }
}
