package exercici.pkg3.m9.uf3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

    static int port = 5487;
    ServerSocket ssocket;

    public TCPServerEcho(int port) throws IOException {
        
        //Es crea el socket.
        this.ssocket = new ServerSocket(port);

        while (true) {
            
            Socket accept = ssocket.accept();

            DataOutputStream outToClient = new DataOutputStream(accept.getOutputStream());
            DataInputStream buffer = new DataInputStream(accept.getInputStream());

            //Llegeix els missatges que li arriben i els fica a les variables.
            int msg = buffer.readInt();
            int msg2 = buffer.readInt();

            //Imprimim els missatges..
            System.out.println(msg + msg2);

            //Enviem un missatge al client
            outToClient.writeBytes(msg + "\n");

            //Tanquem els recursos.
            outToClient.close();
            buffer.close();
        }

    }

    public static void main(String[] args) throws IOException {
        new TCPServerEcho(port);
    }
}
