/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.syspedidos.dto;

/**
 *
 * @author alum.fial8
 */
public class Cliente {
    private int idcliente;
    private String nombres;
    private String correo;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombres, String correo, String direccion) {
        this.nombres = nombres;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Cliente(int idcliente, String nombres, String correo, String direccion) {
        this.idcliente = idcliente;
        this.nombres = nombres;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
