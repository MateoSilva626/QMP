package Atuendo;

import Clima.Clima;
import Usuario.Guardarropa;

import java.util.List;
import java.util.stream.Collectors;

import Clima.EstadoDelTiempo;

public class Estilista {
  private Clima servicioMeteorologico;

  public Atuendo sugerirAtuendo(Guardarropa guardarropas,Clima climaAcutual) {
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico
        .obtenerCondicionesClimaticas();
    List<Atuendo> combinaciones = guardarropas.sugerirAtuendos(climaAcutual);

    return combinaciones.stream()
        .filter(atuendo -> atuendo.aptaParaTemperatura(estadoDelTiempo.temperatura))
        .collect(Collectors.toList())
        .get(0);

  }

}
