package exercici.pkg3.m9.uf3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class TCPClientEcho {

    Socket socket;
    DataOutputStream outToServer;
    BufferedReader buffer;
    static String hostname = "localhost";
    static int port = 2020;

    public TCPClientEcho() throws IOException {
        this.socket = new Socket(hostname, port);
    }

    public TCPClientEcho(String host, int port) throws IOException {
               
        //Es crea el socket.
        this.socket = new Socket(hostname, port);

        outToServer = new DataOutputStream(socket.getOutputStream());
        
        //Es crea el buffer
        buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String primer = null;
        String segon = null;

        //S'entren les dades per teclat(numeros).
        primer = JOptionPane.showInputDialog(null, "1r numero", "Mensaje de Cliente", 1);
        segon = JOptionPane.showInputDialog(null, "2n numero", "Mensaje de Cliente", 1);

        //Es pasen a enters les dades.
        outToServer.writeInt(Integer.parseInt(primer));
        outToServer.writeInt(Integer.parseInt(segon));
        //envioServer.writeBytes("Hola \n");

        //El ejercicio 1 es basicamnte lo mismo que este pero en vez de leer le 
        //pasas el mensaje justo como es que está arriba
        String msg = buffer.readLine();
        String msg2 = buffer.readLine();
        System.out.println(msg);
        System.out.println(msg2);

        outToServer.close();
        buffer.close();
        socket.close();

    }

    public static void main(String[] args) throws IOException {
        TCPClientEcho client = new TCPClientEcho(hostname, port);

    }

}
