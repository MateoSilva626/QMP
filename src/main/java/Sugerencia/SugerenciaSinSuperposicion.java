package Sugerencia;

import Clima.Clima;
import Prenda.Prenda;
import Prenda.TipoDePrenda;

import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaSinSuperposicion {
  public Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> prendaSugerida = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.PARTE_SUPERIOR)
    ).limit(1).collect(Collectors.toSet());

    prendaSugerida.forEach(Prenda::usarPrenda);

    return prendaSugerida;
  }

  public Set<Prenda> sugerirParteInferior(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> prendaSugerida = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.PARTE_INFERIOR)
    ).limit(1).collect(Collectors.toSet());

    prendaSugerida.forEach(Prenda::usarPrenda);

    return prendaSugerida;
  }

  public Set<Prenda> sugerirCalzado(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> prendaSugerida = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.CALZADO)
    ).limit(1).collect(Collectors.toSet());

    prendaSugerida.forEach(Prenda::usarPrenda);

    return prendaSugerida;
  }

  public Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas) {
    Set<Prenda> accesorioSugerido = guardarropas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.ACCESORIOS)
    ).limit(1).collect(Collectors.toSet());

    accesorioSugerido.forEach(Prenda::usarPrenda);

    return accesorioSugerido;
  }
}

