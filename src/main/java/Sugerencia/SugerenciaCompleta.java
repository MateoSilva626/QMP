package Sugerencia;

import Clima.Clima;
import Prenda.Prenda;
import Prenda.TipoDePrenda;

import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaCompleta implements Sugerencia{

  public Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> prendasSugeridas = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.PARTE_SUPERIOR)
    ).collect(Collectors.toSet());

    prendasSugeridas.forEach(Prenda::usarPrenda);

    return prendasSugeridas;
  }

  public Set<Prenda> sugerirParteInferior(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> prendasSugeridas = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.PARTE_INFERIOR)
    ).collect(Collectors.toSet());

    prendasSugeridas.forEach(Prenda::usarPrenda);

    return prendasSugeridas;
  }

  public Set<Prenda> sugerirCalzado(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> prendasSugeridas = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.CALZADO)
    ).collect(Collectors.toSet());

    prendasSugeridas.forEach(Prenda::usarPrenda);

    return prendasSugeridas;
  }

  //justo en este caso deberia ser vacio el set creemos
  public Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> listaVacia = null;
    return listaVacia;
      /*
      return guardarropas.stream().filter(
          prenda -> prenda.esSugerible() &&
              prenda.cumpleCondClimaticas(clima) &&
              (prenda.categoria() == Prenda.TipoDePrenda.Categoria.ACCESORIOS)
      ).collect(Collectors.toSet());
    }*/

    //segunda idea
    //public Set<Prenda.Prenda> sugerirAtuendo(Clima.Clima clima, Set<Prenda.Prenda> guardarropas) {
    //  Set<Prenda.Prenda> prendasAtuendo;
    //}

  }
}
