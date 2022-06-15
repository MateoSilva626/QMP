package QMP5_compartirGuardarropas;

import Usuario.Guardarropa;
import Prenda.Prenda;

public class PropuestaQuitado extends PropuestaModificacion {


  public PropuestaQuitado(Prenda prenda, Guardarropa guardarropa) {
    super(prenda);
  }

  public void realizarAceptacion(Guardarropa guardarropa) {
    guardarropa.sacarPrenda(prenda);
  }

  public void deshacerPropuesta(Guardarropa guardarropa){
    guardarropa.agregarPrenda(prenda);
  }

}
