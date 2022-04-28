import java.util.Objects;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;

  //prendaValida(prenda); //este tiene el ultimo requerimiento que una prenda tenga un tipo valido para su categoria

  public Prenda(TipoDePrenda tipo, Material.Trama trama, Color colorPrincipal, Color colorSecundario, Material.TipoMaterial material) {
    this.tipoDePrenda = tipo;
    this.material = new Material(trama, colorPrincipal, colorSecundario, material);
  }

  public TipoDePrenda.Categoria categoria() {
    return tipoDePrenda.getCategoria();
  }

}

/*COMENTARIOS A TENER EN CUENTA
 *
 * categoria: parte superior , parte inferior, etc
 *
 * quiero evitar que haya prendas sin tipo, tela, categoría o color primario`
 *
 * esto seria settear el builder con estos atributos
 *
 * El tipoDePrenda seria ej: buzo remera, chaleco, etc
 * */


 /*public void validarTipoPrenda(TipoDePrenda tipoPrenda) {

    if (!tipoPrenda.contains(tipoPrenda)) {
      throw new tipoPrenda(tipoPrenda);
    }
  }*/







