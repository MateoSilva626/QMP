import java.util.Objects;

public class Material {

  private Trama trama;
  private TipoMaterial material;

  // private enum Material nombre; -> en caso de que sepamos que los tipos de materiales sea un conjunto finito.
  public enum Trama {
    LISA, RAYADA, CON_LUNARES, A_CUADROS, CON_ESTAMPADO
  }

    public enum TipoMaterial {
      ALGODON,SEDA,NYLON,LYCRA,LONA,CUERO,POLIAMIDA,SARGA,TEJIDO,ACOLCHADO,LINO,LANA,POLIESTER,SPANDEX,ACRILICO,GORETEX,PIQUE,ACETATO;
    }

  public Material(Trama trama, TipoMaterial material) {
    this.trama = trama;
    this.material = material;
  }

}
