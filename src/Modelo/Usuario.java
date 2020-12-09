/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Errores;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class Usuario implements Serializable {
    private static final long serialVersionUID = -299482035708790407L;

    private String Correo;
    private String nombre;
    private int ID;
    private String telefono;
    private String Contraseña;
    private String facultad;
    private String Direccion;

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Usuario(String Correo, String nombre, int ID, String telefono, String Contraseña, String facultad, String Direccion) {
        this.Correo = Correo;
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.Contraseña = Contraseña;
        this.facultad = facultad;
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    public Usuario (){
       nombre = "";
       ID = 0;
    }
    public Usuario (String nombre, int ID){
       this.nombre = nombre;
       this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Correo=" + Correo + ", nombre=" + nombre + ", ID=" + ID + ", telefono=" + telefono + ", Contrase\u00f1a=" + Contraseña + ", facultad=" + facultad + ", Direccion=" + Direccion + '}';
    }

    }


