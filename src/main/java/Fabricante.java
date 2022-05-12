class Fabricante {



  Uniforme fabricar(Instituto instituto) {

    return new Uniforme(
        instituto.fabricarParteSuperior(),
        instituto.fabricarParteInferior(),
        instituto.fabricarCalzado()
    );

  }

}


//el fabricante es un sastre enrealidad que puede: fabricarUniforme(recibe instituto) y sugerirAtuendos(recibe un guardarropas)
//siendo que ademas los unifiormes y atuendos son muy parecidos
//a su vez el uniforme es un tipo de atuendo
//basicamente agregamos al factory de uniforme to.do lo de atuendos para el usuario