class Fabricante {



  Uniforme fabricar(Instituto instituto) {

    return new Uniforme(
        instituto.fabricarParteSuperior(),
        instituto.fabricarParteInferior(),
        instituto.fabricarCalzado()
    );

  }

}