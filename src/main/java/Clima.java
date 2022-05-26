
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Clima  {

  AccuWeatherAPI apiClima = new AccuWeatherAPI();

  List<Map<String, Object>> condicionesClimaticas;

  //hay que poner que cada prenda o cada guardarropa tenga su ciudad
  public Clima(String ciudad) {
    this.condicionesClimaticas = apiClima.getWeather(ciudad);
  }

  public Object precipitacion() {
    return condicionesClimaticas.get(0).get("PrecipitationProbability");
  }

  public int temperatura() {
    return condicionesClimaticas.get(0).get("Temperature").hashCode();
  }

  public double temperaturaCelcius() {
    return (this.temperatura() - 32) * (5/9);
  }
}
