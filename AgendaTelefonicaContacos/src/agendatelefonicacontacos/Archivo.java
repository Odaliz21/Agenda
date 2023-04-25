/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonicacontacos;



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
                escritura.write(persona.getNombre() + "%" + persona.getCorreo() + "%" + persona.getTelefono() + "%" + persona.getCelular()+"%" + persona.getFechaNacimiento() +"%" + persona.getDireccion() + "%"+ persona.getApellidoMaterno() +"%"+ persona.getApellidoPaterno() +"\r\n");
                escritura.close();
           }catch(IOException e){
               System.out.println(e);
           }
      }
      
}



