import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 800);
		
		System.out.println("Enter The message to server");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		String cmsg = br.readLine();
		
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.println(cmsg);
		
		
		InputStream is1 =  s.getInputStream();
		InputStreamReader ir1 = new InputStreamReader(is1);
		BufferedReader br1 = new BufferedReader(ir1);
		
		String cmg = br1.readLine();
		System.out.println("Message from server : "+ cmg);
		
		s.close();
		os.close();
		ps.close();
	}
}
