package mySocket;

import java.net.*;
import java.io.*;

public class myserversocket {
	
	public static void main(String[] args) throws IOException {
		               
	            try 
	            { 
	            	 
	            	InetAddress IP=InetAddress.getLocalHost();
	            	System.out.println("IP of my system is := "+IP.getHostAddress());
	                
					ServerSocket se = new ServerSocket(3334); 	 
	                Socket s = se.accept();
	                System.out.println("A new client is connected :" + s); 
	                DataInputStream dis = new DataInputStream(s.getInputStream()); 
	                DataOutputStream dos = new DataOutputStream(s.getOutputStream());  
	                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	                System.out.println("Assigning new thread for this client"); 
	                Thread t = new ClientHandler(s, dis, dos, br);  
	                t.start(); 
	                 se.close();
	            } 
	            catch (Exception e){ 
	               
	                e.printStackTrace(); 
	            } 
	        } 
	    } 
	
  
	// ClientHandler class 
	class ClientHandler extends Thread  
	{ 
	  
	   
	    // Constructor 
	    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos, BufferedReader br )  
	    { 
	    	
	        
            try { 
   
            	String str="",str2="";  
    			while(!str.equals("stop")){  
    			str=dis.readUTF();  
    			System.out.println("client says: "+str);  
    			str2=br.readLine();  
    			dos.writeUTF(str2);  
    			dos.flush(); 
       	
    			}
    			
				dos.close();
				 dis.close();
				  
  
          
            }       
	        catch(IOException e){ 
	            e.printStackTrace(); 
	        } 
	    
	        
	    } 
	  
	    @Override
	    public void run()  
	    { 
	    	   
	    	  // closing resources
	   
            
			} 
			
			
			
			
			
			
			
			/*ServerSocket ss=new ServerSocket(6666);  
			Socket s=ss.accept();//establishes connection   
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			System.out.println("message= "+str);  
			ss.close(); 
			ServerSocket ss=new ServerSocket(3333);  
			Socket s=ss.accept();  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			String str="",str2="";  
			while(!str.equals("stop")){  
			str=din.readUTF();  
			System.out.println("client says: "+str);  
			str2=br.readLine();  
			dout.writeUTF(str2);  
			dout.flush();  
			}  
			din.close();  
			s.close();  
			ss.close(); 
			 */
			
			
			
			
		

	}


