/**
 * 
 */
package br.ufrn.imd.psi.q2;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author Hamurabi Araújo
 *
 */
public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		for (int port = 1; port <= 1023; port++){
			try {
				Socket socket = new Socket("localhost", port);
				System.out.println("Porta " + port + " TCP em uso!");
				socket.close();
			} catch ( SocketException e){
				
			}
		}

	}

}
