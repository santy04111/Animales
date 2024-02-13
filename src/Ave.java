import Interface.TipoSonido;
import Interface.TipoVuelo;

public abstract class Ave {

private TipoSonido tipoSonido;
private TipoVuelo tipoVuelo;

public void setTipoVuelo(TipoVuelo tipoVuelo){
    this.tipoVuelo = tipoVuelo;
}
    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido = tipoSonido;
    }

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }

    public void realizaSonido(){
        tipoSonido.makeSound();
    }


}
