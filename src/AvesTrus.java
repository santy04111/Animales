import java.sql.SQLOutput;
import java.util.logging.Logger;

public class AvesTrus extends Ave{

    public static final Logger logger = Logger.getLogger(AvesTrus.class.getName());

    public AvesTrus() {
        logger.info("Instanciando Avestruz");

        this.setTipoVuelo(new SinVuelo());
        this.setTipoSonido(new SinCanto());

    }


}
