/**
 * 
 */
package com.mycompany.exp1.village;

import com.mycompany.exp1.village.HasVillagers;

/**
 * @author Paul Jerchaflie
 *
 */
public class Village implements HasVillagers, GrowingVillage{
	private int numberOfVillagers;

	public Village(int numberOfVillagers){
		this.numberOfVillagers=numberOfVillagers;
	}
	
	@Override
	public int countOfVillagers() {
		// TODO Auto-generated method stub
		return numberOfVillagers;
	}

	@Override
	public int addVillagers(int addedVillagers) {
		numberOfVillagers+=addedVillagers;
		return numberOfVillagers;
	}
	
}
