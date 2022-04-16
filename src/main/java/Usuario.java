public class Usuario {

    guardarropas = #{}
    atuendos =  #{}

    method cargarPrenda(prenda){
        guardarropas.add(prenda);
    }

    method generarAtuendo(){

        // de alguna manera el usuario genera el atuendo. Lo puede generar el mismo o se genera de manera aleatoria?
        atuendo = codigoGeneradorDeAtuendoPorCriterio(Criterio???);
        this.cargarAtuendo(atuendoGenerado);

    }

    method cargarAtuendo(){
        atuendos.add(prenda);
    }
}
