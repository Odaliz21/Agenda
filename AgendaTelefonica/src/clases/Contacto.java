/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class Contacto {
    private int codigo;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String fechanacimiento;
    private String correo;
    private String direccion;
    
    
    
    private ArrayList<Numero> numeros;

    public Contacto() {
        numeros = new ArrayList();
    }

    public Contacto(int codigo,String nombre, String apellidopaterno,String apellidomaterno,String fechanacimiento,String correo,String direccion, ArrayList<Numero> numeros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechanacimiento = fechanacimiento;
        this.correo = correo;
        this.direccion = direccion;
        this.numeros = numeros;
    }

    public Contacto(int codigo, String nombre, String apellidopaterno,String apellidomaterno,String fechanacimiento,String correo,String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechanacimiento = fechanacimiento;
        this.correo = correo;
        this.direccion = direccion;
        numeros = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }
    
     public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }
    
     public String getfechanacimiento() {
        return fechanacimiento;
    }

    public void setfechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

      public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

      public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }

    
    
    
    
}
