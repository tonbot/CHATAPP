package mySocket;
import java.io.*;
import java.net.*;

public class GetMyIP {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader in = null;
        String ipAddress = "";
        try {
            url = new URL("http://bot.whatismyipaddress.com");
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            ipAddress = in.readLine().trim();
            /* IF not connected to internet, then
             * the above code will return one empty
             * String, we can check it's length and
             * if length is not greater than zero, 
             * then we can go for LAN IP or Local IP
             * or PRIVATE IP
             */
           System.out.println("IP Adress: " + ipAddress);
        }
          catch (Exception ex) {
            // This try will give the Private IP of the Host.
      
}
    }}
