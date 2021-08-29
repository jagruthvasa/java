cleint file


import java.net.*;
import java.io.*;

public class week15client {
      public static void main(String[] args) throws Exception {

            Socket s = new Socket("localhost",1500);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            int a=10,b=10;
            dos.write(a);
            dos.write(b);
            System.out.println("Data sent to server");
            
      }
}



server file

import java.net.*;
import java.io.*;

public class week15server {
      public static void main(String[] args) throws Exception{

            ServerSocket ss = new ServerSocket(1500);
            Socket s = ss.accept();
            System.out.println("Listening to the port or server 1500 ");
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int x=dis.read();
            int y=dis.read();
            System.out.println("The data from clinet is received is " + x + " " + y);

      }      
}

