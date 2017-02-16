
package exercici.pkg3.m9.uf3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServerEcho {
    int port = 5487;
    ServerSocket ssocket;

    public TCPServerEcho() throws IOException {
        this.ssocket = new ServerSocket(port);
        Socket accept = ssocket.accept();
        DataOutputStream outToClient = new DataOutputStream(accept.getOutputStream());
        BufferedReader buffer = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        String cadena = buffer.readLine();
        
        outToClient.writeBytes(cadena + "\n");
        
        
    }
}
