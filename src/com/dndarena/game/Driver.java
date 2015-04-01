package com.dndarena.game;

public class Driver {

	public static void main(String[] args) {
		/* Display Stuff
		 * Get Player Data
		 * Battle Sequence
		 * End Sequence
		 */

		Game inst = new Game();
		
		while(inst.isNotEnded())
		{
			inst.intro();
			inst.getPlayerData();
			inst.battle();
		}
		

	}

}
