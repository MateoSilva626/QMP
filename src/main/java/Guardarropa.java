import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Guardarropa {

  final Set<Prenda> prendas;

  Guardarropa(Set<Prenda> prendasNuevas) {
    this.prendas = prendasNuevas;
  }


  public Set<Prenda> sugerirParteSuperior(Clima clima) {
    Set<Prenda> prendasSugeridas = prendas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.PARTE_SUPERIOR)
    ).collect(Collectors.toSet());

    prendasSugeridas.forEach(Prenda::usarPrenda);

    return prendasSugeridas;
  }

  public Set<Prenda> sugerirParteInferior(Clima clima) {
    Set<Prenda> prendasSugeridas = prendas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.PARTE_INFERIOR)
    ).collect(Collectors.toSet());

    prendasSugeridas.forEach(Prenda::usarPrenda);

    return prendasSugeridas;
  }

  public Set<Prenda> sugerirCalzado(Clima clima) {
    Set<Prenda> prendasSugeridas = prendas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.CALZADO)
    ).collect(Collectors.toSet());

    prendasSugeridas.forEach(Prenda::usarPrenda);

    return prendasSugeridas;
  }


  public Set<Prenda> sugerirAccesorios(Clima clima) {
    Set<Prenda> accesoriosSugeridos = prendas.stream().filter(
        prenda -> prenda.esSugerible() &&
            prenda.cumpleCondClimaticas(clima) &&
            (prenda.categoria() == TipoDePrenda.Categoria.ACCESORIOS)
    ).collect(Collectors.toSet());

    accesoriosSugeridos.forEach(Prenda::usarPrenda);

    return accesoriosSugeridos;
  }


  List<Atuendo> sugerirAtuendos() {

    Set<Prenda> partesSuperior = this.sugerirParteSuperior(new Clima());
    Set<Prenda> partesInferior = this.sugerirParteInferior(new Clima());
    Set<Prenda> calzados = this.sugerirCalzado(new Clima());


    return Sets
        .cartesianProduct(partesSuperior, partesInferior, calzados)
        .stream()
        .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2), null))
        .collect(Collectors.toList());

  }


  List<Atuendo> sugerirAtuendosConAcesorios() {

    Set<Prenda> partesSuperior = this.sugerirParteSuperior(new Clima());
    Set<Prenda> partesInferior = this.sugerirParteInferior(new Clima());
    Set<Prenda> calzados = this.sugerirCalzado(new Clima());
    Set<Prenda> acesorios = this.sugerirAccesorios(new Clima());

    return Sets
        .cartesianProduct(partesSuperior, partesInferior, calzados, acesorios)
        .stream()
        .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2), list.get(3)))
        .collect(Collectors.toList());

  }

}
