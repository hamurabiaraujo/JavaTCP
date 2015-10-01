/**
 * 
 */
package br.ufrn.imd.psi.q4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

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
		Voting voting = new Voting();
	
		socket = serverSocket.accept();
		

	}
	
	public static void createCandidateList() {
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	}

}
