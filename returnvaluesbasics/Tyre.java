class Tyre {

	static String brand;
	static String type;
	static int diameterInInches;
	static double pressurePSI;
	static boolean isTubeless;
	static double price;

	public static String getbrand(){
		brand = "MRF";
		return brand;
	}
	public static String gettype(){
		type = "Radial";
		return type;
	}
	public static int getdiameterInInches(){
		diameterInInches = 17;
		return diameterInInches;
	}
	public static double getpressurePSI(){
		pressurePSI = 32.5;
		return pressurePSI;
	}
	public static boolean getisTubeless(){
		isTubeless = true;
		return isTubeless;
	}
	public static double getprice(){
		price = 5250.00;
		return price;
	}
}
