/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import vista.Inicio;

/**
 *
 * @author user
 */
public class LoginControler {

    public static void VerificarLogin(String correo, String contraseña) {
        HashMap<String, Usuario> map = Main.mapa;
        System.out.println("Hola");
        if (map.containsKey(correo)) {
            System.out.println("Hola");
            Usuario usuario = map.get(correo);
            System.out.println(contraseña);
            System.out.println(usuario.getContraseña());
            System.out.println("Hola");
            if (contraseña.equals(usuario.getContraseña())) {
                new Inicio().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }

    }

}
