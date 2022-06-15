package Prenda;

public class TipoDePrenda {

  Categoria categoria;

  public enum Categoria {
    PARTE_SUPERIOR,
    CALZADO,
    PARTE_INFERIOR,
    ACCESORIOS
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

  //SE DEJAN ACA POR CONVENIENCIA??
  public static final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
  public static final TipoDePrenda CHOMBA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda CAMISA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  // por QMP3 pero tenemos dudas che esto no va por la correccion que nos hicieron de la entrega pasada:
  //  https://github.com/MateoSilva626/QMP/issues/3
  public static final TipoDePrenda ATEOJOSDESOL = new TipoDePrenda(Categoria.ACCESORIOS);
  public static final TipoDePrenda GUANTES = new TipoDePrenda(Categoria.ACCESORIOS);
  public static final TipoDePrenda GORRO = new TipoDePrenda(Categoria.ACCESORIOS);
  public static final TipoDePrenda BUFANDA = new TipoDePrenda(Categoria.ACCESORIOS);

}