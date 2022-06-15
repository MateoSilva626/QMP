import Prenda.Prenda;
import Prenda.Borrador;
import Prenda.TipoDePrenda;
import Prenda.Color;
import Prenda.Material;
public interface Instituto {

  Prenda fabricarParteSuperior();
  Prenda fabricarParteInferior();
  Prenda fabricarCalzado();

  class InstitutoSanJuan implements Instituto {

    public Prenda fabricarParteSuperior() {
      Borrador borrador = new Borrador();
      borrador.setTipo(TipoDePrenda.CHOMBA);
      borrador.setColorPrincipal(new Color(0, 255, 0)); // verde :) //convencion rgb 0 a 255
      borrador.setTipoMaterial(Material.TipoMaterial.PIQUE);
      return borrador.crearPrenda();
    }

    public Prenda fabricarParteInferior() {
      Borrador borrador = new Borrador();
      borrador.setTipo(TipoDePrenda.PANTALON);
      borrador.setColorPrincipal(new Color(156, 156, 156)); // gris :) //convencion rg
      borrador.setTipoMaterial(Material.TipoMaterial.ACETATO);
      return borrador.crearPrenda();
    }

    public Prenda fabricarCalzado() {
      Borrador borrador = new Borrador();
      borrador.setTipo(TipoDePrenda.ZAPATO);
      borrador.setColorPrincipal(new Color(255, 255, 255)); //blanco :)
      borrador.setTipoMaterial(Material.TipoMaterial.CUERO); //AGREGADO PORQUE ESTE CAMPO ES OBLIGATORIO SINO ROMPE:)
      return borrador.crearPrenda();
    }
  }

  class InstitutoJohnston implements Instituto {

    public Prenda fabricarParteSuperior() {
      Borrador borrador = new Borrador();
      borrador.setTipo(TipoDePrenda.CAMISA);
      borrador.setColorPrincipal(new Color(255, 255, 255)); // blanco :)
      borrador.setTipoMaterial(Material.TipoMaterial.ALGODON); //SINO ROMPRE
      return borrador.crearPrenda();
    }

    public Prenda fabricarParteInferior() {
      Borrador borrador = new Borrador();
      borrador.setTipo(TipoDePrenda.PANTALON);
      borrador.setColorPrincipal(new Color(0, 0, 0)); // negro :) //convencion rg
      borrador.setTipoMaterial(Material.TipoMaterial.SEDA); //SINO ROMPE
      return borrador.crearPrenda();
    }

    public Prenda fabricarCalzado() {
      Borrador borrador = new Borrador();
      borrador.setTipo(TipoDePrenda.ZAPATO);
      borrador.setColorPrincipal(new Color(0, 0, 0)); //blanco :)
      borrador.setTipoMaterial(Material.TipoMaterial.CUERO); //AGREGADO PORQUE ESTE CAMPO ES OBLIGATORIO SINO ROMPE:)
      return borrador.crearPrenda();
    }

  }
}