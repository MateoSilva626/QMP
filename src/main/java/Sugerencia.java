import java.util.Set;

class Sugerencia {
  Prenda prendaTorso;
  Prenda prendaPierna;
  Prenda prendaPies;

  public void Sugerencia(Clima clima) {
    this.prendaTorso = fabricarTorso(clima);
    this.prendaPierna = fabricarPierna(clima);
    this.prendaPies = fabricarPies(clima);
    
    //la aplicación asuma que una prenda ha sido usada.
    prendaTorso.usarPrenda();
    prendaPierna.usarPrenda();
    prendaPies.usarPrenda();
  }

  public Prenda fabricarTorso(Clima clima) {

    return null;
  }

  public Prenda fabricarPierna(Clima clima) {

    return null;
  }

  public Prenda fabricarPies(Clima clima) {

    return null;
  }


}

class AtuendoConAccesorio inherits Atuendo{

}


/*


 OK? * quiero recibir una sugerencia de prendas que me vista completamente (torso, piernas y pies).

 OK?* quiero que una sugerencia pueda incluir accesorios (guantes, gorros, bufandas, anteojos de sol, etc).

 NO TENEMOS EL GUARDAROPAS, LO TENIAMOS EN EL USUARIO * quiero recibir varias sugerencias que combinen las prendas de mi guardarropas

 DE LA FORMA QUE LO HICIMOS NO PUEDEN HABER MAS DE UNA ENTONCES YA ESTARIA? * quiero que una sugerencia cubra cada parte del cuerpo con no más de una prenda, es decir, evitando superposiciones. (capas)

 * */