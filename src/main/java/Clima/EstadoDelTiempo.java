package Clima;

import jdk.nashorn.internal.objects.annotations.Getter;

public class EstadoDelTiempo {

  public int temperatura;

  public int getTemperatura() { return this.temperatura; }

  public EstadoDelTiempo(int temperatura) {
    this.temperatura = temperatura;
  }

}
