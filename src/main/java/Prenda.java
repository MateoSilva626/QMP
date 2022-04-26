import java.util.Objects;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;
  Color color;
  Color colorOpcional;

  public enum Material {
    ALGODON, SEDA, NYLON, LYCRA , LONA,CUERO,POLIAMIDA,SARGA,TEJIDO,ACOLCHADO, LINO,LANA,POLIESTER,SPANDEX,ACRILICO,GORETEX;
  }


//prendaValida(prenda); //este tiene el ultimo requerimiento que una prenda tenga un tipo valido para su categoria

  public Prenda(TipoDePrenda tipo, Material material, Color color, Color colorOpcional) {
    this.tipoDePrenda = Objects.requireNonNull(tipo, "tipo de prenda es obligatorio");
    this.material = Objects.requireNonNull(material, "material es obligatorio");
    this.color = Objects.requireNonNull(color, "color es obligatorio");
    this.colorOpcional = colorOpcional; //puede ser null
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







