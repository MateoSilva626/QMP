package Sugerencia;

import Clima.Clima;
import Prenda.Prenda;

import java.util.Set;


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


}