class Signal {

	static String signalType;
	static String frequencyBand;
	static int signalStrength;
	static float rangeKm;
	static boolean isEncrypted;
	static long networkId;

	public static String getsignalType(){
		signalType = "WiFi";
		return signalType;
	}
	public static String getfrequencyBand(){
		frequencyBand = "2.4GHz";
		return frequencyBand;
	}
	public static int getsignalStrength(){
		signalStrength = 85;
		return signalStrength;
	}
	public static float getrangeKm(){
		rangeKm = 0.15f;
		return rangeKm;
	}
	public static boolean getisEncrypted(){
		isEncrypted = true;
		return isEncrypted;
	}
	public static long getnetworkId(){
		networkId = 9876543210l;
		return networkId;
	}
}
