/*SERVER - May be enhanced to work for multiple clients*/
import java.net.*;
import java.io.*;

public class NetworkingServer {
    public static void main(String[] args) {

        ServerSocket server = null;
        Socket client;

        //Default port number we are going to use
        int portnumber = 1234;
        if(args.length >= 1)
        {
            portnumber= Integer.parseInt(args[0]);
        }

        //Create Server side Socket
        try{
            server = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket"+ ie);
        }
    }
}