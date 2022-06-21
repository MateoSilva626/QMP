package QMP5_compartirGuardarropas;

import Usuario.Guardarropa;
import Prenda.Prenda;

abstract public class PropuestaModificacion {

  //esto lo puso villa, la verdad que no entendi muy bien y lo hice como me parecio
  // TODO aceptarEn(guardaropas)
  // TODO deshacerEn(guardaropas)
  // TODO realizarAceptacionEn(guardaropas)

  public Estado estadoPropuesta;
  public Prenda prenda;


  public PropuestaModificacion(Prenda prenda) {
    this.prenda = prenda;
    this.estadoPropuesta = Estado.PENDIENTE;
  }

  public enum Estado {
    PENDIENTE, APROBADA, RECHAZADA
  }

  public void aceptarPropuesta(Guardarropa guardarropa) {
    estadoPropuesta = Estado.APROBADA;
    this.realizarAceptacion(guardarropa);
  }
  public abstract void realizarAceptacion(Guardarropa guardarropa);

  public void rechazarPropuesta() {
    estadoPropuesta = Estado.RECHAZADA;
  }


  public abstract void deshacerPropuesta(Guardarropa guardarropa);


  // agrego este metodo para no perder encapsulamiento en la clase guardarropa (tema visto 16/06 con nato)
  public boolean esPropuestaPendiente(){
    return this.estadoPropuesta == Estado.PENDIENTE;
  }


} //
