class Garden {

	static String gardenName;
	static String location;
	static int numberOfPlants;
	static double areaSqMeters;
	static boolean hasFountain;
	static String maintenanceBy;

	public static String getgardenName(){
		gardenName = "Rose Garden";
		return gardenName;
	}
	public static String getlocation(){
		location = "Lalbagh";
		return location;
	}
	public static int getnumberOfPlants(){
		numberOfPlants = 1200;
		return numberOfPlants;
	}
	public static double getareaSqMeters(){
		areaSqMeters = 7500.0;
		return areaSqMeters;
	}
	public static boolean gethasFountain(){
		hasFountain = true;
		return hasFountain;
	}
	public static String getmaintenanceBy(){
		maintenanceBy = "City Corporation";
		return maintenanceBy;
	}
}