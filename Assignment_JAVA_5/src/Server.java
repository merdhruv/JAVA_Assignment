import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(800);
		Socket s = ss.accept();
		
		System.out.println("Client/Server Connected");
		
		InputStream is =  s.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String cmg = br.readLine();
		
		System.out.println("Message from client : "+ cmg);
		
		
		System.out.println("Enter The message to Client");
		InputStream is1 =  s.getInputStream();
		InputStreamReader ir1 = new InputStreamReader(is1);
		BufferedReader br1 = new BufferedReader(ir1);
		
		String smsg = br1.readLine();
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.println(smsg);
		
		ss.close();
		s.close();
		
		
	}
	
}
