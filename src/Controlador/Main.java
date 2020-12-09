/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.File;
import java.util.HashMap;
import vista.Login;

public class Main {

    public static boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }
    public static HashMap<String,Usuario> mapa = null;
    public static void main(String[] args) {
         
        System.out.println("Finalizacion Carga De Datos");
        String filePath = "BaseDatosU.ser";
        File file = new File(filePath);

        if (isFileExists(file)) {
            System.out.println("File exists!! Cargando serializable");
            mapa = Database.DeserializarHash();
        } else {
            mapa = Database.CreateHash();
            
        }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        }); 

    //LoginControler.VerificarLogin("BushStephens@unal.edu.co","4649930");        
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
