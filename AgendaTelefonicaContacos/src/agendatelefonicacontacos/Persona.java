/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonicacontacos;

public class Persona {
     
     private String nombre;
     private String ApellidoPaterno;
     private String ApellidoMaterno;
     private String FechaNacimiento;
     private String Correo;
     private String Direccion;
     private String telefono;
     private String celular;
     
     
     
     

    public Persona(String nombre, String Correo, String telefono,String celular,String FechaNacimiento, String Direccion , String ApellidoMaterno, String ApellidoPaterno  ) {
        this.nombre = nombre;
        this.ApellidoMaterno  = ApellidoMaterno;
        this.ApellidoPaterno  = ApellidoPaterno ;
        this.FechaNacimiento  = FechaNacimiento;
        this.Correo = Correo;
        this.Direccion  = Direccion;
        this.telefono = telefono;
        this.celular = celular;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setfechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
        public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
            public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }
            public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }
}


