
package exercici.pkg3.m9.uf3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class TCPClientEcho {
    
    Socket socket;
    DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
    BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    public TCPClientEcho() throws IOException {
        this.socket = new Socket("localhost", 5487);
    }
    
    
}
