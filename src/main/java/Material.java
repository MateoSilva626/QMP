import java.util.Objects;

public class Material {

  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;
  private String nombre;

  // private enum Material nombre; -> en caso de que sepamos que los tipos de materiales sea un conjunto finito.
  public enum Trama {
    LISA, RAYADA, CON_LUNARES, A_CUADROS, CON_ESTAMPADO
  }

  //  public enum Material {
  //    ALGODON, SEDA, NYLON, LYCRA , LONA,CUERO,POLIAMIDA,SARGA,TEJIDO,ACOLCHADO, LINO,LANA,POLIESTER,SPANDEX,ACRILICO,GORETEX;
  //  }

  public Material(Trama trama, Color colorPrincipal, Color colorSecundario, String nombre) {
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.nombre  = nombre;
  }

}
