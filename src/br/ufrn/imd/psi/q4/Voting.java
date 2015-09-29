/**
 * 
 */
package br.ufrn.imd.psi.q4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hamurabi Araújo
 *
 */
public class Voting implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Candidate> candidates;
	
	/**
	 * @return the candidates
	 */
	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}
	
	/**
	 * @param candidates the candidates to set
	 */
	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	/**
	 * @return the list of names and number each candidate
	 */
	public ArrayList<String> getCandidateListOfData() {
		ArrayList<String> listOfCandidates = new ArrayList<>();
		
		for (Candidate candidate : candidates) {
			listOfCandidates.add("Nome: " + candidate.getName() + "\n" + "Número: " + candidate.getNumber() + "\n\n");
		}
		
		return listOfCandidates;
	}
	
	/**
	 * @param number of the candidate
	 */
	public void vote(int number) {
		Iterator<Candidate> it = candidates.iterator();
		Candidate candidate;
		
		while (it.hasNext()) {
			candidate = it.next();
		}
	}
}
