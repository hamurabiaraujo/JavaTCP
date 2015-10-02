/**
 * 
 */
package br.ufrn.imd.psi.q4;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
		
		//aguardando conexão
		socket = serverSocket.accept();
		System.out.println("Cliente conectado...");
		
		//criando a lista de candidatos
		voting.setCandidates(createCandidateList());
		//enviando lista de candidatos com seus respectivos números
		sendCandidatesList(voting.getCandidateListOfData(), socket);
	}
	
	/**
	 * this method create a list of candidates will be in voting
	 * @throws IOException 
	 */
	public static ArrayList<Candidate> createCandidateList() throws IOException {
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
	    		//pegando o nome do arquivo	
	    		fileName = listOfFiles[i].getName();
	    		//separando os dados
	    		data = fileName.split("_");
	    		//pegando o nome
	    		name = data[0].substring(0, 1).toUpperCase() + data[0].substring(1) + " " + data[1].substring(0, 1).toUpperCase() + data[1].substring(1);
	    		//pegando o número
	    		number = Integer.parseInt(data[2].split("[a-z]")[0].replace(".", ""));
	    		//lendo a imagem
	    		image = ImageIO.read(new File("img/" + fileName));
	    		//criando um novo candidato e adicionando à lista
	    		Candidate c = new Candidate(name, number, image);
	    		candidates.add(c);
	    		
	    		System.out.println("Candidato adicionado:" + name + " " + number);
	    	} 
	    }
	    return candidates;
	}

	/**
	 * this method send a list of candidates for client
	 * @throws IOException 
	 */
	public static void sendCandidatesList(ArrayList<String> listOfData, Socket socket) throws IOException {
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		writer.println(listOfData.size());
		System.out.println("Enviado o tamanho da lista: " + listOfData.size());
		writer.println("Lista dos candidatos:");
		
		for (int i = 0; i < listOfData.size(); i++){
			writer.println(listOfData.get(i));
		}
	}
}
