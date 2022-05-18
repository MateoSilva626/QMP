import java.util.Set;
import java.util.stream.Collectors;

public interface Sugerencia {

  Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas);
  Set<Prenda> sugerirParteInferior(Clima clima, Set<Prenda> guardarropas);
  Set<Prenda> sugerirCalzado(Clima clima, Set<Prenda> guardarropas);
  Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas);

  //segunda idea
  //public Set<Prenda> sugerirAtuendo(Clima clima, Set<Prenda> guardarropas);

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
              (prenda.categoria() == TipoDePrenda.Categoria.ACCESORIOS)
      ).collect(Collectors.toSet());
    }*/

      //segunda idea
      //public Set<Prenda> sugerirAtuendo(Clima clima, Set<Prenda> guardarropas) {
      //  Set<Prenda> prendasAtuendo;
      //}

    }
  }

  public class SugerenciaConAccesorios implements Sugerencia {
      public Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas) {
        Set<Prenda> prendasSugeridas =  guardarropas.stream().filter(
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
    //todo
    //public class SugerenciaSinSuperposicion implements Sugerencia { }
    // pipe propone hacer de la forma que se venia haciendo arriba pero hacerle un .findFirst() al Set de prendas sugeridas
    // para agarrar UNICAMENTE una prenda de cada parte del cuerpo, ya que pide SIN SUPERPOSICION
    // el inconveniente es que cada metodo NO devuelve una sola prenda, sino que devuelve un Set<Prenda>, por ende: como
    // planteamos? creamos un set que tenga solo ese elemento sugerido para que no rompa con el tipo que devuelva?
}