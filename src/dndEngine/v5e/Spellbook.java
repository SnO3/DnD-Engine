package dndEngine.v5e;

import java.util.EnumSet;

public class Spellbook {
	public enum Bard
	{
		//Cantrips
		Blade_Ward,
		Dancing_Lights,
		Friends,
		Light,
		Mage_Hand,
		Mending,
		Message,
		Minor_Illusion,
		Prestidigitation,
		True_Strike,
		Vicious_Mockery,
		//1st Level
		Animal_Friendship,
		Bane,
		Charm,
		Comprehend_Languages,
		Cure_Wounds,
		Detect_Magic,
		Disguise_Self,
		Dissonant_Whispers,
		Faerie_Fire,
		Feather_Fall,
		Healing_Word,
		Heroism,
		Identify,
		Illusory_Script,
		Longstrider,
		Silent_Image,
		Sleep,
		Speak_with_Animals,
		Tashas_Hideous_Laughter,
		ThunderWave,
		Unseen_Servant,
		//2nd Level
		Animal_Messenger,
		Blindness_Deafness,
		Calm_Emotions,
		Cloud_of_Daggers,
		Crown_of_Madness,
		Detect_Thoughts,
		Enhance_Ability,
		Enthrall,
		Heat_Metal,
		Hold_Person,
		Invisibility,
		Knock,
		Lesser_Restoration,
		Locate_Animals_or_Plants,
		Locate_Object,
		Magic_Mouth,
		Phantasmal_Force,
		See_Invisibility,
		Shatter,
		Silence,
		Suggestion,
		Zone_of_Truth,
		//3rd Level
		Bestow_Curse,
		Clairvoyance,
		Dispel_Magic,
		Fear,
		Feign_Death,
		Glyph_of_Warding,
		Hypnotic_Pattern,
		Leomunds_Tiny_Hut,
		Major_Image,
		Nondetection,
		Plant_Growth,
		Sending,
		Speak_with_Dead,
		Speak_with_Plants,
		Stinking_Cloud,
		Tongues,
		//4th Level
		Compulsion,
		Confusion,
		Dimension_Door,
		Freedom_of_Movement,
		Geater_Invisibility,
		Hallucinatory_Terrain,
		Locate_Creature,
		Polymorph,
		//5th Level
		Animate_Objects,
		Awaken,
		Dominate_Person,
		Dream,
		Geas,
		Greater_Restoration,
		Hold_Monster,
		Legend_Lore,
		Mass_Cure_Wounds,
		Mislead,
		Modify_Memory,
		Planar_Binding,
		Raise_Dead,
		Scrying,
		Seeming,
		Teleportation_Circle,
		//6th Level
		Eyebite,
		Find_the_Path,
		Guards_and_Wards,
		Mass_Suggestion,
		Ottos_Irresistible_Dance,
		Programmed_Illusion,
		True_Seeing,
		//7th Level
		Etherealness,
		Forcecage,
		Mirage_Arcane,
		Mordenkainens_Magnificent_Mansion,
		Mordenkainens_Sword,
		Project_Image,
		Regenerate,
		Resurrection,
		Symbol,
		Teleport,
		//8th Level
		Foresight,
		Power_Word_Heal,
		Power_Word_Kill,
		True_Polymorph
	}

	public enum Cleric{
		//Cantrips
		Guidance,
		Light,
		Mending,
		Resistance,
		Sacred_Flame,
		Spare_the_Dying,
		Thaumaturgy,
		//1st Level
		Bane,
		Bless,
		Command,
		Create_or_Destroy_Water,
		Cure_Wounds,
		Detect_Evil_and_Good,
		Detect_Magic,
		Detect_Poison_and_Disease,
		Guiding_Bolt,
		Healing_Word,
		Inflict_Wounds,
		Protection_from_Evil_and_Good,
		Purify_Food_and_Drink,
		Sanctuary,
		Shield_of_Faith,
		//2nd Level
		Aid,
		Augury,
		Blindness_Deafness,
		Calm_Emotions,
		Continual_Flame,
		Enhance_Ability,
		Find_Traps,
		Gentle_Repose,
		Hold_Person,
		Lesser_Restoration,
		Locate_Object,
		Prayer_of_Healing,
		Protection_from_Poison,
		Silence,
		Spiritual_Weapon,
		Warding_Bond,
		Zone_of_Truth,
		//3rd Level
		Animate_Dead,
		Beacon_of_Hope,
		Bestow_Curse,
		Clairvoyance,
		Create_Food_and_Water,
		Daylight,
		Dispel_Magic,
		Fiegn_Death,
		Glyph_of_Warding,
		Magic_Circle,
		Mass_Healing_Word,
		Meld_into_Stone,
		Protection_from_Energy,
		Remove_Curse,
		Revivify,
		Sending,
		Speak_with_Dead,
		Spirit_Guardians,
		Tongues,
		Water_Walk,
		//4th Level,
		Banishment,
		Control_Water,
		Death_Ward,
		Divination,
		Freedom_of_Movement,
		Guardian_of_Faith,
		Locate_Creature,
		Stone_Shape,
		//5th Level
		Commune,
		Contagion,
		Dispel_Evil_and_Good,
		Flame_Strike,
		Geas,
		Greater_Restoration,
		Hallow,
		Insect_Plague,
		Legend_Lore,
		Mass_Cure_Wounds,
		Planar_Binding,
		Raise_Dead,
		Scrying,
		//6th Level
		Blade_Barrier,
		Create_Undead,
		Find_the_Path,
		Forbiddance,
		Harm,
		Heal,
		Heroes_Feast,
		Planar_Ally,
		True_Seeing,
		Word_of_Recall,
		//7th Level
		Conjure_Celestial,
		Divine_Word,
		Etherealness,
		Fire_Storm,
		Plane_Shift,
		Regenerate,
		Resurrection,
		Symbol,
		//8th Level
		Antimagic_Field,
		Control_Weather,
		Earthquake,
		Holy_Aura,
		//9th Level
		Astral_Projection,
		Gate,
		Mass_Heal,
		True_Resurrection
	}

	public enum Druid{
		//Cantrips
		Druidcraft,
		Guidance,
		Mending,
		Poison_Spray,
		Produce_Flame,
		Resistance,
		Shillelagh,
		Thorn_Whip,
		//1st Level,
		Animal_Friendship,
		Charm_Person,
		Create_or_Destroy_Water,
		Cure_Wounds,
		Detect_Magic,
		Detect_Poison_and_Disease,
		Entangle,
		Faerie_Fire,
		Fog_Cloud,
		Goodberry,
		Healing_Word,
		Jump,
		Longstrider,
		Purify_Food_and_Drink,
		Speak_with_Animals,
		Thunderwave,
		//2nd Level
		Animal_Messanger,
		Barkskin,
		Beast_Sense,
		Darkvision,
		Enhance,
		Ability,
		Find_Traps,
		Flame_Blade,
		Flaming_Spere,
		Gust_of_Wind,
		Heat_Metal,
		Hold_Person,
		Lesser_Restoration,
		Locate_Animals_or_Plants,
		Locate_Object,
		Moonbeam,
		Pass_without_Trace,
		Protection_from_Poison,
		Spike_Growth,
		Giant_Insect,
		Grasping_Vine,
		Hallucinatory_Terrain,
		Ice_Storm,
		Locate_Creature,
		Polymorph,
		Stone_Shape,
		Stoneskin,
		Wall_of_Fire,
		//5th Level
		Antilife_Shell,
		Awaken,
		Commune_with_Nature,
		Conjure_Elemental,
		Contagion,
		Geas,
		Greater_Restoration,
		Insect_Plague,
		Mass_Cure_Wounds,
		Planar_Binding,
		Reincarnate,
		Scrying,
		Tree_Stride,
		Wall_of_Stone,
		//6th Level
		Conjure_Fey,
		Find_the_Path,
		Heal,
		Heroes_Feast,
		Move_Earth,
		Sunbeam,
		Transport_via_Plants,
		Wall_of_Thorns,
		Wind_Walk,
		//7th Level
		Fire_Storm,
		Mirage_Arcane,
		Plane_Shift,
		Regenerate,
		Reverse_Gravity,
		//8th Level
		Animal_Shapes,
		Antipathy_Sympathy,
		Control_Weather,
		Earthquake,
		Feeblemind,
		Sunburst,
		Tsunami,
		//9th Level
		Foresight,
		Shapechange,
		Storm_of_Vengeance,
		True_Resurrection,
	}

	public enum Paladin{
		//1st Level
		Bless,
		Command,
		Compelled_Duel,
		Cure_Wounds,
		Detect_Evil_and_Good,
		Detect_Magic,
		Detect_Poison_and_Disease,
		Divine_Favor,
		Heroism,
		Protection_from_Evil_and_Good,
		Purify_Food_and_Drink,
		Searing_Smite,
		Shield_of_Faith,
		Thunderouse_Smite,
		Wrathful_Smite,
		//2nd Level
		Aid,
		Branding_Smite,
		Find_Steed,
		Lesser_Restoration,
		Locate_Object,
		Magic_Weapon,
		Protection_from_Poison,
		Zone_of_Truth,
		//3rd Level
		Aura_of_Vitality,
		Blinding_Smite,
		Create_Food_and_Water,
		Crusaders_Mantle,
		Daylight,
		Dispel_Magic,
		Elemental_Weapon,
		Magic_Circle,
		Remove_Curse,
		Revivify,
		//4th Level
		Aura_of_Life,
		Aura_of_Purity,
		Banishment,
		Death_Ward,
		Locate_Creature,
		Staggering_Smite,
		//5th Level
		Banishing_Smite,
		Circle_of_Power,
		Destructive_Smite,
		Dispel_Evil_and_Good,
		Geas,
		Raise_Dead
	}

	public enum Ranger{
		//1st Level
		Alarm,
		Animal_Friendship,
		Cure_Wounds,
		Detect_Magic,
		Detect_Poison_and_Disease,
		Ensnaring_Strike,
		Fog_Cloud,
		Goodberry,
		Hail_of_Thorns,
		Hunters_Mask,
		Jump,
		Longstrider,
		Speak_with_Animals,
		//2nd Level
		Animal_Messenger,
		Barkskin,
		Beast_Sense,
		Cordon_of_Arrows,
		Darkvision,
		Find_Traps,
		Lesser_Restoration,
		Locate_Animals_or_Plants,
		Locate_Object,
		Pass_without_Trace,
		Protection_from_Poison,
		Silence,
		Spike_Growth,
		//3rd Level
		Conjure_Animals,
		Conjure_Barrage,
		Daylight,
		Lightning_Arrow,
		Nondetection,
		Plant_Growth,
		Protection_from_Energy,
		Speak_with_Plants,
		Water_Breathing,
		Water_Walk,
		Wind_Wall,
		//4th Level
		Conjure_Woodland_Beings,
		Freedom_of_Movement,
		Grasping_Vine,
		Locate_Creature,
		Stoneskin,
		//5th Level
		Commune_with_Nature,
		Conjure_Volley,
		Swift_Quiver,
		Tree_Stride
	}

	public enum Sorcerer{
		//Cantrips
		Acid_Splash,
		Blade_Ward,
		Chill_Touch,
		Dancing_Lights,
		Fire_Bolt,
		Friends,
		Light,
		Mage_Hand,
		Mending,
		Message,
		Minor_Illusion,
		Poison_Spray,
		Prestidigitation,
		Ray_of_Frost,
		Shocking_Grasp,
		True_Strike,
		//1st Level
		Burning_Hands,
		Charm_Person,
		Chromatic_Orb,
		Color_Spray,
		Comprehend_Languages,
		Detect_Magic,
		Disguise_Self,
		Expeditous_Retreat,
		False_Life,
		Feather_Fall,
		Fog_Cloud,
		Jump,
		Mage_Armor,
		Magic_Missile,
		Ray_of_Sickness,
		Shield,
		Silent_Image,
		Sleep,
		Thunderwave,
		Witch_Bolt,
		//2nd Level
		Alter_Self,
		Blindness_Deafness,
		Blur,
		Cloud_of_Daggers,
		Crown_of_Madness,
		Darkness,
		Darkvision,
		Detect_Thoughts,
		Enhance_Ability,
		Enlarge_Reduce,
		Gust_of_Wind,
		Hold_Person,
		Invisibility,
		Knock,
		Levitate,
		Mirror_Image,
		Misty_Step,
		Phantasmal_Force,
		Scorching_Ray,
		See_Invisibility,
		Shatter,
		Spider_Climb,
		Suggestion,
		Web,
		//3rd Level
		Blink,
		Clairvoyance,
		Counterspell,
		Daylight,
		Dispel_Magic,
		Fear,
		Fireball,
		Fly,
		Gaseous_Form,
		Haste,
		Hypnotic_Pattern,
		Lightning_Bolt,
		Major_Image,
		Protection_from_Energy,
		Sleet_Storm,
		Slow,
		Stinking_Cloud,
		Tongues,
		Water_Breathing,
		Water_Walk,
		//4th Level
		Banishment,
		Blight,
		Confusion,
		Dimension_Door,
		Dominate_Beast,
		Geater_Invisibility,
		Ice_Storm,
		Polymorph,
		Stoneskin,
		Wall_of_Fire,
		//5th Level
		Animate_Objects,
		Cloudkill,
		Cone_of_Cold,
		Creation,
		Dominate_Person,
		Hold_Monster,
		Insect_Plague,
		Seeming,
		Telekinesis,
		Teleportation_Circle,
		Wall_of_Stone,
		//6th Level
		Arcane_Gate,
		Chain_Lightning,
		Circle_of_Death,
		Disintegrate,
		Eyebite,
		Globe_of_Invulnerability,
		Mass_Suggestion,
		Move_Earth,
		Sunbeam,
		True_Seeing,
		//7th Level
		Delayed_Blast_Fireball,
		Etherealness,
		Finger_of_Death,
		Fire_Storm,
		Plane_Shift,
		Prismatic_Spray,
		Reverse_Gravity,
		Teleport,
		//8th Level
		Dominate_Monster,
		Earthquake,
		Incendiary_Cloud,
		Pwer_Word_Stun,
		Sunburst,
		//9th Level
		Gate,
		Meteor_Swarm,
		Power_Word_Kill,
		Time_Stop,
		Wish
	}

	public enum Warlock{
		//Cantrips
		Blade_Ward,
		Chill_Touch,
		Eldritch_Blast,
		Friends,
		Mage_Hand,
		Minor_Illusion,
		Poison_Spray,
		Prestidigitation,
		True_Strike,
		//1st Level
		Armor_of_Agathys,
		Arms_of_Hadar,
		Charm_Person,
		Comprehend_Languages,
		Expeditious_Retreat,
		Hellish_Rebuke,
		Hex,
		Illusory_Script,
		Protection_from_Evil_and_Good,
		Unseen_Servant,
		Witch_Bolt,
		Cloud_of_Daggers,
		Crown_of_Madness,
		Darkness,
		Enthrall,
		Hold_Person,
		Invisibility,
		Mirror_Image,
		Misty_Step,
		Ray_of_Enfeeblement,
		Shatter,
		Spider_Climb,
		Suggestion,
		//3rd Level
		Counterspell,
		Dispel_Magic,
		Fear,
		Fly,
		Gaseous_Form,
		Hunger_of_Hadar,
		Hypnotic_Pattern,
		Magic_Circle,
		Major_Image,
		Remove_Curse,
		Tongues,
		Vampiric_Touch,
		//4th Level
		Banishment,
		Blight,
		Dimension_Door,
		Hallucinatory_Terrain,
		//5th Level
		Contact_Other_Plane,
		Dream,
		Hold_Monster,
		Scrying,
		//6th Level,
		Arcane_Gate,
		Circle_of_Death,
		Conjure_Fey,
		Create_Undead,
		Eyebite,
		Flesh_to_Stone,
		Mass_Suggestion,
		True_Seeing,
		//7th Level
		Etherealness,
		Finger_of_Death,
		Forcecage,
		Plane_Shift,
		//8th Level
		Demiplane,
		Dominate_Monster,
		Feeblemind,
		Glibness,
		Power_Word_Stun,
		//9th Level
		Astral_Projection,
		Foresight,
		Imprisonment,
		Power_Word_Kill,
		True_Polymorph
	}

	public enum Wizard{
		//Cantrips
		Acid_Splash,
		Blade_Ward,
		Chill_Touch,
		Dancing_Lights,
		Fire_Bolt,
		Friends,
		Light,
		Mage_Hand,
		Mending,
		Message,
		Minor_Illusion,
		Poison_Spray,
		Prestidigitation,
		Ray_of_Frost,
		Shocking_Grasp,
		True_Strike,
		//1st Level
		Alarm,
		Burning_Hands,
		Charm_Person,
		Chromatic_Orb,
		Color_Sprays,
		Comprehend_Languages,
		Detect_Magic,
		DIsguise_Self,
		Expeditious_Retreat,
		False_Life,
		Feather_Fall,
		Find_Familiar,
		Fog_Cloud,
		Grease,
		Identify,
		Illusory_Script,
		Jump,
		Longstrider,
		Mage_Armor,
		Magic_Missile,
		Protection_from_Evil_and_Good,
		Ray_of_Sickness,
		Shield,
		Silent_Image,
		Sleep,
		Tashas_Hideous_Laughter,
		Tensers_Floating_Disk,
		Thunderwave,
		Unseen_Servant,
		Witch_Bolt,
		//2nd Level
		ALter_Self,
		Arcane_Lock,
		Blindness_Deafness,
		Blur,
		Cloud_of_Daggers,
		Continual_Flame,
		Crown_of_Madness,
		Darkness,
		Darkvision,
		Detect_Thoughts,
		Enlarge_Reduce,
		Flaming_Sphere,
		Gentle_Repose,
		Gust_of_Wind,
		Hold_Person,
		Invisibility,
		Knock,
		Levitate,
		Locate_Object,
		Magic_Mouth,
		Magic_Weapon,
		Melfs_Acid_Arrow,
		Mirror_Image,
		Misty_Step,
		Nystuls_Magic_Aura,
		Phantasmal_Force,
		Ray_of_Enfeeblement,
		Rope_Trick,
		Scorching_Ray,
		See_Invisibility,
		Shatter,
		Spider_Climb,
		Suggestion,
		Web,
		//3rd Level
		Animate_Dead,
		Bestow_Curse,
		Blink,
		Clairvoyance,
		Counterspell,
		Dispel_Magic,
		Fear,
		Feign_Death,
		Fireball,
		Fly,
		Gaseous_Form,
		Glyph_of_Warding,
		Haste,
		Hypnotic_Pattern,
		Leomunds_Tiny_Hut,
		Lightning_Bolt,
		Magic_Circle,
		Major_Image,
		Nondetection,
		Phantom_Steed,
		Protection_from_Energy,
		Remove_Curse,
		Sending,
		Sleet_Storm,
		Slow,
		Stinking_Cloud,
		Tongues,
		Vampiric_Touch,
		Water_Breathing,
		//4th Level
		Arcane_Eye,
		Banishment,
		Blight,
		Confusion,
		Conjure_Minor_Elementals,
		Control_Water,
		Dimension_Door,
		Evards_Black_Tentacles,
		Fabricate,
		Fire_Shield,
		Greater_Invisibility,
		Hallucinatory_Terrain,
		Ice_Storm,
		Leomunds_Secret_Chest,
		Locate_Creature,
		Mordenkainens_Faithful_Hound,
		Mordenkainens_Private_Sanctum,
		Otilukes_Resilient_Sphere,
		Phantasmal_Killer,
		Polymorph,
		Stone_Shape,
		Stoneskin,
		Wall_of_Fire,
		//5th Level
		Animate_Objects,
		Bigbys_Hand,
		Cloudkill,
		Cone_of_Cold,
		Conjure_Elemental,
		Contact_Other_Plane,
		Creation,
		Dominate_Person,
		Dream,
		Geas,
		Hold_Monster,
		Legend_Lore,
		Mislead,
		Modify_Memory,
		Passwall,
		Planar_Binding,
		Rarys_Telepathic_Bond,
		Scrying,
		Seeming,
		Telekinesis,
		Teleportation_Circle,
		Wall_of_Force,
		Wall_of_Stone,
		//6th Level
		Arcane_Gate,
		Chain_Lightning,
		Circle_of_Death,
		Contigency,
		Create_Undead,
		Disintegrate,
		Drawmijs_Instant_Summons,
		Eyebite,
		Flesh_to_Stone,
		Globe_of_Invulnerability,
		Guards_and_Wards,
		Magic_Jar,
		Mass_Suggestion,
		Move_Earth,
		Otilukes_Freezing_Sphere,
		Ottos_Irresistable_Dance,
		Programmed_Illusion,
		Sunbeam,
		True_Seeing,
		Wall_of_Ice,
		//7th Level
		Delayed_Blast_Fireball,
		Etherealness,
		Finger_of_Death,
		Forcecage,
		Mirage_Arcane,
		Mordenkainens_Magnificent_Mansion,
		Mordenkainens_Sword,
		Plane_Shift,
		Prismatic_Spray,
		Project_Image,
		Reverse_Gravity,
		Sequester,
		Simulacrum,
		Symbol,
		Teleport,
		//8th Level
		Antimagic_Field,
		Antipathy_Sympathy,
		Clone,
		Control_Weather,
		Demiplane,
		Dominate_Monster,
		Feeblemind,
		Incendiary_Cloud,
		Maze,
		Mind_Blank,
		Power_Word_Stun,
		Sunburst,
		Telepathy,
		Trap_the_Soul,
		//9th Level
		Astral_Projection,
		Foresight,
		Gate,
		Imprisonment,
		Meteor_Swarm,
		Power_Word_Kill,
		Prismatic_Wall,
		Shapechange,
		Time_Stop,
		True_Polymorph,
		Weird,
		Wish
	}

	private EnumSet<Bard> BCantrips = EnumSet.range(Bard.Blade_Ward, Bard.Vicious_Mockery);
	private EnumSet<Bard> B1stLevel = EnumSet.range(Bard.Animal_Friendship, Bard.Unseen_Servant);
	private EnumSet<Bard> B2ndLevel = EnumSet.range(Bard.Animal_Messenger, Bard.Zone_of_Truth);
	private EnumSet<Bard> B3rdLevel = EnumSet.range(Bard.Bestow_Curse, Bard.Tongues);
	private EnumSet<Bard> B4thLevel = EnumSet.range(Bard.Compulsion, Bard.Polymorph);
	private EnumSet<Bard> B5thLevel = EnumSet.range(Bard.Animate_Objects, Bard.Teleportation_Circle);
	private EnumSet<Bard> B6thLevel = EnumSet.range(Bard.Eyebite, Bard.True_Seeing);
}
