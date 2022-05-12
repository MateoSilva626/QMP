import java.util.Objects;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  // POR QMP3
  int usosActuales = 0;
  Estado estado = Estado.LIMPIA;


  // VAMOS A TENER ESTADOS
  public enum Estado {
    LIMPIA,
    SUCIA,
    PERCUDIDA,
    LAVANDOSE
  }

  //esto todavia no tenemos data (KISS)??
  boolean cumpleCondClimaticas(Clima clima) {
    return true;
  }

/*
quiero indicar que una prenda ha sido puesta a lavar.
quiero que una prenda “sucia” que es lavada, deje de estarlo.
quiero que una prenda no pueda ser sugerida mientras está lavándose.
*/

  void ponerALavar() {
    //se podria hacer un manejo de errores para que nada mas venga de sucia o limpia
    this.estado = Estado.LAVANDOSE;
  }

  void sacarDeLavado() {
    this.estado = Estado.LIMPIA;
    this.usosActuales= 0;
  }


  void usarPrenda() {
    this.usosActuales++;
    if (usosActuales == 2) {
      this.cambiarEstado(Estado.SUCIA);
    } else if (usosActuales == 3) {
      this.cambiarEstado(Estado.PERCUDIDA);
    }

  }

  boolean esSugerible() {
    boolean aDevolver = false;

    if(this.estado == Estado.LIMPIA || this.estado == Estado.SUCIA) {
      aDevolver=true;
    }
    return aDevolver;
  }

  private void cambiarEstado(Estado estado) {
    this.estado = estado;
  }


  //prendaValida(prenda); //este tiene el ultimo requerimiento que una prenda tenga un tipo valido para su categoria

  public Prenda(TipoDePrenda tipo, Material.Trama trama, Color colorPrincipal, Color colorSecundario, Material.TipoMaterial material) {
    this.tipoDePrenda = tipo;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = new Material(trama, material);
  }

  public TipoDePrenda.Categoria categoria() {
    return tipoDePrenda.getCategoria();
  }

}




/*COMENTARIOS A TENER EN CUENTA
 *
 * categoria: parte superior , parte inferior, etc
 *
 * quiero evitar que haya prendas sin tipo, tela, categoría o color primario`
 *
 * esto seria settear el builder con estos atributos
 *
 * El tipoDePrenda seria ej: buzo remera, chaleco, etc
 * */


 /*public void validarTipoPrenda(TipoDePrenda tipoPrenda) {

    if (!tipoPrenda.contains(tipoPrenda)) {
      throw new tipoPrenda(tipoPrenda);
    }
  }*/







