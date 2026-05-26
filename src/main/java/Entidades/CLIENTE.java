/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author maldo
 */
public class CLIENTE {

    private String Nombre;
    private int cedula;
    private String correo;
    private int telefono;

    public CLIENTE(String Nombre, int cedula, String correo, int telefono) {
        this.Nombre = Nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String Datos_Cliente() {
        return "NOMBRE: " + Nombre + "\n"
                + "CÉDULA: " + cedula + "\n"
                + "CORREO: " + correo + "\n"
                + "TELÉFONO: " + telefono;
    }

}
