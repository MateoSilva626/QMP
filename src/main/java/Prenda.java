
public class Prenda {

    //quiero evitar que haya prendas sin tipo, tela, categoría o color primario`
    //esto seria settear el builder con estos atributos


    constructor(tipo,tela,categoria,colorPrimario) {
        prendaValida(prenda); //este tiene el ultimo requerimiento que una prenda tenga un tipo valido para su categoria
        this.tipoPrenda = tipoPrenda;
        this.tela = tela;
        this.categoria = categoria;
        this.colorPrimario = colorPrimario;
    }

    validarTipoPrenda(tipoPrenda){
        if ( !tiposDePrendaValidos.contains(tipoPrenda) )
            throw new TipoPrendaInvalidoException(tipoPrenda);
    }



    colorPrincipal;
    colorSecundario;
    material;
    categoria;  //la categoria: parte superior , parte inferior, etc
    tipo;        //El tipo seria ej: buzo remera, chaleco, etc


    method categoria(){return categoria}


}
