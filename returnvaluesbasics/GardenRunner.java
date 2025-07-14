class GardenRunner {
	public static void main(String[] args){
		System.out.println("Garden Name: " + Garden.getgardenName());
		System.out.println("Location: " + Garden.getlocation());
		System.out.println("Number of Plants: " + Garden.getnumberOfPlants());
		System.out.println("Area (Sq. Meters): " + Garden.getareaSqMeters());
		System.out.println("Has Fountain: " + Garden.gethasFountain());
		System.out.println("Maintained By: " + Garden.getmaintenanceBy());
	}
}
