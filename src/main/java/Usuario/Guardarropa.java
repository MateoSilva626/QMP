package Usuario;

import Atuendo.Atuendo;
import Clima.Clima;
import Prenda.Prenda;
import QMP5_compartirGuardarropas.PropuestaModificacion;
import com.google.common.collect.Sets;
import Prenda.TipoDePrenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Guardarropa {

  List<PropuestaModificacion> propuestas = new ArrayList<>();
  final Set<Prenda> prendas;

  public Guardarropa(Set<Prenda> prendasNuevas) {
    this.prendas = prendasNuevas;
  }

  public void agregarPropuesta(PropuestaModificacion propuesta) {
    propuestas.add(propuesta);
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

//TODO no sabemos si hay que pasarle todo el clima o solo la temperatura
  public List<Atuendo> sugerirAtuendos(Clima climaAcutual) {

    Set<Prenda> partesSuperior = this.sugerirParteSuperior(climaAcutual);
    Set<Prenda> partesInferior = this.sugerirParteInferior(climaAcutual);
    Set<Prenda> calzados = this.sugerirCalzado(climaAcutual);


    return Sets
        .cartesianProduct(partesSuperior, partesInferior, calzados)
        .stream()
        .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2), null))
        .collect(Collectors.toList());

  }


  List<Atuendo> sugerirAtuendosConAcesorios(Clima climaAcutual) {

    Set<Prenda> partesSuperior = this.sugerirParteSuperior(climaAcutual);
    Set<Prenda> partesInferior = this.sugerirParteInferior(climaAcutual);
    Set<Prenda> calzados = this.sugerirCalzado(climaAcutual);
    Set<Prenda> acesorios = this.sugerirAccesorios(climaAcutual);

    return Sets
        .cartesianProduct(partesSuperior, partesInferior, calzados, acesorios)
        .stream()
        .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2), list.get(3)))
        .collect(Collectors.toList());

  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void sacarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }



  public List<PropuestaModificacion>  propuestasDeModificacionPendientes(){
   return this.propuestas.stream().filter(propuesta -> propuesta.esPropuestaPendiente()).collect(Collectors.toList());
  }

}
