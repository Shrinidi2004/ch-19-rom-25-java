class WalkieTalkieRunner {
	public static void main(String[] args){
		System.out.println("Model: " + WalkieTalkie.getmodel());
		System.out.println("Battery Life (Hours): " + WalkieTalkie.getbatteryLifeHours());
		System.out.println("Frequency Range (MHz): " + WalkieTalkie.getfrequencyRangeMHz());
		System.out.println("Range (Meters): " + WalkieTalkie.getrangeMeters());
		System.out.println("Is Rechargeable: " + WalkieTalkie.getisRechargeable());
		System.out.println("Manufacturer: " + WalkieTalkie.getmanufacturer());
	}
}
