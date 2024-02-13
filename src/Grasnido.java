import Interface.TipoSonido;

import java.util.logging.Logger;

public class Grasnido implements TipoSonido {

    public static final Logger logger = Logger.getLogger(Grasnido.class.getName());

    public void makeSound() {
        logger.info("grasnando");
        System.out.println("grasnando");
    }
}
