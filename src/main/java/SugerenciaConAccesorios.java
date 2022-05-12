public class SugerenciaConAccesorios extends Sugerencia {

  //ver como modelar los accesorios ya que antes lo teniamos
  Prenda accesorios;

  public void SugerenciaConAccesorios(Clima clima) {
    this.prendaTorso = fabricarTorso(clima);
    this.prendaPierna = fabricarPierna(clima);
    this.prendaPies = fabricarPies(clima);
    this.accesorios = fabricarAccesorios(clima);

    //la aplicación asuma que una prenda ha sido usada.
    prendaTorso.usarPrenda();
    prendaPierna.usarPrenda();
    prendaPies.usarPrenda();
  }

  public Prenda fabricarAccesorios(Clima clima) {
    return null;
  }

}
