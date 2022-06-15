package QMP5_compartirGuardarropas;

import Guardarropa.Guardarropa;
import Prenda.Prenda;

abstract public class PropuestaModificacion {

    //esto lo puso villa, la verdad que no entendi muy bien y lo hice como me parecio
    // TODO aceptarEn(guardaropas)
    // TODO deshacerEn(guardaropas)
    // TODO realizarAceptacionEn(guardaropas)

    Estado estadoPropuesta;
    Prenda prenda;
    Guardarropa guardarropa;

    public PropuestaModificacion(Prenda prenda, Guardarropa guardarropa){
        this.prenda = prenda;
        this.guardarropa = guardarropa;
        this.estadoPropuesta = Estado.PENDIENTE;
    }

    enum Estado{
        PENDIENTE, APROBADA, RECHAZADA
    }

    public void aceptarPropuesta(PropuestaModificacion propuestaModificacion){
        estadoPropuesta = Estado.APROBADA;
        propuestaModificacion.aprobarPropuesta();
    }

    public void rechazarPropuesta(PropuestaModificacion propuestaModificacion){
        estadoPropuesta = Estado.RECHAZADA;
    }

    //aca solo hay que tener en cuenta que deshaces las cuales hayas aceptado, no se puede
    // deshacer una rechazada
    public void deshacerPropuesta(PropuestaModificacion propuestaModificacion){
        this.modificarPrenda();
        estadoPropuesta = Estado.PENDIENTE;
    }

    public abstract void modificarPrenda();
    public abstract void aprobarPropuesta();
}
