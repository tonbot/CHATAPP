package mySocket;
 import java.net.*;
 import java.io.*;
 

public class myclientsocket3 {

	public static void main(String args) {
		try{      
			
		
			Socket s=new Socket("192.168.137.1", 3334);  
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			String str="",str2="";  
			while(!str.equals("stop")){  
			str=br.readLine();  
			dos.writeUTF(str);  
			dos.flush();  
			str2=dis.readUTF();  
			System.out.println("Server say: "+str2);  
			}  
			  
			dos.close();  
			s.close();
			
			
			}catch(Exception e){System.out.println(e);}  

	}

}
