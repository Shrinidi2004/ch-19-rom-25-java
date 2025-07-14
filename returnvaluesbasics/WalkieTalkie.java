class WalkieTalkie {

	static String model;
	static int batteryLifeHours;
	static float frequencyRangeMHz;
	static double rangeMeters;
	static boolean isRechargeable;
	static String manufacturer;

	public static String getmodel(){
		model = "WT-920 Pro";
		return model;
	}
	public static int getbatteryLifeHours(){
		batteryLifeHours = 14;
		return batteryLifeHours;
	}
	public static float getfrequencyRangeMHz(){
		frequencyRangeMHz = 462.5f;
		return frequencyRangeMHz;
	}
	public static double getrangeMeters(){
		rangeMeters = 1200.0;
		return rangeMeters;
	}
	public static boolean getisRechargeable(){
		isRechargeable = true;
		return isRechargeable;
	}
	public static String getmanufacturer(){
		manufacturer = "Motorola";
		return manufacturer;
	}
}

