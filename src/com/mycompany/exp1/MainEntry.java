/**
 * 
 */
package com.mycompany.exp1;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.mycompany.exp1.dragon.*;
import com.mycompany.exp1.village.Village;

/**
 * @author Paul Jerchaflie
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dragon dragonMushu=new Mushu();
		
		Village village2eat=new Village(2);
		Dragon dragonSpyro=new Spyro(village2eat);
		
	}

}
