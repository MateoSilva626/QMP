import java.util.HashSet;
import java.util.Set;

public class Sastre {

  Uniforme fabricarUniforme(Instituto instituto) {

    // el uniforme podria ser un atuendo con una lista de tres prendas
    return new Uniforme(
        instituto.fabricarParteSuperior(),
        instituto.fabricarParteInferior(),
        instituto.fabricarCalzado()
    );
  }


  Atuendo sugerirAtuendo(Sugerencia sugerencia,Set<Prenda> guardarropas) {

    //idea PIPE chequear constructor Atuendo
    Set<Prenda> prendasSugeridas= new HashSet<>();
    prendasSugeridas.addAll(sugerencia.sugerirParteSuperior(new Clima(), guardarropas));
    prendasSugeridas.addAll(sugerencia.sugerirParteInferior(new Clima(), guardarropas));
    prendasSugeridas.addAll(sugerencia.sugerirCalzado(new Clima(), guardarropas));
    prendasSugeridas.addAll(sugerencia.sugerirAccesorios(new Clima(), guardarropas));
    return new Atuendo(prendasSugeridas);

    //segunda idea
    //return new Atuendo(sugerencia.sugerirAtuendo(new Clima(), guardarropas));
  }

  //todo
  Set<Atuendo> sugerirAtuendos(Sugerencia sugerencia, Set<Prenda> guardarropas, Integer cantidad) {
    Set<Atuendo> atuendos = new HashSet<>();

    for (int i = 0; i < cantidad; i++) {
      atuendos.add(this.sugerirAtuendo(sugerencia, guardarropas));
    }

    return atuendos;
  }
}