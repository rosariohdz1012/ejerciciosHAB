package com.hackaboss.logica;

import com.hackaboss.logica.Ciudadano;
import com.hackaboss.logica.Tramite;
import com.hackaboss.logica.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-01-23T00:21:18")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, LocalDate> fechaCita;
    public static volatile SingularAttribute<Cita, Integer> estado;
    public static volatile SingularAttribute<Cita, LocalTime> horaCita;
    public static volatile SingularAttribute<Cita, Tramite> tramite;
    public static volatile SingularAttribute<Cita, Usuario> usuario;
    public static volatile SingularAttribute<Cita, Long> id;
    public static volatile SingularAttribute<Cita, Ciudadano> ciudadano;

}