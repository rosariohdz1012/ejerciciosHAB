/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackaboss.ejer1tormured4.logica;

/**
 *
 * @author IngRosario
 */
public class Programador {
    private Long id;
    private String nombre;
    private String apelido;
    private String nivelAcademico;
    

    public Programador(Long id, String nombre, String apelido, String nivelAcademico) {
        this.id = id;
        this.nombre = nombre;
        this.apelido = apelido;
        this.nivelAcademico = nivelAcademico;
    }

    public Programador(String nombre, String apelido, String nivelAcademico) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.nivelAcademico = nivelAcademico;
    }

    public Long getId() {
        return id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    
       
    
    
    
    
    
}
