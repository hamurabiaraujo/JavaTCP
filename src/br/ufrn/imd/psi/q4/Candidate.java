package br.ufrn.imd.psi.q4;

import java.awt.Image;

/**
 * @author Hamurabi Araújo
 *
 */
public class Candidate {
		private String name;
		private int number;
		private Image image;
		
	public Candidate(String name, int number, Image image) {
		this.name = name;
		this.number = number;
		this.image = image;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}
	
	

}
