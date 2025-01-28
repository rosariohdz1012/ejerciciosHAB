package com.hackaboss.logica.controladora;

import com.hackaboss.logica.Tramite;
import com.hackaboss.persistencia.controladora.ControladoraPersistenciaTramite;
import java.util.ArrayList;
import java.util.List;

public class ControladoraLogicaTramite {

    ControladoraPersistenciaTramite controlPersis = new ControladoraPersistenciaTramite();

    public Tramite buscarId(Long id) {
        return controlPersis.buscarId(id);
    }

    public void crear(String nombre, String descripcionTra) {
        Tramite t = new Tramite(nombre, descripcionTra);
        controlPersis.crear(t);
    }

    public List<Tramite> listar() {
        return controlPersis.listar();
    }

    public void eliminar(Long id) {
        controlPersis.eliminar(id);
    }

    public void editar(Tramite t) {
        controlPersis.editar(t);
    }
    
    public ArrayList<Tramite> buscarTramite (String buscarTramite){
       //estoy haciendo el filtrado en la LOGICA
       //esto es MENOS eficiente que si lo hago en la BD
       ArrayList<Tramite> tramitesCoincidentes = new ArrayList<>();
              List<Tramite> listaTramites = controlPersis.traerTramite();

              for (Tramite t : listaTramites) {
                  if (t.getNombre().equals(buscarTramite)) {
                      tramitesCoincidentes.add(t);
                  }
                   }
              return tramitesCoincidentes;

       
   }

}
