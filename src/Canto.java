import Interface.TipoSonido;

import java.util.logging.Logger;

public class Canto implements TipoSonido {

    public static final Logger logger = Logger.getLogger(Canto.class.getName());

    public void makeSound() {
        logger.info("Estoy cantando");
        System.out.println("Estoy cantando");
    }
}
