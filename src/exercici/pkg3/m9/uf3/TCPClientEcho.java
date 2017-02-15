
package exercici.pkg3.m9.uf3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class TCPClientEcho {
    
    Socket s;
    DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
    BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));

    public TCPClientEcho() throws IOException {
        this.s = new Socket("localhost", 5487);
    }
    
    
}
