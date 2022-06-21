package Usuario;

import Atuendo.Atuendo;
import Prenda.Prenda;
import QMP5_compartirGuardarropas.PropuestaAgregado;
import QMP5_compartirGuardarropas.PropuestaModificacion;
import Sugerencia.Sugerencia;
import Sugerencia.SugerenciaCompleta;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Usuario {

  Atuendo SugerenciaDiaria;
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

  public PropuestaModificacion calcularSugerenciaDiaria(){
    return new PropuestaAgregado();
  }

  public void actualizarSugerenciaDiaria(){
    this.propuestaDiaria = this.calcularSugerenciaDiaria();
  }


  /* <----------------------------------- CONSIGNA ----------------------------------->

TODO Como usuario quiero tener una sugerencia diaria de qué ponerme y que  todas las mañanas, diariamente,esta sea actualizada



TODO Como usuario  quiero poder conocer cuáles son las últimas alertas meteorológicas publicadas
 en el sistema para estar informado (pudiendo verlas, por ejemplo, al entrar en quemepongo.com)



TODO Como usuario  quiero que se actualice mi sugerencia diaria con las condiciones
      climáticas actualizadas cuando se genere algún alerta durante el día



TODO Como usuario quiero tener la posibilidad de que ante una alerta de tormenta la app me
      notifique que debo llevarme también un paraguas



TODO Como usuario  quiero que ante una alerta meteorológica de granizo la app  me notifique que evite salir en auto



TODO Como usuario  quiero poder recibir un mail avisándome si se generó algún alerta meteorológico y cuál



TODO      Como usuario  quiero poder configurar cuáles de estas acciones (notificaciones, mail, recálculo)
          quiero que se ejecuten y cuáles no, además de soportar nuevas acciones a futuro.
          (No nos interesará, sin embargo, soportar nuevas alertas)

  <----------------------------------- CONSIGNA ----------------------------------->
  */

  /*
  public void crearGuardarropaCompartido(Set<Prenda> prendas, List<Usuario> usuarios) {
    Guardarropa guardarropaCompartido = new Guardarropa(prendas);
    usuarios.forEach(usuario -> usuario.agregarGuardarropa(guardarropaCompartido));
  }

  */
}
