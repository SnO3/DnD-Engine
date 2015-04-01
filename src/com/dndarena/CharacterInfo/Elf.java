package com.dndarena.CharacterInfo;

public class Elf implements Race{
	private static final String SKILL_PROF = "PERC";
	private static final boolean DARKVISION = true;
	private static final int BASE_SPEED = 30;
	private static final String[] LANGUAGES = {"Common", "Elvish"};
	private static final String[] W_PROFICIENCIES_HW = //only for high and wood elves
		{
			"longsword",
			"shortsword",
			"longbow",
			"shortbow"
		};
	private static final String[] W_PROFICIENCIES_D =  //only for dark elves
		{
			"rapiers",
			"shortswords",
			"hand crossbows"
		};
	public enum Subrace{
		HIGH,WOOD,DARK
	}
	
	public Elf(){}
	
	public String[] getWeaponProficiencies(Subrace s){
		switch(s){
		case DARK:
			return W_PROFICIENCIES_D;
		default:
			return W_PROFICIENCIES_HW;
		}
	}
	
	public int getSize(){return SIZE;}
	public String[] getLanguages(){return LANGUAGES;}
	
	public int getBaseSpeed(){return BASE_SPEED;}

	public int getBaseSpeed(Subrace s){
		switch(s){
		case WOOD:
			return BASE_SPEED + 5;
		default:
			return BASE_SPEED;
		}
	}
	
	public boolean hasDarkvision(){return DARKVISION;}
	
	public boolean hasExtraLanguage(){return false;}
	public boolean hasExtraLanguage(Subrace s){
		switch(s){
		case HIGH:
			return true;
		default:
			return false;
		}
	}
	
	public String[] getBaseStatIncrease(){return new String[]{"DEX2"};}
	public String[] getBaseStatIncrease(Subrace s){
		switch(s){
		case HIGH:
			return new String[] {"DEX2","INT1"};
		case WOOD:
			return new String[] {"DEX2", "WIS1"};
		case DARK:
			return new String[] {"DEX2", "CHA1"};
		default:
			System.out.println("ERROR");
			System.exit(0);
			return new String[] {"ERROR"};
		}
	}
	
	public String[] getSkillProficiencies(){return new String[] {SKILL_PROF};}
	
	public boolean hasSunlightSensitivity(Subrace s){
		switch(s){
		case DARK:
			return true;
		default:
			return false;
		}
	}
	
	public String[] getSpells(Subrace s, int lvl){
		switch(s){
		case HIGH:
			return new String[] {"WIZARD CANTRIP"};
		case WOOD:
			return null;
		case DARK:
			if(lvl<3)
				return new String[]{"DANCING LIGHTS"};
			else if(lvl<5)
				return new String[]{"DANCING LIGHTS", "FAERIE FIRE"};
			else
				return new String[]{"DANCING LIGHTS", "FAERIE FIRE", "DARKNESS"};
		default:
			return null;
		}
	}
}