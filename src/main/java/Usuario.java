import sun.java2d.pisces.PiscesRenderingEngine;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

  Set<Prenda> guardarropa = new HashSet<Prenda>();
  Sastre unSastre;

  public void cargarPrenda(Prenda nuevaPrenda) {
    guardarropa.add(nuevaPrenda);
  }

  public Atuendo recibirSugerencia() {
    unSastre.sugerenciaVestirCompleto(guardarropa);
  }

  public Atuendo recibirSugerenciaSinSuperPosiciones() {
    unSastre.sugerenciaVestirCompleto(guardarropa);
  }

  public Atuendo recibirSugerenciaConAcesorios() {

  }

  public Set<Atuendo> recibirSugerencias() {

  }


}
