
package Clases;

import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) {
        
        while (true){
            System.out.println("Ingrese 1 para usuarios");
            System.out.println("Ingrese 2 para productos");
            System.out.println("Ingrese 3 para ingresar usuario");
            System.out.println("Ingrese 4 para eliminar usuario");
            System.out.println("Ingrese 5 para buscar usuarios");
            System.out.println("Ingrese 6 para salir");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == 1) {
                long inicio = System.currentTimeMillis();

                Database database = new Database();
                database.leerUsuario();

                long fin = System.currentTimeMillis();

                double tiempo = (double) (fin - inicio);

                System.out.println(tiempo + " milisegundos");
            }
            else if (num == 2) {
                long inicio = System.currentTimeMillis();

                Database database = new Database();
                database.lecturaProducto();

                long fin = System.currentTimeMillis();

                double tiempo = (double) (fin - inicio);

                System.out.println(tiempo + " milisegundos");
            }
            else if (num == 3) {
                long inicio = System.currentTimeMillis();

                Database database = new Database();
                database.agregarUsuario();

                long fin = System.currentTimeMillis();

                double tiempo = (double) (fin - inicio);

                System.out.println(tiempo + " milisegundos");

            }
            else if (num == 4) {
                long inicio = System.currentTimeMillis();

                Database database = new Database();
                database.borrarUsuario();

                long fin = System.currentTimeMillis();

                double tiempo = (double) (fin - inicio);

                System.out.println(tiempo + " milisegundos");
                
            }
            else if (num == 5) {
                long inicio = System.currentTimeMillis();

                Database database = new Database();
                database.buscarUsuario();

                long fin = System.currentTimeMillis();

                double tiempo = (double) (fin - inicio);

                System.out.println(tiempo + " milisegundos");
                
            }
            else{
                break;
            }
            
        }    
    }
}

