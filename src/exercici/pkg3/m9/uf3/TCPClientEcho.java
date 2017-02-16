package exercici.pkg3.m9.uf3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClientEcho {

    Socket socket;
    DataOutputStream outToServer;
    BufferedReader buffer;

    public TCPClientEcho() throws IOException {
        this.socket = new Socket("localhost", 5487);
        outToServer = new DataOutputStream(socket.getOutputStream());
        buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        outToServer.writeBytes("hola \n");
        String cadena = buffer.readLine();
        System.out.println(cadena);
    }

}
