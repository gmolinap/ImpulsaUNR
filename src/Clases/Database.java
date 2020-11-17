package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class Database {

    static final String DB_URL
            = "jdbc:mysql://localhost:3306/estructurasdedatos?useSSL=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "MysqL";

    public void leerUsuario() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            resultSet = null;
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Usuarios ");
            //NodeGeneric< String> head, newN, ref;
            //head = null;
            //StackGeneric <String> stack =  new StackGeneric<String>(100000);
            BinarySearchTree tree = new BinarySearchTree();
            int i = 0;
            while (i<100000 && resultSet.next()) {
                i++;
                String suma = "";
                suma += resultSet.getString(1) + ";";
                suma += resultSet.getString(2) + ";";
                suma += resultSet.getString(3) + ";";
                suma += resultSet.getString(4) + ";";
                suma += resultSet.getString(5) + ";";
                suma += resultSet.getString(6) + ";";
                suma += resultSet.getString(7);
                
                tree.insertBST(suma);
            }
            tree.traverseBST();
                
                
                //stack.push(suma);
                /*newN = new NodeGeneric< String>(suma);
                newN.setNext(head);
                head = newN;*/
            
            //while(!stack.empty()){
                //System.out.println(stack.pop());
            //}
            /*ref = head;
            if (ref.Delete(head, "50000;Merle;MerleRobles@unal.edu.co;+57 (826) 513-3942;333 Matthews Place, Bogotá, Bogota D.C., 2863;2019-07-09T06:51:18 +05:00;Humanas")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            ref = head;
            int i = 0;
            while(ref != null) {
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
            }*/
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
    
    public void agregarUsuario() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            //Scanner sc = new Scanner(System.in);
            //int num1 = sc.nextInt();
            //String num2 = sc.nextLine();
            //String num3 = sc.nextLine();
            //String num4 = sc.nextLine();
            //String num5 = sc.nextLine();
            //String num6 = sc.nextLine();
            //String num7 = sc.nextLine();
            // statement.executeUpdate("INSERT INTO usuarios VALUES (" + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6 + "," + num7 + ")");
            statement.executeUpdate("INSERT INTO usuarios VALUES (100000,'a','b','c','d','e','f')");
            //NodeGeneric< String> head, newN, ref;
            //head = null;
            //StackGeneric <String> stack =  new StackGeneric<String>(100000);
        } catch (SQLException ex) {
            System.out.println("Error en SQL" + ex);
        } finally {
            try {
                statement.close();
                connection.close();

            } catch (SQLException ex) {

            }
        }
    }
   
    public void borrarUsuario() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            //Scanner sc = new Scanner(System.in);
            //int num1 = sc.nextInt();
            //String num2 = sc.nextLine();
            //String num3 = sc.nextLine();
            //String num4 = sc.nextLine();
            //String num5 = sc.nextLine();
            //String num6 = sc.nextLine();
            //String num7 = sc.nextLine();
            // statement.executeUpdate("INSERT INTO usuarios VALUES (" + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6 + "," + num7 + ")");
            statement.executeUpdate("DELETE FROM usuarios WHERE usuarios.index=100000");
            //NodeGeneric< String> head, newN, ref;
            //head = null;
            //StackGeneric <String> stack =  new StackGeneric<String>(100000);
        } catch (SQLException ex) {
            System.out.println("Error en SQL" + ex);
        } finally {
            try {
                statement.close();
                connection.close();

            } catch (SQLException ex) {

            }
        }
    }
    
    public void buscarUsuario() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            resultSet = null;
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Usuarios ");
            //NodeGeneric< String> head, newN, ref;
            //head = null;
            //StackGeneric <String> stack =  new StackGeneric<String>(100000);
            BinarySearchTree tree = new BinarySearchTree();
            int i = 0;
            while (i<10 && resultSet.next()) {
                i++;
                String suma = "";
                suma += resultSet.getString(2);
                tree.insertBST(suma);
            }
            tree.SearchBST("Sosa");
            //Scanner sc = new Scanner(System.in);
            //String string = sc.nextLine();
            //tree.SearchBST(string);
            
                
                
                //stack.push(suma);
                /*newN = new NodeGeneric< String>(suma);
                newN.setNext(head);
                head = newN;*/
            
            //while(!stack.empty()){
                //System.out.println(stack.pop());
            //}
            /*ref = head;
            if (ref.Delete(head, "50000;Merle;MerleRobles@unal.edu.co;+57 (826) 513-3942;333 Matthews Place, Bogotá, Bogota D.C., 2863;2019-07-09T06:51:18 +05:00;Humanas")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            ref = head;
            int i = 0;
            while(ref != null) {
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
            }*/
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
    
    public void lecturaProducto() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            resultSet = null;
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Productos ");
            //NodeGeneric< String> head, newN, ref;
            //head = null;
            //StackGeneric <String> stack =  new StackGeneric<String>(100000);
            BinarySearchTree tree = new BinarySearchTree();
    
            while (resultSet.next()) {

                String suma = "";
                suma += resultSet.getString(1) + ";";
                suma += resultSet.getString(2) + ";";
                suma += resultSet.getString(3) + ";";
                suma += resultSet.getString(4) + ";";
                suma += resultSet.getString(5);
                
                tree.insertBST(suma);
            }
            tree.traverseBST();
            

            
                
                
                //stack.push(suma);
                /*newN = new NodeGeneric< String>(suma);
                newN.setNext(head);
                head = newN;*/
            
            //while(!stack.empty()){
                //System.out.println(stack.pop());
            //}
            /*ref = head;
            if (ref.Delete(head, "50000;Merle;MerleRobles@unal.edu.co;+57 (826) 513-3942;333 Matthews Place, Bogotá, Bogota D.C., 2863;2019-07-09T06:51:18 +05:00;Humanas")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            ref = head;
            int i = 0;
            while(ref != null) {
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
            }*/
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

    public class NodeGeneric<T> {

        protected T data;
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

    public class LinkedListGeneric<T extends Comparable<T>> {

        protected NodeGeneric<T> head;

        public LinkedListGeneric() {
            head = null;
        }

        public boolean insert(T item) {
            boolean inserted;
            NodeGeneric<T> ptr, prev;
            inserted = false;
            ptr = head;
            prev = null;
            while (ptr != null && ptr.getData().compareTo(item) < 0) {
                prev = ptr;
                ptr = ptr.getNext();
            }
            if (ptr == null || !(ptr.getData().equals(item))) {
                inserted = true;
                NodeGeneric<T> newp = new NodeGeneric();
                newp.setData(item);
                newp.setNext(ptr);
                if (prev == null) {
                    head = newp;
                } else {
                    prev.setNext(newp);
                }
            }
            return inserted;
        }

        public boolean delete(T item) {
            boolean deleted = false;
            NodeGeneric<T> ptr, prev;
            return deleted;
        }

        public void printRecursive() {
            System.out.print("List Recursive: ");
            printR(head);
            System.out.println();
        }

        private void printR(NodeGeneric<T> p) {
            while(p.next != null){
                System.out.println(p.data);
                p = p.next;
            }
        }
    }
}


class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insertBST(String value) {
        root = insert(value, root);
    }

    Node insert(String value, Node p) {
        if (p == null) {
            p = new Node(value);
        } else if (value.compareTo(p.data) < 0) {
            p.left = insert(value, p.left);
        } else if (value.compareTo(p.data) > 0) {
            p.right = insert(value, p.right);
        //} else {
            //System.out.println("Item in tree and not inserted.");
        }
        return p;
    }

    void removeBST(String value) {
        root = remove(value, root);
    }

    Node remove(String value, Node p) {
        if (p != null) {
            if (value.compareTo(p.data) < 0) {
                p.left = remove(value, p.left);
            } else if (value.compareTo(p.data) > 0) {
                p.right = remove(value, p.right);
            } else if (p.left == null && p.right == null) {
                p = null;
            } else if (p.left == null) {
                p = p.right;
            } else if (p.right == null) {
                p = p.left;
            } else {
                Node t = findMin(p.right);
                p.data = t.data;
                p.right = remove(p.data, p.right);
            }
        } else {
            System.out.println("Item not in tree and not removed");
        }
        return p;
    }

    Node findMin(Node p) {
        if (p != null) {
            while (p.left != null) {
                p = p.left;
            }
        }
        return p;

    }

    void traverseBST() {
        System.out.print("The tree is:");
        if (root != null) {
            traverse(root);
        } else {
            System.out.print(" " + "Empty");
            System.out.println();
        }
    }

    void traverse(Node ptr) {
        if (ptr.left != null) {
            traverse(ptr.left);
        }
        System.out.println(" " + ptr.data);
        if (ptr.right != null) {
            traverse(ptr.right);
        }
    }

//Inner Class: Node
    class Node {

        Node left;
        String data;
        Node right;

        Node() {
            this("");
        }

        Node(String data) {
            left = null;
            this.data = data;
            right = null;
        }
    }
    
    void SearchBST(String value) {
        InOrder(Search(value, root, root));
    }

    Node Search(String value, Node p, Node par) {
        Node ptr;
        if (p != null) {
            if (value.compareTo(p.data) < 0) {
                p = Search(value, p.left, p);
            } else if (value.compareTo(p.data) > 0) {
                p = Search(value, p.right, p);
            } else {
                return p;
            }
        } else {
            System.out.println("Item not in tree");
            return par;
        }
        return p;
    }

    void InOrder(Node ptr) {
        if (ptr.left != null && ptr.right != null) {
            //   System.out.print("(");
            InOrder(ptr.left);
        }

        System.out.print(" " + ptr.data + " ");
        if (ptr.left != null && ptr.right != null) {
            InOrder(ptr.right);
        }
        //   System.out.print(")");

    }
}

