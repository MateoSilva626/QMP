package Usuario;

import Guardarropa.Guardarropa;
import Prenda.Prenda;
import QMP5_compartirGuardarropas.PropuestaModificacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Usuario {

  List<PropuestaModificacion> propuestas = new ArrayList<>();

  //PARA PRIMER PUNTO, hace falta implementar lo de los criterios????
  List<Guardarropa> guardarropas = new ArrayList<>();

  public void agregarPropuesta(PropuestaModificacion propuesta) {
    propuestas.add(propuesta);
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  //ESTO ES PARA EL PUNTO 2 EN EL CASO DE QUE LO QUE HAYA PUESTO VILLA DE EXPLICACION MAS ABAJO NO SIRVA
  public void crearGuardarropaCompartido(Set<Prenda> prendas, List<Usuario> usuarios) {
    Guardarropa guardarropaCompartido = new Guardarropa(prendas);
    usuarios.forEach(usuario -> usuario.agregarGuardarropa(guardarropaCompartido));
  }

    /*
     ---------------Primer punto---------------------
     Como usuario, quiero poder manejar varios guardarropas para separar
     mis prendas según diversos criterios (ropa de viaje, ropa de entrecasa, etc).

     un usuario conoce 1 o muchos guardarropas que conocen 1 o muchas prendas

     ---------------Segundo punto---------------------

     Como usuario, quiero poder crear guardarropas compartidos con otros usuarios (ej:ropa que comparto con mi hermano).

     En el caso que no sea necesario ni diferenciar el propietario, ni diferenciar a los privados de los
     compartidos, entonces no haría falta tocar nada en nuestro modelo, lo único que deberíamos hacer
     es que varios objetos del tipo usuario conozcan al mismo guardarropas.

    -------EN CASO DE QUE ELGUARDARROPA TENGA QUE CONOCER LOS USUARIOS QUE LO USAN:---
    ->void crearGuardarropaCompartido(listaPrendas, [usuariosQueComparten]) {
      guardarropaCompartido = new guardarropas(jahsdkhskd, [this]++[usuariosQueComparten]);
      for each agregando a cada usuario el guardarropa
    } <-

     ---------------Tercer punto---------------------

     Como usuario, quiero que otro usuario me proponga tentativamente agregar una prenda al guardarropas.

    En este caso ya tenemos un mensaje para agregar una prenda a un guardarropas

    unGuardarropas.agregarPrenda(prenda)









    */


}
