/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import vista.Inicio;

// Clase principal iniciadora del programa ejemplo aprenderaprogramar.com
public class Database {

    /*
    static final String DB_URL
            = "jdbc:mysql://localhost:3306/estructurasdedatos?useSSL=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "MysqL";

    public void lecturaUsuario() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            resultSet = null;
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Usuarios ");
            NodeGeneric < String > head,newN,ref;
            head = null;
            while (resultSet.next()) {
                String suma = "";
                suma += resultSet.getString(1) + ";";
                suma += resultSet.getString(2) + ";";
                suma += resultSet.getString(3) + ";";
                suma += resultSet.getString(4) + ";";
                suma += resultSet.getString(5) + ";";
                suma += resultSet.getString(6) + ";";
                suma += resultSet.getString(7);
                
                newN = new NodeGeneric < String > (suma);
                newN.setNext(head);
                head = newN;
                /*stack.push(suma);
                System.out.println(stack.pop());*/
 /*}
            ref = head;
            int i = 0;
            while(i<85 && ref != null) {
                i++;
                System.out.println(ref.getData());
                ref = ref.getNext();
            }

            
            /*10000;Muriel;MurielLangley@unal.edu.co;+57 (809) 596-4000;397 Channel Avenue, Bogotá, Bogota D.C., 4421;2014-01-20T11:34:23 +05:00;Ingenieria*/
 /*listarray.search("99999;Kirsten;KirstenRivas@unal.edu.co;+57 (892) 402-3415;463 Adler Place, Bogotá, Bogota D.C., 3104;2014-05-24T11:00:45 +05:00;Ciencias-Economicas");
            /*listarray.search("50000;Merle;MerleRobles@unal.edu.co;+57 (826) 513-3942;333 Matthews Place, Bogotá, Bogota D.C., 2863;2019-07-09T06:51:18 +05:00;Humanas");
            /*listarray.delete("0;England;EnglandKeith@unal.edu.co;+57 (810) 576-3028;937 Bridge Street, Bogotá, Bogota D.C., 6864;2019-11-11T12:27:54 +05:00;Ciencias-Economicas");
            /*System.out.println("Carga");
            while (!queue.empty()) {
                queue.dequeue();
            }*/ /*
        } catch (SQLException ex) {
            System.out.println("Error en SQL" + ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException ex) {

            }
        }
    }
     */
    //Leer csv sin Hash
    /*public  void LeerCsv(String path, String Correo, String ID){
        BufferedReader buff = null;
        String line = "";
        String delimiter = ",";
        try {
            buff = new BufferedReader(new FileReader(path));
            while ((line = buff.readLine()) != null){
                String [] file = line.split(delimiter);
                System.out.println("usuario");
                if (file[3].equals(Correo) && file[1].equals(ID)){
                    new Inicio().setVisible(true);
            }    
            }
            }catch (FileNotFoundException e){
                    e.printStackTrace();                   
            } catch (IOException e){
                    e.printStackTrace();
                         }
            }*/
    public static HashMap<String,Usuario> CreateHash() {
        String path = "C:\\Users\\user\\Desktop\\UNAL\\CUARTO-SEMESTRE\\ESTRUCTURAS\\prueba.csv";
        try {
            BufferedReader lineRead = new BufferedReader(new FileReader(path));
            CSVParser records = CSVParser.parse(lineRead, CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            HashMap<String, Usuario> UserHash = new HashMap<>(); //cambiarle string
            for (CSVRecord record : records) {
                Usuario usuario = new Usuario();
                usuario.setNombre(record.get(0));
                //System.out.println(record.get(0));
                usuario.setContraseña(record.get(1));
                usuario.setCorreo(record.get(2));
                usuario.setTelefono(record.get(3));
                usuario.setDireccion(record.get(4));
                usuario.setFacultad(record.get(6));
                UserHash.put(record.get(2), usuario); //aca esta la llave
                //System.out.println("Usuario ingresado - Espere un poco");
                System.out.println(usuario.toString());
                System.out.println(UserHash.get(usuario.getCorreo()));
                break;
            }
            SerializarHash(UserHash);
            System.out.println("creacion del hash finalizada");
            return UserHash;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public static void SerializarHash(HashMap<String,Usuario> serial){
           try
           {
                  FileOutputStream fos = new FileOutputStream("BaseDatosU.ser");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);
                  oos.writeObject(serial);
                  oos.close();
                  fos.close();
                  System.out.printf("Serialized HashMap data is saved in BaseDatosU.ser");
           }catch(IOException ioe)
            {
                  ioe.printStackTrace();
            }
              
    }
    public static HashMap<String,Usuario> DeserializarHash(){
      HashMap<String,Usuario> map = null;
      try
      {
         FileInputStream fis = new FileInputStream("BaseDatosU.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);
         map = (HashMap) ois.readObject();
         ois.close();
         fis.close();
/*         map.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " = " + entry.getValue()); 
            }); */
         return map;
      }catch(IOException ioe)
      {
         ioe.printStackTrace();
         return null;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Class not found");
         c.printStackTrace();
         return null;
      }    
    }
    //Leer csv con Hash


}

class StackGeneric<T> {

    private static final int N = 3;
    private int top;
    private T[] sarray;
    // constructors

    public StackGeneric() {
        this(N);
    }

    public StackGeneric(int n) {
        top = 0;
        sarray = (T[]) new Object[n];
    }
    // value returning methods

    public boolean empty() {
        return top <= 0;
    }

    public boolean full() {
        return top >= sarray.length;
    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        top--;
        return sarray[top];
    }
    // void method

    public void push(T item) {
        if (full()) {
            throw new RuntimeException("Stack is full");
        }
        sarray[top] = item;
        top++;
    }
}

class QueueArrayGeneric<T> {

    private final int N = 100000;
    private int front, rear, count;
    private T[] qarray;

    public QueueArrayGeneric() {
        front = rear = count = 0;
        qarray = (T[]) new Object[N];
    }

    public T dequeue() {
        T item = null;
        if (empty()) {
            System.out.println("Queue is empty: item not dequeued");
        } else {
            item = qarray[front];
            front = (front + 1) % N;
            count--;
        }
        return item;
    }

    public void enqueue(T item) {
        if (full()) {
            System.out.println("Queue is full: item not enqueued");
        } else {
            qarray[rear] = item;
            rear = (rear + 1) % N;
            count++;
        }
    }

    public boolean empty() {
        return count <= 0;
    }

    public boolean full() {
        return count >= N;
    }

    public int getCount() {
        return count;
    }
}

class ListArrayGeneric<T extends Comparable<T>> {

    private final int N = 100000;
    private int position, count;
    private T[] lArray;
    T reference;

    public ListArrayGeneric() {
        count = 0;
        lArray = (T[]) new Comparable[N];
    }

    private boolean empty() {
        return count <= 0;
    }

    private boolean full() {
        return count >= N;
    }

    public boolean insert(T item) {
        boolean inserted = false;
        if (!full()) {
            if (!search(item)) {
                for (int j = count; j > position; j--) {
                    lArray[j] = lArray[j - 1];
                }
                lArray[position] = item;
                count++;
                inserted = true;
            } else {
                System.out.println("List is Full");
            }
        }
        return inserted;
    }

    public boolean delete(T item) {
        boolean deleted = false;
        if (!empty()) {
            if (search(item)) {
                for (int j = position; j < count - 1; j++) {
                    lArray[j] = lArray[j + 1];
                }
                count--;
                deleted = true;
            } else {
                System.out.println("List is Empty");
            }
        }
        return deleted;
    }

    public boolean search(T item) {
        boolean found, stop;
        found = false;
        stop = false;
        position = 0;
        while (position != count && !stop) {
            if (lArray[position].compareTo(item) >= 0) {
                stop = true;
                if (lArray[position].compareTo(item) == 0) {
                    found = true;
                }
            } else {
                position++;
            }
        }
        return found;
    }

    public void output() {
        System.out.print("List: ");
        int j = 0;
        while (j != count) {
            System.out.print(lArray[j] + " ");
            j++;
        }
        System.out.println();
    }

    public int compareTo(T item) {
        int result;
        if (reference.compareTo(item) > 0) {
            result = 1;
        } else if (reference.compareTo(item) < 0) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}

/*    public class NodeGeneric<T> {

        private T data;
        private NodeGeneric<T> next;

        public NodeGeneric() {
            this(null);
        }

        public NodeGeneric(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public NodeGeneric getNext() {
            return next;
        }

        public void setNext(NodeGeneric<T> next) {
            this.next = next;
        }
    }
 */
