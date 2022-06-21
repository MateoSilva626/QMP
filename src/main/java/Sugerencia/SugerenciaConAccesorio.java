package Sugerencia;

import Clima.Clima;
import Prenda.Prenda;
import Prenda.TipoDePrenda;

import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaConAccesorio implements Sugerencia{
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

  public Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> accesoriosSugeridos = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.ACCESORIOS)
    ).collect(Collectors.toSet());

    accesoriosSugeridos.forEach(Prenda::usarPrenda);

    return accesoriosSugeridos;
  }
}
