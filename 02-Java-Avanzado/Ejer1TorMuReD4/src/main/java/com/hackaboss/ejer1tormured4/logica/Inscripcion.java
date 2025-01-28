package com.hackaboss.ejer1tormured4.logica;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Inscripcion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  id;
   private LocalDate fecha;
   @OneToOne
   @JoinColumn(name="programador_id")
   private Programador programador;
    
}
