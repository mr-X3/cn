/*
TITTLE:PEER TO PEER
Rollno:13
Batch:TEB-01
server
*/							//peer to peer

import java.net.*;
import java.io.*;  


public class server
{
	public static void main(String args[])throws Exception
	{  
		ServerSocket ss=new ServerSocket(9000);  
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
	}
}



/*****************************
OUTPUT:

gescoe@gescoe-OptiPlex-3020:~/Desktop/pranav/TCPIP$ javac server.java 
gescoe@gescoe-OptiPlex-3020:~/Desktop/pranav/TCPIP$ java server 
hello client 
client says: hello server
*********************************/



/*
tILLENT:PEER TO PEER
Rollno:38
Batch:TEA-02

*/						//peer to peer
import java.net.*;
import java.io.*;  

public class Client {

	public static void main(String args[])throws Exception{  
		Socket s=new Socket("192.168.3.20",9000);  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str.equals("stop")){  
			str=br.readLine();  
			dout.writeUTF(str);  
			dout.flush();  
			str2=din.readUTF();  
			System.out.println("Server says: "+str2);  
		}  
	  
		dout.close();  
		s.close();  
	}}

/*
OUTPUT:

gescoe@slave12:~/Desktop/tanmay $ javac Client.java
gescoe@slave12:~/Desktop/tanmay $ java Client
hello server
Server says: hello client 


*/





