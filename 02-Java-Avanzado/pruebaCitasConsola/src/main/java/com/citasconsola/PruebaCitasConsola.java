/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.citasconsola;

/**
 *
 * @author IngRosario
 */
import com.citasconsola.logica.*;
import com.citasconsola.persistencia.*;
import java.time.LocalDate;
import java.time.LocalTime;
public class PruebaCitasConsola {

    public static void main(String[] args) {
        
        UsuarioJpaController usu=new UsuarioJpaController();       
        TramiteJpaController tra = new TramiteJpaController();
        CiudadanoJpaController ciu = new CiudadanoJpaController();
        CitaJpaController cita = new CitaJpaController();
        
        Tramite t = tra.findTramite(1L);
        Ciudadano c = ciu.findCiudadano(1L);
        Usuario u = usu.findUsuario(1L);
        
        cita.create(new Cita(0L, LocalDate.of(2025,01, 22), LocalTime.of(5, 12), t, c, u, 0));
        
    }
}
