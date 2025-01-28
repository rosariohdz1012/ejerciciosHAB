package com.citasconsola.logica;

import com.citasconsola.logica.Ciudadano;
import com.citasconsola.logica.Tramite;
import com.citasconsola.logica.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-21T17:11:26", comments="EclipseLink-2.7.10.v20211216-rNA")
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