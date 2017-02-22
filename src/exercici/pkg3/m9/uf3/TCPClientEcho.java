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

    public TCPClientEcho() throws IOException {
       /* this.socket = new Socket("localhost", 5487);
        outToServer = new DataOutputStream(socket.getOutputStream());
        buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        outToServer.writeBytes("hola \n");
        String cadena = buffer.readLine();
        System.out.println(cadena);*/
        
        
        this.socket = new Socket("localhost", 5487);

        outToServer = new DataOutputStream(socket.getOutputStream());
        buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String primer = null;
        String segon = null;

        primer = JOptionPane.showInputDialog(null, "Missatge-1", "Mensaje de Cliente", 1);
        segon = JOptionPane.showInputDialog(null, "Missatge-2", "Mensaje de Cliente", 1);

        
        envioServer.writeInt(Integer.parseInt(primer));
        envioServer.writeInt(Integer.parseInt(segon));
        //envioServer.writeBytes("Hola \n");

        //El ejercicio 1 es basicamnte lo mismo que este pero en vez de leer le 
        //pasas el mensaje justo como es que está arriba
        String msg = bufferEntradaCliente.readLine();
        String msg2 = bufferEntradaCliente.readLine();
        System.out.println(msg);
        System.out.println(msg2);

        envioServer.close();
        bufferEntradaCliente.close();
        connectionSocket.close();

    }

}
