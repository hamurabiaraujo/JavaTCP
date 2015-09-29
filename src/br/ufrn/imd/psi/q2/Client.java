/**
 * 
 */
package br.ufrn.imd.psi.q2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
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
		
		for (int port = 79; port <= 81; port++){
			System.out.println(port);
			try {
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress("dronemidia.com", port), 1000);
				System.out.println("Porta " + port + " TCP em uso!");
				socket.close();
			} catch ( Exception e){
				
			}
		}

	}

}
