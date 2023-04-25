//Hola como están

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajoagendass;

/**
 *
 * @author Usuario
 */
import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {
      File archivo;
    
      public void crearArchivo() {
        try {
            archivo = new File("AgendaContactos.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo(Persona persona){
           try{
                FileWriter escritura = new FileWriter(archivo, true);
                escritura.write(persona.getNombre() + "%" + persona.getCorreo() + "%" + persona.getTelefono() + "%" + persona.getCelular()+"%" + persona.getFechaNacimiento() +"%" + persona.getDireccion() + "%"+ persona.getApellidoMaterno() +"%"+ persona.getApellidoPaterno() +"%"+ persona.getGenerF() +"%"+ persona.getGenerM()+"\r\n");
                escritura.close();
           }catch(IOException e){
               System.out.println(e);
           }
      }
      
}

