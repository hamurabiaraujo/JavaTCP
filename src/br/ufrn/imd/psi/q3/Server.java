/**
 * 
 */
package br.ufrn.imd.psi.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Hamurabi Araújo
 *
 */
public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(54321);
		System.out.println("Servidor em execução...");
		Socket socket; 
		String message = "";
	
		socket = serverSocket.accept();
		
		do {
			System.out.println("Cliente " + socket.getInetAddress().getHostAddress() + " conectado ...");
			do {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				message = reader.readLine();
				System.out.println("Echo: " + message);
			} while (!message.equals("sair"));
			System.out.println("Cliente " + socket.getInetAddress().getHostAddress() + " desconectado...");
			socket.close();
			
			socket = serverSocket.accept();
		} while (!socket.isClosed());
		
		serverSocket.close();
	}

}
