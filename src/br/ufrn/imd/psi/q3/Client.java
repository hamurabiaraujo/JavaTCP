/**
 * 
 */
package br.ufrn.imd.psi.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
		Socket socket = new Socket("localhost", 54321);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String message = "";
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		
		while ( !message.equals("sair") ){ 
			message = reader.readLine();
			writer.println(message);
			System.out.println("Mensagem enviada ao servidor com sucesso!");
		}
		
		socket.close();
	}

}
