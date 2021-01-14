package mySocket;
 import java.net.*;
import java.util.Scanner;
import java.io.*;
 

public class myclientsocket {

	public static void main(String[] args) {
		try{      
			
			/*Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("how are you doing server");  
			dout.flush();  
			dout.close();  
			s.close();  */	
			Socket s=new Socket("192.168.137.1",3334);  
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());  
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			Scanner scn = new Scanner(System.in);
			  
			String str="",str2="";  
			while(!str.equals("stop")){  
		    str = scn.nextLine(); 
			dos.writeUTF(str);  
			dos.flush();  
			str2=dis.readUTF();  
			System.out.println("Server says: "+str2);  
			}  
			  
			dos.close();  
			s.close();
			
			
			}catch(Exception e){System.out.println(e);}  

	}

}
