public class TipoDePrenda {

  Categoria categoria;

  public enum Categoria {
    PARTE_SUPERIOR,
    CALZADO,
    PARTE_INFERIOR,
    ACCESORIOS
  }

  public enum tipo {
    REMERA,
    PANTALON,
    POLLERA,
    CAMISA_MANGA_LARGA,
    CAMISA_MANGO_CORTA,
    ZAPATOS,
    BOTAS,
    ZAPATILLAS,
    ACCESORIOS
  }

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

  //vemos donde va
  //static final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
}

