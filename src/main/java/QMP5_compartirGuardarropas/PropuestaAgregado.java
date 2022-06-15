package QMP5_compartirGuardarropas;

import Usuario.Guardarropa;
import Prenda.Prenda;

public class PropuestaAgregado extends PropuestaModificacion {


  public PropuestaAgregado(Prenda prenda) {
    super(prenda);
  }

  public void realizarAceptacion(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(prenda);
  }
  public void deshacerPropuesta(Guardarropa guardarropa){
    guardarropa.sacarPrenda(this.prenda);
  }

}
