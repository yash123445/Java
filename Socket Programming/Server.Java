import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(12122);
			System.out.println("Server Running ......");

			// Accept method is use to wait a process for the server
			System.out.println("Waiting for client to connect ......");
			Socket css = ss.accept();

			// to accept the data or input from the client getInputStream is use 
			// inputstreaReader use to read the data in smaller chungs
			// BufferedReader is use to read the data in buffer
			BufferedReader in = new BufferedReader(new InputStreamReader(css.getInputStream()));
			String message = in.readLine();
			System.out.println("From Client: " +message);
			
			PrintWriter out = new PrintWriter(css.getOutputStream(),true);
			message = message.toLowerCase();
			out.println(message);
			
			
			css.close();
			ss.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
