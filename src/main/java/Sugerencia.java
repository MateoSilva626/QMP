import Clima.Clima;
import Prenda.Prenda;

import java.util.Set;
import java.util.stream.Collectors;

public interface Sugerencia {

  Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas);

  Set<Prenda> sugerirParteInferior(Clima clima, Set<Prenda> guardarropas);

  Set<Prenda> sugerirCalzado(Clima clima, Set<Prenda> guardarropas);

  Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas);

  /*
  public Atuendo.Atuendo sugerirAtuendo(Clima.Clima clima, Set<Prenda.Prenda> guardarropas) {

    Set<Set<Prenda.Prenda>> prendasSugeridas = new HashSet<>();
    prendasSugeridas.add(sugerirParteSuperior(clima, guardarropas));
    prendasSugeridas.add(sugerirParteInferior(clima, guardarropas));
    prendasSugeridas.add(sugerirCalzado(clima, guardarropas));
    prendasSugeridas.add(sugerirAccesorios(clima, guardarropas));

    Atuendo.Atuendo atuendoCompleto = new Atuendo.Atuendo(prendasSugeridas.stream().flatMap(Set::stream).collect(Collectors.toSet()));

    return atuendoCompleto;
  }*/

  public class SugerenciaCompleta implements Sugerencia {


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

  public class SugerenciaConAccesorios implements Sugerencia {

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

  public class SugerenciaSinSuperposicion implements Sugerencia {

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
}