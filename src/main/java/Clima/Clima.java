package Clima;

import implementacionAccuWeather.AccuWeatherAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class Clima {
  private Map<String, Object> ultimaRespuesta;
  private LocalDateTime proximaExpiracion;
  private EstadoDelTiempo estadoDelTiempo;

  public AccuWeatherAPI apiClima;
  public Duration periodoDeValidez;
  public String ciudad;

  public Clima(AccuWeatherAPI api, Duration periodoDeValidez, String ciudad) {
    this.apiClima = api;
    this.periodoDeValidez = periodoDeValidez;
    this.ciudad = ciudad;
  }
  /*
  public Map<String, Object> obtenerCondicionesClimaticasV2() {
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = apiClima.getWeather(ciudad).get(0);
      this.proximaExpiracion = LocalDateTime.now().plus(this.periodoDeValidez);
    }
    return this.ultimaRespuesta;
  }
*/
  public EstadoDelTiempo obtenerCondicionesClimaticas() {
    int temperatura;
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = apiClima.getWeather(ciudad).get(0);
      this.proximaExpiracion = LocalDateTime.now().plus(this.periodoDeValidez);
      temperatura = (int) ultimaRespuesta.get("Temperatura").get("Value");
      estadoDelTiempo = new EstadoDelTiempo(temperatura);
    }

    return estadoDelTiempo;
  }
  private boolean expiro() {

    return proximaExpiracion.isAfter(LocalDateTime.now());
  }

/*
  AccuWeatherAPI apiClima = new AccuWeatherAPI();

  List<Map<String, Object>> condicionesClimaticas;

  //hay que poner que cada prenda o cada guardarropa tenga su ciudad
  public Clima.Clima(String ciudad) {
    this.condicionesClimaticas = apiClima.getWeather(ciudad);
  }

  public Object precipitacion() {
    return condicionesClimaticas.get(0).get("PrecipitationProbability");
  }

  public Temperatura temperatura() {
    return new Temperatura(, ,condicionesClimaticas.get(0).get("Temperature"));
  }

  public double temperaturaCelcius() {
    return (this.temperatura() - 32) * (5 / 9);
  }


 */
}
