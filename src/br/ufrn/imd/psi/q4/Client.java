/**
 * 
 */
package br.ufrn.imd.psi.q4;

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
		int qttOfCandidates = Integer.parseInt(reader.readLine());

		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		
		readListOfCandidates(socket, qttOfCandidates);
	}
	
	public static void readListOfCandidates(Socket socket, int listSize) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		while (listSize >= 0){ 
			System.out.println(reader.readLine());
			listSize--;
		}
	}

}
