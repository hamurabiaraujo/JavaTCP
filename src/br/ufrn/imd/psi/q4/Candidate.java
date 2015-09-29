/**
 * 
 */
package br.ufrn.imd.psi.q4;

import java.awt.Image;
import java.io.Serializable;

/**
 * @author Hamurabi Ara�jo
 *
 */
public class Candidate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int number;
	private Image image;
	private int votes;
	
	public Candidate(String name, int number, Image image) {
		this.name = name;
		this.number = number;
		this.image = image;
		this.votes = 0;
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

	/**
	 * @return the votes
	 */
	public int getVotes() {
		return votes;
	}

	/**
	 * @param votes the votes to set
	 */
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	/**
	 * @see increase the number of votes
	 * @return the number of votes updated
	 */
	public int increaseVote() {
		return this.votes++;
	}
}
