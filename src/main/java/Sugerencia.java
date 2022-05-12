import java.util.Set;
import java.util.stream.Collectors;

public interface Sugerencia {

  Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas);
  Set<Prenda> sugerirParteInferior(Clima clima, Set<Prenda> guardarropas);
  Set<Prenda> sugerirCalzado(Clima clima, Set<Prenda> guardarropas);
  Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas);

  //segunda idea
  //public Set<Prenda> sugerirAtuendo(Clima clima, Set<Prenda> guardarropas);

//todo
 // Como usuario QueMePongo, quiero que al aparecer en una sugerencia, la aplicación asuma que una prenda ha sido usada.
  // HACER FOREACH DEL SET PARA AUMENTAR EN 1 EL USO DE CADA PRENDAAL SER SUGERIDA.

  public class SugerenciaCompleta implements Sugerencia {

    public Set<Prenda> sugerirParteSuperior(Clima clima, Set<Prenda> guardarropas) {
      return guardarropas.stream().filter(
          prenda -> prenda.esSugerible() &&
              prenda.cumpleCondClimaticas(clima) &&
              (prenda.categoria() == TipoDePrenda.Categoria.PARTE_SUPERIOR)
      ).collect(Collectors.toSet());
    }

    public Set<Prenda> sugerirParteInferior(Clima clima, Set<Prenda> guardarropas) {
      return guardarropas.stream().filter(
          prenda -> prenda.esSugerible() &&
              prenda.cumpleCondClimaticas(clima) &&
              (prenda.categoria() == TipoDePrenda.Categoria.PARTE_INFERIOR)
      ).collect(Collectors.toSet());
    }

    public Set<Prenda> sugerirCalzado(Clima clima, Set<Prenda> guardarropas) {
      return guardarropas.stream().filter(
          prenda -> prenda.esSugerible() &&
              prenda.cumpleCondClimaticas(clima) &&
              (prenda.categoria() == TipoDePrenda.Categoria.CALZADO)
      ).collect(Collectors.toSet());
    }

    //todo
    //justo en este caso deberia ser vacio el set creemos
    public Set<Prenda> sugerirAccesorios(Clima clima, Set<Prenda> guardarropas) {
      return guardarropas.stream().filter(
          prenda -> prenda.esSugerible() &&
              prenda.cumpleCondClimaticas(clima) &&
              (prenda.categoria() == TipoDePrenda.Categoria.ACCESORIOS)
      ).collect(Collectors.toSet());
    }

    //segunda idea
    //public Set<Prenda> sugerirAtuendo(Clima clima, Set<Prenda> guardarropas) {
    //  Set<Prenda> prendasAtuendo;
    //}

  }

    //todo
    //public class SugerenciaConAccesorios implements Sugerencia { }
    //todo
    //public class SugerenciaSinSuperposicion implements Sugerencia { }

  }