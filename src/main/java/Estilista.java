import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Estilista {
  private Clima servicioMeteorologico;

  public Atuendo sugerirAtuendo(String direccion, Guardarropa guardarropas) {
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico()
        .obtenerCondicionesClimaticas(direccion);
    List<Atuendo> combinaciones = guardarropas.sugerirAtuendos();

    return combinaciones.stream()
        .filter(atuendo -> atuendo.aptaParaTemperatura(estadoDelTiempo.temperatura))
        .collect(Collectors.toList())
        .get(0);

  }

}
