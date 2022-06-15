package QMP5_compartirGuardarropas;

import Guardarropa.Guardarropa;
import Prenda.Prenda;

public class PropuestaAgregado extends PropuestaModificacion {


  public PropuestaAgregado(Prenda prenda, Guardarropa guardarropa) {
    super(prenda, guardarropa);
  }

  public void modificarPrenda() {
    guardarropa.sacarPrenda(prenda);
  }

  public void aprobarPropuesta() {
    guardarropa.agregarPrenda(prenda);
  }

}
