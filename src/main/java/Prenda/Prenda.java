package Prenda;

import Clima.Clima;

import java.util.Objects;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  // POR QMP3
  int usosActuales = 0;
  Estado estado = Estado.LIMPIA;

  // POR QMP4
  int temperaturaMaxima;


  // VAMOS A TENER ESTADOS
  public enum Estado {
    LIMPIA,
    SUCIA,
    PERCUDIDA,
    LAVANDOSE
  }

  public Prenda(TipoDePrenda tipo, Material.Trama trama, Color colorPrincipal, Color colorSecundario, Material.TipoMaterial material) {
    this.tipoDePrenda = tipo;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = new Material(trama, material);
  }

  //esto todavia no tenemos data (KISS)??
  public boolean cumpleCondClimaticas(Clima clima) {
    return temperaturaMaxima >= clima.estadoDelTiempo.getTemperatura();
  }

  public boolean aptaTemperatura(int temperatura) {
    return this.temperaturaMaxima >= temperatura;
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


  public void usarPrenda() {
    this.usosActuales++;
    if (usosActuales == 2) {
      this.cambiarEstado(Estado.SUCIA);
    } else if (usosActuales == 3) {
      this.cambiarEstado(Estado.PERCUDIDA);
    }

  }

  public boolean esSugerible() {
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


 /*public void validarTipoPrenda(Prenda.TipoDePrenda tipoPrenda) {

    if (!tipoPrenda.contains(tipoPrenda)) {
      throw new tipoPrenda(tipoPrenda);
    }
  }*/







