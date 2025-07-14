class RiverRunner {
	public static void main(String[] args){
		System.out.println("River Name: " + River.getriverName());
		System.out.println("Length (km): " + River.getlengthKm());
		System.out.println("Number of Bridges: " + River.getnumberOfBridges());
		System.out.println("Is Polluted: " + River.getisPolluted());
		System.out.println("Origin State: " + River.getoriginState());
		System.out.println("Ends At: " + River.getendPoint());
	}
}
