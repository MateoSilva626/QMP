import QMP5_compartirGuardarropas.PropuestaModificacion;

import java.util.List;

public class Usuario {

  List<PropuestaModificacion> propuestas;

  public void agregarPropuesta(PropuestaModificacion propuesta) {
    propuestas.add(propuesta);
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


     ---------------Tercer punto---------------------

     Como usuario, quiero que otro usuario me proponga tentativamente agregar una prenda al guardarropas.

    En este caso ya tenemos un mensaje para agregar una prenda a un guardarropas

    unGuardarropas.agregarPrenda(prenda)









    */








}
