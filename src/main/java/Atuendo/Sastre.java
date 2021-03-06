package Atuendo;

import Atuendo.Atuendo;
import Instituto.Instituto;

public class Sastre {

  Atuendo fabricarUniforme(Instituto instituto) {

    // el uniforme podria ser un atuendo con una lista de tres prendas
    return new Atuendo(
        instituto.fabricarParteSuperior(),
        instituto.fabricarParteInferior(),
        instituto.fabricarCalzado(),
        null
    );
  }
}