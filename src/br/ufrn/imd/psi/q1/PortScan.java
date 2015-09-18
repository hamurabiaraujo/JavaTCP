package br.ufrn.imd.psi.q1;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author Hamurabi Araújo
 */
public class PortScan {
	public static final int NUM_PORTS = 65535;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * @throws SocketException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		for ( int port = 1890; port < NUM_PORTS; port++ ){
			try {
				DatagramSocket socket_udp = new DatagramSocket(port);
				socket_udp.close();
			} catch (SocketException e) {	
				System.out.println("Porta " + port + " do protocolo UDP em uso" );
			}
			
			try {
				ServerSocket socket_tcp = new ServerSocket(port);
				socket_tcp.close();
			} catch (IOException e) {
				System.out.println("Porta " + port + " do protocolo TCP em uso" );
			}
		}
	}

}
