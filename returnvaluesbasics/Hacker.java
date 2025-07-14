class Hacker {

	static String aliasName;
	static int skillLevel;
	static String knownFor;
	static boolean isEthical;
	static String location;
	static long idCode;

	public static String getaliasName(){
		aliasName = "CyberShadow";
		return aliasName;
	}
	public static int getskillLevel(){
		skillLevel = 9;
		return skillLevel;
	}
	public static String getknownFor(){
		knownFor = "Penetration Testing";
		return knownFor;
	}
	public static boolean getisEthical(){
		isEthical = true;
		return isEthical;
	}
	public static String getlocation(){
		location = "Bangalore";
		return location;
	}
	public static long getidCode(){
		idCode = 1122334455l;
		return idCode;
	}
}

