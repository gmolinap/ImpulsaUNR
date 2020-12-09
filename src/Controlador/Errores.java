/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author user
 */
public class Errores extends Exception
    {

   public Errores ()
   {
      super ();
   }

   public Errores (String message)
   {
      super (message);
   }

   public Errores (Throwable cause)
   {
      super (cause);
   }

   public Errores (String message, Throwable cause)
   {
      super (message, cause);
   }
}
