public class TipoDePrenda {

  Categoria categoria;

  public enum Categoria {
    PARTE_SUPERIOR,
    CALZADO,
    PARTE_INFERIOR,
    ACCESORIOS
  }

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

  //SE DEJAN ACA POR CONVENIENCIA??
  static final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
  static final TipoDePrenda CHOMBA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  static final TipoDePrenda CAMISA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
}

