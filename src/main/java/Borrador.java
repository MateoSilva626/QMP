import java.util.Objects;

public class Borrador {

  TipoDePrenda tipo;
  Material.Trama trama = Material.Trama.LISA;
  Color colorPrincipal;
  Color colorSecundario;
  String nombre;

  public void setColorPrincipal(Color colorPrincipal) {
    this.colorPrincipal = Objects.requireNonNull(colorPrincipal, "Color principal es obligatorio");
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setNombre(String nombre) {
    this.nombre = Objects.requireNonNull(nombre, "Nombre es obligatorio");
  }

  public void setTipo(TipoDePrenda tipo) {
    this.tipo = Objects.requireNonNull(tipo, "tipo de prenda es obligatorio");
  }

  public void setTrama(Material.Trama trama) {

    if (trama != null) {
      this.trama = trama;
    }

  }

  public Prenda crearPrenda() {

    //hay que hacer un if dependiendo de si el colorSec es null. Si lo es, tenemos que usar otra
      return new Prenda(tipo, trama, colorPrincipal, colorSecundario, nombre);

  }

}


