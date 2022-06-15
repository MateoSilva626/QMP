package Atuendo;

import Prenda.Prenda;

public class Atuendo {

  Prenda prendaSup;
  Prenda prendaInf;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda prendaSup, Prenda prendaInf, Prenda calzado, Prenda accesorio) {
    this.prendaSup = prendaSup;
    this.prendaInf = prendaInf;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }

  public boolean aptaParaTemperatura(int temperatura) {
    return this.prendaSup.aptaTemperatura(temperatura)
      && this.prendaInf.aptaTemperatura(temperatura) && this.calzado.aptaTemperatura(temperatura);
  }


}


