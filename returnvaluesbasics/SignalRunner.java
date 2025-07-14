class SignalRunner {
	public static void main(String[] args){
		System.out.println("Signal Type: " + Signal.getsignalType());
		System.out.println("Frequency Band: " + Signal.getfrequencyBand());
		System.out.println("Signal Strength: " + Signal.getsignalStrength());
		System.out.println("Range in Km: " + Signal.getrangeKm());
		System.out.println("Is Encrypted: " + Signal.getisEncrypted());
		System.out.println("Network ID: " + Signal.getnetworkId());
	}
}
