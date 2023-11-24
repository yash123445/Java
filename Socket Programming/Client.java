import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			// to connect with the server socket
			Socket cs = new Socket("127.0.0.1", 12122);
			System.out.println("Connected to server....");

			// to write the output from client side printwriter class is used.
			// auto flash is use to push the data ( true)

			PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
			String message = "HELLO SERVER....";
			out.println(message);  

			BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			message = in.readLine();                                                                                                   
			System.out.println("From SERVER: " + message);

			cs.close();
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
