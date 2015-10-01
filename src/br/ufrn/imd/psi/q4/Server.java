/**
 * 
 */
package br.ufrn.imd.psi.q4;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
	
//		socket = serverSocket.accept();

		createCandidateList();
	}
	
	/**
	 * this method create a list of candidates will be in voting
	 * @throws IOException 
	 */
	public static void createCandidateList() throws IOException {
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		
		File folder = new File("img/");
		File[] listOfFiles = folder.listFiles();

		String name = new String();
		String fileName = new String();
		String[] data;
		int number;
		BufferedImage image;
		
	    for (int i = 0; i < listOfFiles.length; i++) {
	    	if (listOfFiles[i].isFile()) {
//	    		System.out.println("File " + listOfFiles[i].getName());
	    		fileName = listOfFiles[i].getName();
	    		data = fileName.split("_");
	    		name = data[0] + " " + data[1];
	    		
	    		number = Integer.parseInt(data[2].split("[a-z]")[0].replace(".", ""));
	    		//image = ImageIO.read(new File(fileName));
	    		
	    		System.out.println(name + " " + number + " " + fileName);
	    		//Candidate c = new Candidate(name, number, image);
	    		
	    		//candidates.add(c);
	    	} 
	    }
		
		
	}

}
