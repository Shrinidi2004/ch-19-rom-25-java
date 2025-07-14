class Market {

	static String marketName;
	static String location;
	static int numberOfShops;
	static double areaInAcres;
	static boolean isOpen24Hours;
	static long contactNumber;

	public static String getmarketName(){
		marketName = "City Bazaar";
		return marketName;
	}
	public static String getlocation(){
		location = "Indiranagar";
		return location;
	}
	public static int getnumberOfShops(){
		numberOfShops = 120;
		return numberOfShops;
	}
	public static double getareaInAcres(){
		areaInAcres = 3.5;
		return areaInAcres;
	}
	public static boolean getisOpen24Hours(){
		isOpen24Hours = false;
		return isOpen24Hours;
	}
	public static long getcontactNumber(){
		contactNumber = 9088776655l;
		return contactNumber;
	}
}
