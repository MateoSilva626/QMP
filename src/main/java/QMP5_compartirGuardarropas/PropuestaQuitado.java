package QMP5_compartirGuardarropas;

import Guardarropa.Guardarropa;
import Prenda.Prenda;

public class PropuestaQuitado extends PropuestaModificacion {


  public PropuestaQuitado(Prenda prenda, Guardarropa guardarropa) {
    super(prenda, guardarropa);
  }

  public void modificarPrenda() {
    guardarropa.agregarPrenda(prenda);
  }

  public void aprobarPropuesta() {
    guardarropa.sacarPrenda(prenda);
  }
}
