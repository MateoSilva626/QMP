public abstract class Uniforme {

  Prenda prendaSup;
  Prenda prendaInf;
  Prenda calzado;

  protected abstract Prenda fabricarParteSuperior();
  protected abstract Prenda fabricarParteInferior();
  protected abstract Prenda fabricarCalzado();


  public void CrearUniforme() {
    this.prendaSup = fabricarParteSuperior();
    this.prendaInf = fabricarParteInferior();
    this.calzado = fabricarCalzado();
  }

}

class UniformeSanJuan extends Uniforme {

  protected Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador();
    borrador.setTipo(TipoDePrenda.CHOMBA);
    borrador.setColorPrincipal(new Color(0,255,0)); // verde :) //convencion rgb 0 a 255
    borrador.setTipoMaterial(Material.TipoMaterial.PIQUE);
    return borrador.crearPrenda();
  }

  protected Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador();
    borrador.setTipo(TipoDePrenda.PANTALON);
    borrador.setColorPrincipal(new Color(156,156,156)); // gris :) //convencion rg
    borrador.setTipoMaterial(Material.TipoMaterial.ACETATO);
    return borrador.crearPrenda();
  }

  protected Prenda fabricarCalzado() {
    Borrador borrador = new Borrador();
    borrador.setTipo(TipoDePrenda.ZAPATO);
    borrador.setColorPrincipal(new Color(255,255,255)); //blanco :)
    borrador.setTipoMaterial(Material.TipoMaterial.CUERO); //AGREGADO PORQUE ESTE CAMPO ES OBLIGATORIO SINO ROMPE:)
    return borrador.crearPrenda();
  }

}

class UniformeJohnston extends Uniforme {

  protected Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador();
    borrador.setTipo(TipoDePrenda.CAMISA);
    borrador.setColorPrincipal(new Color(255,255, 255)); // blanco :)
    borrador.setTipoMaterial(Material.TipoMaterial.ALGODON); //SINO ROMPRE
    return borrador.crearPrenda();
  }

  protected Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador();
    borrador.setTipo(TipoDePrenda.PANTALON);
    borrador.setColorPrincipal(new Color(0,0,0)); // negro :) //convencion rg
    borrador.setTipoMaterial(Material.TipoMaterial.SEDA); //SINO ROMPE
    return borrador.crearPrenda();
  }

  protected Prenda fabricarCalzado() {
    Borrador borrador = new Borrador();
    borrador.setTipo(TipoDePrenda.ZAPATO);
    borrador.setColorPrincipal(new Color(0,0,0)); //blanco :)
    borrador.setTipoMaterial(Material.TipoMaterial.CUERO); //AGREGADO PORQUE ESTE CAMPO ES OBLIGATORIO SINO ROMPE:)
    return borrador.crearPrenda();
  }

}

