package Empresa;

import Clima.Clima;
import QMP5_compartirGuardarropas.PropuestaModificacion;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SugerenciaObserver implements AlertaObserver {



  List<Usuario> usuarios = new ArrayList<>();

  public void setUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }

  public void unsetUsuario(Usuario usuario) {
    usuarios.remove(usuario);
  }

  @Override
  public void notificar(String alerta) {

    usuarios.forEach(usuario -> usuario.sugerirPrendaAUnUsuario(prenda));
  }


  public void anteNuevasAlertasMeteorologicas(List<String> alertasActuales, Usuario usuario) {
    usuario.calcularSugerenciaDiaria();
  }

}
