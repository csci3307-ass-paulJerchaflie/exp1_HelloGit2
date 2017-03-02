/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author Paul Jerchaflie
 *
 */
public class Spyro extends Mushu {
	private Village villageToEat;
	public Spyro(Village villageToEat){
		this.villageToEat=villageToEat;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatVillage(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillage(Village village){
		return true;
	}
}
