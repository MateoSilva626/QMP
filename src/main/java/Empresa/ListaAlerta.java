package Empresa;

import Clima.Clima;
import Usuario.Usuario;
import javafx.scene.control.Alert;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaAlerta {

  List<String> alertas = new ArrayList<>();
  List<AlertaObserver> observers = new ArrayList<>();


  public void setObserver(AlertaObserver observer) {
    observers.add(observer);
  }
  public void unsetObserver(AlertaObserver observer) {
    observers.remove(observer);
  }
  public void agregarAlerta(String alerta) {
    this.alertas.add(alerta);
  }
  public void agregarAlertas(List<String> alertas) {
    this.alertas.addAll(alertas);
  }
  public void unsetAlerta(Clima clima) {
    alertas.remove(clima);
  }
  public void notificarAlerta(String alerta){ // уведомлять
   this.agregarAlerta(alerta);
   observers.forEach(observer -> observer.notificar(alerta));
  }

}