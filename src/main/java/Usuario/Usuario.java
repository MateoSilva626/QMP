package Usuario;

import Prenda.Prenda;
import QMP5_compartirGuardarropas.PropuestaModificacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Usuario {


  List<Guardarropa> guardarropas = new ArrayList<>();

  public void agregarPropuesta(Guardarropa guardarropa, PropuestaModificacion propuesta) {
    guardarropa.agregarPropuesta(propuesta);
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  public void sugerirPrendaAUnUsuario(Usuario usuario, Guardarropa guardarropa, PropuestaModificacion propuesta) {
    usuario.agregarPropuesta(guardarropa, propuesta);
  }

  public void aceptarPropuesta(PropuestaModificacion propuesta, Guardarropa guardarropa) {
    propuesta.aceptarPropuesta(guardarropa);
  }

  public void rechazarPropuesta(PropuestaModificacion propuesta) {
    propuesta.rechazarPropuesta();
  }

  public void deshacerPropuesta(PropuestaModificacion propuesta, Guardarropa guardarropa) {
    propuesta.deshacerPropuesta(guardarropa);
  }



  /*
  public void crearGuardarropaCompartido(Set<Prenda> prendas, List<Usuario> usuarios) {
    Guardarropa guardarropaCompartido = new Guardarropa(prendas);
    usuarios.forEach(usuario -> usuario.agregarGuardarropa(guardarropaCompartido));
  }

  */
}
