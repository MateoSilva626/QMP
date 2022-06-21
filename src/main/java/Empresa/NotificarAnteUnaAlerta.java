package Empresa;

public class NotificarAnteUnaAlerta {

  private Map<String, String> mensaje = new HashMap<String, String>() {{
    put(AlertaMeteorologica.TORMENTA, "Hay alerta de tormenta, es recomendable llevar paraguas");
    put(AlertaMeteorologica.GRANIZO, "Hay alerta de granizo, evite salir en auto");
  }};
}
