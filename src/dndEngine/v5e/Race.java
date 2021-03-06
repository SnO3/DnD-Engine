package dndEngine.v5e;

import dndEngine.v5e.Elf.Subrace;

public interface Race {
	public static final int SIZE = 2;
	
	public int getSize();
	public int getBaseSpeed();
	public int getBaseSpeed(Subrace s);
	public String[] getLanguages();
	public boolean hasDarkvision();
	public boolean hasExtraLanguage();
	//public boolean hasExtraLanguage(Subrace s);
	public String[] getBaseStatIncrease();
	public String[] getSkillProficiencies();
}
